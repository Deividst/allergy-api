package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CareflowStepDefiningCode implements EnumValueSet {
  MEDICATION_RECOMMENDED("Medication recommended", "The medication has been recommended but no steps have been taken to initiate prescribing.", "openehr", "at0109"),

  ADMINISTRATIONS_SUSPENDED("Administrations suspended", "The administration of the medication has been suspended until further notice. No further doses should be given until the restart date or conditions have been met. When setting the date/conditions for restart after suspending, a step from ‘Administrations suspended’ and back to 'Medication start date/condition set' should be performed.", "openehr", "at0009"),

  DOSE_ADMINISTERED("Dose administered", "A single administration of the medication has taken place.", "openehr", "at0006"),

  MEDICATION_COURSE_COMPLETED("Medication course completed", "The medication course has been completed as planned.", "openehr", "at0007");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CareflowStepDefiningCode(String value, String description, String terminologyId, String code) {
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
