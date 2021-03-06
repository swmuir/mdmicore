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
package org.openhealthtools.mdht.mdmi.model.csv.reader.row;

public class CSVBagRowReader extends CSVNodeReader {
   public static final String    s_uniqueName   = "isUnique";
   public static final String    s_orderedName  = "isOrdered";
   private static final String[] s_simpleFields = { s_uniqueName, s_orderedName };

   public CSVBagRowReader() {
      super(s_simpleFields);
   }
}
