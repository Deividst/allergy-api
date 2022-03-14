package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ComparisonToPreviousDefiningCode implements EnumValueSet {
  IMPROVING("Improving", "The finding is improving compared to previous imaging examinations.", "local", "at0030"),

  UNCHANGED("Unchanged", "The finding is unchanged compared to previous imaging examinations.", "local", "at0031"),

  WORSENING("Worsening", "The finding is worsening compared to previous imaging examinations.", "local", "at0032");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ComparisonToPreviousDefiningCode(String value, String description, String terminologyId,
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
