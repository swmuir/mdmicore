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
*     Gabriel Oancea
*
*******************************************************************************/
package org.openhealthtools.mdht.mdmi;

import org.openhealthtools.mdht.mdmi.model.*;

/**
 * Implemented by classes that can construct a semantic MDMI model from the syntax tree, and vice versa.
 */
public interface ISemanticParser {

   /**
    * Construct a semantic model, from the given syntax tree and the message model. The semantic model is represented by
    * the elements set (eset), and may be partially populated.
    * 
    * @param mdl The MessageModel that applies.
    * @param root The syntax tree input.
    * @param eset The element set as defined by the message model (IN-OUT parameter).
    */
   public void buildSemanticModel( MessageModel mdl, ISyntaxNode root, ElementValueSet eset );

   /**
    * Create a syntax tree represented by the YNode returned, from the given semantic content (element set) and the
    * message model.
    * 
    * @param mdl The MessageModel that applies.
    * @param eset The semantic content (element set).
    * @return The syntax tree corresponding to the
    */
   public ISyntaxNode createSyntacticModel( MessageModel mdl, ElementValueSet eset );
} // ISemanticParser

