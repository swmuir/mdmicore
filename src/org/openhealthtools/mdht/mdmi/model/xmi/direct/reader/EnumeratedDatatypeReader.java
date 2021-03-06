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
package org.openhealthtools.mdht.mdmi.model.xmi.direct.reader;

import java.util.*;

import javax.xml.stream.*;

import org.openhealthtools.mdht.mdmi.model.*;
import org.openhealthtools.mdht.mdmi.model.raw.*;
import org.openhealthtools.mdht.mdmi.model.validate.*;
import org.openhealthtools.mdht.mdmi.model.xmi.*;

public class EnumeratedDatatypeReader extends MdmiDatatypeReader<DTSEnumerated> {
   private static final EnumerationLiteralReader s_literalReader = new EnumerationLiteralReader(
                                                                       EnumeratedDatatypeValidate.s_literalsName);

   public EnumeratedDatatypeReader( String nodeName ) {
      super(nodeName);
   }

   public EnumeratedDatatypeReader() {
      super();
   }

   @Override
   public boolean canRead( XMLStreamReader reader ) {
      return super.canRead(reader) && isEnumeratedType(reader);
   }

   private boolean isEnumeratedType( XMLStreamReader reader ) {
      return DTSEnumerated.class.getSimpleName().equals(XMIReaderUtil.getType(reader));
   }

   @Override
   protected void readSingleChildElement( XMLStreamReader reader, ParsingInfo parsingInfo, RawRoot root,
         Map<String, Object> objectMap, DTSEnumerated object ) throws XMLStreamException {

      if( s_literalReader.canRead(reader) ) {
         EnumerationLiteral literal = s_literalReader.readAndBuild(reader, parsingInfo, root, objectMap);
         object.addLiteral(literal);
      }
   }

   @Override
   protected DTSEnumerated createObject( XMLStreamReader reader ) {
      return new DTSEnumerated();
   }
}
