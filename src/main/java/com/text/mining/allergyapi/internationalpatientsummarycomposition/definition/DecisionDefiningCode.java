package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DecisionDefiningCode implements EnumValueSet {
  PERMITTED("Permitted", "The treatment is permitted, if clinically appropriate.", "local", "at0018"),

  NOT_PERMITTED("Not permitted", "The treatment is not permitted.", "local", "at0019");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DecisionDefiningCode(String value, String description, String terminologyId, String code) {
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
