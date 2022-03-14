package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RemissionStatusDefiningCode implements EnumValueSet {
  IN_REMISSION("In remission", "No ongoing signs or symptoms of the disease have been identified.", "local", "at0090");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RemissionStatusDefiningCode(String value, String description, String terminologyId, String code) {
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
