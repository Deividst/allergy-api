package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum OverallStatusDefiningCode implements EnumValueSet {
  NEVER_SMOKED("Never smoked", "Individual has never smoked any type of tobacco.", "local", "at0006"),

  FORMER_SMOKER("Former smoker", "Individual has previously smoked tobacco but is not a current smoker.", "local", "at0005"),

  CURRENT_SMOKER("Current smoker", "Individual is a current smoker of tobacco.", "local", "at0003");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  OverallStatusDefiningCode(String value, String description, String terminologyId, String code) {
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
