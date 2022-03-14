package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CategoryDefiningCode implements EnumValueSet {
  MULTI_INGREDIENT_PRODUCT("Multi-ingredient product", "The medication or medication component consists of a number of active ingredients which are pre-combined into a single form such as a tablet, cream or powder by the manufacturer, for example Paracetamol/codeine.", "local", "at0144"),

  COMBINATION_PRODUCT("Combination product", "The medication or medication component consists of a number of separate products which are pre-packaged by the manufacturer, for example Canesten Combi.", "local", "at0001"),

  SINGLE_INGREDIENT_PRODUCT("Single-ingredient product", "The medication or medication component is a manufactured product containing a single active ingredient.", "local", "at0145"),

  AD_HOC_MIXTURE("Ad-hoc mixture", "The medication or medication component is composed of a mixture of ingredients specified within the order. These are typically prepared by pharmacy or ward personnel to suit individual patients.", "local", "at0143"),

  INGREDIENT("Ingredient", "The medication or medication component is an individual ingredient of the medication. This term is used when the archetype is nested within a parent instance of itself, to describe the individual ingredients of a medication.", "local", "at0146");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CategoryDefiningCode(String value, String description, String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
