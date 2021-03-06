/*******************************************************************************
* Copyright (c) 2012 Firestar Software, Inc.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Firestar Software, Inc. - initial API and implementation
*
* Author:
*     Wency Chingcuangco
*
*******************************************************************************/
package org.openhealthtools.mdht.mdmi.model.syntax;

import java.util.*;
import org.apache.xerces.xs.*;
import org.apache.xerces.impl.xs.*;
import org.openhealthtools.mdht.mdmi.model.*;

public class XSDReader {
	private static Map<String,Node> m_visited = new HashMap<String,Node>();
	private static Map<String,Node> m_roots = new HashMap<String,Node>();
	private static Counter bagCounter = new Counter();
	private static Counter choiceCounter = new Counter();

    private static final String BAG_TYPE = "BagType";
    private static final String CHOICE_TYPE = "ChoiceType";

	/**
    * parse - parses an XSD file and returns a list of root MDMI nodes.
    *
    * @param uri	The uri of the XSD file to be parsed.
    * @return		A list of root MDMI Node objects.
    */
	public static List<Node> parse(String uri) {
		XSLoader xsLoader = new XSLoaderImpl();
		XSModel xsModel = xsLoader.loadURI(uri);
		XSNamedMap elMap = xsModel.getComponents(XSConstants.ELEMENT_DECLARATION);

		// clear node list/map
		m_visited.clear();
		m_roots.clear();

        bagCounter.reset();
        choiceCounter.reset();

		// start recursively processing elements (start with ones in the element map)
		for (int i=0; i < elMap.size(); i++) {
			XSElementDeclaration element = (XSElementDeclaration) elMap.item(i);

			// if we haven't visited this element, add it as a possible root
            //TODO: fix cache issue
			if (!m_visited.containsKey(element.getName()))
				m_roots.put(element.getName(), process(element));
		}

		return new ArrayList<Node>(m_roots.values());
	}

   /**
    * process - recursively parses elements in an XSD and builds the corresponding Node tree.
    *
    * @param el		The schema element to be processed.
    * @return		The corresponding MDMI Node.
    */
	private static Node process(XSElementDeclaration el) {
		XSTypeDefinition xtd = el.getTypeDefinition();
		String elName =  el.getName();
		Node node = null;

		if (xtd.getTypeCategory() == XSTypeDefinition.COMPLEX_TYPE) {
			XSComplexTypeDecl xtdc = (XSComplexTypeDecl) xtd;
			XSParticle particle = xtdc.getParticle();
			XSTerm term = (particle == null ? null : particle.getTerm());
			List<Node> children = null;

			if (term instanceof XSModelGroup && ((XSModelGroup) term).getCompositor() == XSModelGroup.COMPOSITOR_CHOICE) {
				node = new Choice();
				children = ((Choice)node).getNodes();
			} else {
				node = new Bag();
				children = ((Bag)node).getNodes();
			}

			node.setName(capitalize(elName));
			node.setLocation(elName);
			node.setLocationExpressionLanguage("XPath");

			m_visited.put(elName, node);

			// add attribute nodes
            processAttributes(xtdc, node, children);

			// traverse child elements
			if (term instanceof XSModelGroup) {
				XSObjectList particles = ((XSModelGroup)term).getParticles();
				for (int i=0; i < particles.getLength(); i++) {
                    XSParticle childParticle = (XSParticle) particles.get(i);
                    XSTerm childTerm = childParticle.getTerm();
                    String childName = childTerm.getName();
                    if (childTerm instanceof XSElementDeclaration) {
                        Node childNode = null;

                        if (m_roots.containsKey(childName)) {
                            childNode = m_roots.get(childName);
                            m_roots.remove(childName);
                        } else if (m_visited.containsKey(childName)) {
                            childNode = clone(m_visited.get(childName));
                        } else {
                            childNode = process((XSElementDeclaration) childTerm);
                        }
                        childNode.setMinOccurs(childParticle.getMinOccurs());
                        childNode.setMaxOccurs(childParticle.getMaxOccurs());
                        childNode.setParentNode(node);
                        children.add(childNode);
                    } else if (childTerm instanceof XSModelGroup) {//Anonymous type declaration
                        Node childNode = null;
                        List<Node> childChildren = null;

                        if (((XSModelGroup) childTerm).getCompositor() == XSModelGroup.COMPOSITOR_CHOICE) {
                            childNode = new Choice();
                            childChildren = ((Choice) childNode).getNodes();
                            childNode.setName(node.getName() + CHOICE_TYPE + choiceCounter.getNext());
                        } else {
                            childNode = new Bag();
                            childChildren = ((Bag) childNode).getNodes();
                            childNode.setName(node.getName() + BAG_TYPE + bagCounter.getNext());
                        }

                        childNode.setLocation("");
                        childNode.setLocationExpressionLanguage("XPath");
                        childNode.setMinOccurs(childParticle.getMinOccurs());
                        childNode.setMaxOccurs(childParticle.getMaxOccurs());
                        childNode.setParentNode(node);
                        children.add(childNode);

                        // add children
                        XSObjectList childParticles = ((XSModelGroup) childTerm).getParticles();
                        for (int j = 0; j < childParticles.getLength(); j++) {
                            XSParticle childChildParticle = (XSParticle) childParticles.get(j);
                            XSTerm childChildTerm = childChildParticle.getTerm();
                            String childChildName = childChildTerm.getName();
                            if (childChildTerm instanceof XSElementDeclaration) {
                                Node childChildNode = null;

                                if (m_roots.containsKey(childChildName)) {
                                    childChildNode = m_roots.get(childChildName);
                                    m_roots.remove(childChildName);
                                } else if (m_visited.containsKey(childChildName)) {
                                    childChildNode = clone(m_visited.get(childChildName));
                                } else {
                                    childChildNode = process((XSElementDeclaration) childChildTerm);
                                }
                                childChildNode.setMinOccurs(childChildParticle.getMinOccurs());
                                childChildNode.setMaxOccurs(childChildParticle.getMaxOccurs());
                                childChildNode.setParentNode(childNode);
                                childChildren.add(childChildNode);
                            }
                        }
                    }
                }
			}

			// sometimes, the parser thinks simple types are complex
			if (children.size() == 0) {
				Node simpleNode = new LeafSyntaxTranslator();
				simpleNode.setName(node.getName());
				simpleNode.setLocation(node.getLocation());
				simpleNode.setLocationExpressionLanguage(node.getLocationExpressionLanguage());
				m_visited.put(elName, simpleNode);
				node = simpleNode;
			}
		} else {
			node = new LeafSyntaxTranslator();
			node.setName(capitalize(elName));
			node.setLocation(elName);
			node.setLocationExpressionLanguage("XPath");
		}

		return node;
	}

    private static void processAttributes(XSComplexTypeDecl xtdc, Node parent, List<Node> children) {
        XSObjectList attrs = xtdc.getAttributeUses();
        for (int i=0; i < attrs.getLength(); i++) {
            XSAttributeUse attrUse = (XSAttributeUse) attrs.item(i);
            XSAttributeDeclaration attr = attrUse.getAttrDeclaration();
            String attrName = attr.getName();

            Node attrNode = new LeafSyntaxTranslator();
            attrNode.setName(capitalize(attrName));
            attrNode.setLocation("@"+attrName);
            attrNode.setLocationExpressionLanguage("XPath");
            if (!attrUse.getRequired())
                attrNode.setMinOccurs(0);
            attrNode.setParentNode(parent);
            children.add(attrNode);
        }
    }

   /**
    * clone - recursively copies a Node tree
    *
    * @param node	The root Node of the tree to be copied.
    * @return		A copy of the original Node tree.
    */
	private static Node clone(Node node) {
		Node newNode = null;

		if (node instanceof LeafSyntaxTranslator)
			newNode = new LeafSyntaxTranslator();
		else if (node instanceof Choice)
			newNode = new Choice();
		else
			newNode = new Bag();

		newNode.setName(node.getName());
		newNode.setDescription(node.getDescription());
		newNode.setLocation(node.getLocation());
		newNode.setLocationExpressionLanguage(node.getLocationExpressionLanguage());
		newNode.setMinOccurs(node.getMinOccurs());
		newNode.setMaxOccurs(node.getMaxOccurs());
		newNode.setFieldName(node.getFieldName());

		List<Node> children = null;
		if (node instanceof Bag)
			children = ((Bag)node).getNodes();
		else if (node instanceof Choice)
			children = ((Choice)node).getNodes();

		for (int i=0; children != null && i < children.size(); i++) {
			Node newChild = clone(children.get(i));
			newChild.setParentNode(newNode);
			if (newNode instanceof Choice)
				((Choice)newNode).getNodes().add(newChild);
			else
				((Bag)newNode).getNodes().add(newChild);
		}

		return newNode;
	}

	private static String capitalize(String str) {
		char[] chars = str.toCharArray();

		if (Character.isLetter(chars[0]))
			chars[0] = Character.toUpperCase(chars[0]);

		return  String.valueOf(chars);
	}

    private static class Counter {
        private int value = 0;

        public int getNext() {
            return value++;
        }

        public void reset() {
            value = 0;
        }
    }
}
