package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CareflowStepDefiningCode3 implements EnumValueSet {
  PROCEDURE_COMPLETED("Procedure completed", "The procedure has been performed and all associated clinical activities completed.", "openehr", "at0043"),

  PROCEDURE_CANCELLED("Procedure cancelled", "The planned procedure has been cancelled prior to commencement.", "openehr", "at0039"),

  PROCEDURE_REQUEST_SENT("Procedure request sent", "Request for procedure sent.", "openehr", "at0007"),

  PROCEDURE_PLANNED("Procedure planned", "The procedure to be undertaken is planned.", "openehr", "at0004"),

  PROCEDURE_COMMENCED("Procedure commenced", "The procedure, or subprocedure in a multicomponent procedure, has been commenced.", "openehr", "at0068"),

  PROCEDURE_POSTPONED("Procedure postponed", "The procedure has been postponed.", "openehr", "at0038"),

  PROCEDURE_ABORTED("Procedure aborted", "The procedure has been aborted.", "openehr", "at0041");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CareflowStepDefiningCode3(String value, String description, String terminologyId, String code) {
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
