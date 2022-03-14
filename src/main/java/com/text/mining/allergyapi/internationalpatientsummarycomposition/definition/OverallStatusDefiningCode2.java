package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum OverallStatusDefiningCode2 implements EnumValueSet {
  CURRENT_DRINKER("Current drinker", "Individual is a current consumer of alcohol.", "local", "at0003"),

  FORMER_DRINKER("Former drinker", "Individual has previously consumed alcohol but is not a current drinker.", "local", "at0005"),

  LIFETIME_NON_DRINKER("Lifetime non-drinker", "Individual has never consumed alcohol.", "local", "at0006");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  OverallStatusDefiningCode2(String value, String description, String terminologyId, String code) {
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
