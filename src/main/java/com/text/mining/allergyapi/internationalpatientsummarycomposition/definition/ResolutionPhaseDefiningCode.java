package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ResolutionPhaseDefiningCode implements EnumValueSet {
  RELAPSED("Relapsed", "Problem or diagnosis has deteriorated after a period of temporary improvement.", "local", "at0097"),

  RESOLVED("Resolved", "Problem or diagnosis has completed the normal phases of restoration or healing and can be considered resolved.", "local", "at0084");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ResolutionPhaseDefiningCode(String value, String description, String terminologyId, String code) {
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
