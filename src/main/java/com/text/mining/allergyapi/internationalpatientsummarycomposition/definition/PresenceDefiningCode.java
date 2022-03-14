package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningCode implements EnumValueSet {
  PRESENT("Present", "The finding is observed in the image.", "local", "at0035"),

  ABSENT("Absent", "The finding is not observed in the image.", "local", "at0036"),

  INDETERMINATE("Indeterminate", "It is not possible to determine if the finding is present or absent.", "local", "at0037");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningCode(String value, String description, String terminologyId, String code) {
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
