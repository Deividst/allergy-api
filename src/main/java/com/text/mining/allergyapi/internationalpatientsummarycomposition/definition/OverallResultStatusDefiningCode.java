package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum OverallResultStatusDefiningCode implements EnumValueSet {
  CANCELLED_ABORTED("Cancelled / Aborted", "The result is not available because the examination was not started or completed.", "local", "at0013"),

  INTERIM("Interim", "This is an initial or interim result: data may be missing or verification not been performed.", "local", "at0010"),

  FINAL("Final", "The result is complete and verified by the responsible radiologist.", "local", "at0011"),

  AMENDED("Amended", "The result has been modified subsequent to being Final, and is complete and verified by the radiologist.", "local", "at0012"),

  REGISTERED("Registered", "No result yet available.", "local", "at0009");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  OverallResultStatusDefiningCode(String value, String description, String terminologyId,
      String code) {
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
