package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StatusDefiningCode2 implements EnumValueSet {
  ABSENT("Absent", "The individual does not have an advance care directive.", "local", "at0045"),

  UNKNOWN("Unknown", "It is not known whether the individual has an advance care directive.", "local", "at0047"),

  PRESENT("Present", "The individual has an advance care directive.", "local", "at0044");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  StatusDefiningCode2(String value, String description, String terminologyId, String code) {
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
