package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum OccurrenceDefiningCode implements EnumValueSet {
  RECURRENCE("Recurrence", "New occurrence of the same problem or diagnosis after a previous episode was resolved.", "local", "at0096");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  OccurrenceDefiningCode(String value, String description, String terminologyId, String code) {
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
