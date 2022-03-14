package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum UrgencyDefiningCode implements EnumValueSet {
  EMERGENCY("Emergency", "The request requires immediate attention.", "local", "at0136"),

  URGENT("Urgent", "The request requires prioritised attention.", "local", "at0137"),

  ROUTINE("Routine", "The request does not require prioritised scheduling.", "local", "at0138");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  UrgencyDefiningCode(String value, String description, String terminologyId, String code) {
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
