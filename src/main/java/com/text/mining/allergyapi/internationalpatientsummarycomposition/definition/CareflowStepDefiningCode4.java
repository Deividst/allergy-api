package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CareflowStepDefiningCode4 implements EnumValueSet {
  CARE_PLAN_DEVELOPED("Care Plan Developed", "Care plan components identified and documented.", "openehr", "at0008"),

  CARE_PLAN_CANCELLED("Care Plan Cancelled", "Care plan has been cancelled prior to commencement.", "openehr", "at0033"),

  CARE_PLAN_COMMENCED("Care Plan Commenced", "Care plan activities commenced and in progress.", "openehr", "at0006"),

  CARE_PLAN_COMPLETED("Care Plan Completed", "All activities related to the care plan have been reconciled or completed.", "openehr", "at0013"),

  CARE_PLAN_NEED_IDENTIFIED("Care plan Need Identified", "Need for a care plan has been identified.", "openehr", "at0003"),

  CARE_PLAN_REVIEWED("Care Plan Reviewed", "Care plan has been reviewed.", "openehr", "at0020"),

  CARE_PLAN_SUSPENDED("Care Plan Suspended", "Care plan is temporarily suspended but intended to resume at a later date.", "openehr", "at0035"),

  CARE_PLAN_ABORTED("Care Plan Aborted", "Care plan has been aborted.", "openehr", "at0032"),

  CARE_PLAN_POSTPONED("Care Plan Postponed", "Commencement of care plan has been temporarily postponed to a future date.", "openehr", "at0034"),

  CARE_PLAN_SCHEDULED("Care Plan Scheduled", "Care plan has been scheduled.", "openehr", "at0018"),

  CARE_PLAN_EXPIRED("Care Plan Expired", "Care plan duration has passed the 'Expiry Date'.", "openehr", "at0010");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CareflowStepDefiningCode4(String value, String description, String terminologyId, String code) {
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
