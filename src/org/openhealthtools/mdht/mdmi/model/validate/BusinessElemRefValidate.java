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
package org.openhealthtools.mdht.mdmi.model.validate;

import org.openhealthtools.mdht.mdmi.model.*;

public class BusinessElemRefValidate implements IModelValidate<MdmiBusinessElementReference> {
   public static final String s_nameField           = "name";
   public static final String s_idField             = "uniqueIdentifier";
   public static final String s_refField            = "reference";
   public static final String s_domainDictField     = "domainDictionaryReference";
   public static final String s_refTypeField        = "referenceDatatype";
   public static final String s_descField           = "description";
   public static final String s_ruleName            = "businessRules";
   public static final String s_isReadonly          = "isReadonly";
   public static final String s_enumValueSetField   = "enumValueSetField";
   public static final String s_enumValueField      = "enumValueField";
   public static final String s_enumValueDescrField = "enumValueDescrField";
   public static final String s_enumValueSet        = "enumValueSet";

   @Override
   public void validate( MdmiBusinessElementReference object, ModelValidationResults results ) {
      if( ValidateHelper.isEmptyField(object.getName()) ) {
         results.addErrorFromRes(object, s_nameField);
      }
      if( ValidateHelper.isEmptyField(object.getUniqueIdentifier()) ) {
         results.addErrorFromRes(object, s_idField, object.getName());
      }
      if( object.getReference() == null ) {
         results.addErrorFromRes(object, s_refField, object.getName());
      }
      if( object.getDomainDictionaryReference() == null ) {
         results.addErrorFromRes(object, s_domainDictField, object.getName());
      }
      if( object.getReferenceDatatype() == null ) {
         results.addErrorFromRes(object, s_refTypeField, object.getName());
      }
      String vsf = object.getEnumValueSetField();
      String vf  = object.getEnumValueField();
      String vdf = object.getEnumValueDescrField();
      String vs  = object.getEnumValueSet();
      if( null != vf && 0 < vf.trim().length() ) {
      	if( null == vs || vs.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueSet, object.getName());
      	if( null == vsf || vsf.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueSetField, object.getName());
      }
      if( null != vs && 0 < vs.trim().length() ) {
      	if( null == vf || vf.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueField, object.getName());
      	if( null == vsf || vsf.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueSetField, object.getName());
      }
      if( null != vsf && 0 < vsf.trim().length() ) {
      	if( null == vf || vf.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueField, object.getName());
      	if( null == vs || vs.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueSet, object.getName());
      }
      if( null != vdf && 0 < vdf.trim().length() ) {
      	if( null == vf || vf.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueField, object.getName());
      	if( null == vs || vs.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueSet, object.getName());
      	if( null == vsf || vsf.trim().length() <= 0 )
            results.addErrorFromRes(object, s_enumValueSetField, object.getName());
      }
   }
}
