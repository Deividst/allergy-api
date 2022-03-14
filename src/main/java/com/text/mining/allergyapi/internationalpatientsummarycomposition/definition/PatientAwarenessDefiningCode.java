package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PatientAwarenessDefiningCode implements EnumValueSet {
  PATIENT_AWARE_OF_THE_DECISION_S("Patient aware of the decision/s", "The patient is aware of the limitation of treatment decision/s.", "local", "at0023"),

  PATIENT_NOT_AWARE_OF_THE_DECISION_S("Patient not aware of the decision/s", "The patient is not aware of the limitation of treatment decision/s.", "local", "at0024");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PatientAwarenessDefiningCode(String value, String description, String terminologyId,
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
