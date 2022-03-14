package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StatusDefiningCode3 implements EnumValueSet {
  NO_LIMITATION_OF_TREATMENT("No limitation of treatment", "For full resuscitation. No limitations on future treatment options have been recorded.", "local", "at0003"),

  LIMITATION_OF_MEDICAL_TREATMENT("Limitation of medical treatment", "Limitations on future treatment options have been recorded in an advanced care directive or similar.", "local", "at0004"),

  ALLOW_NATURAL_DEATH("Allow natural death", "Do not attempt resuscitation. Comfort during the dying process.", "local", "at0005");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  StatusDefiningCode3(String value, String description, String terminologyId, String code) {
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
