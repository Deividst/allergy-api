package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CurrentStateDefiningCode3 implements EnumValueSet {
  POSTPONED("postponed", "postponed", "openehr", "527"),

  COMPLETED("completed", "completed", "openehr", "532"),

  CANCELLED("cancelled", "cancelled", "openehr", "528"),

  ABORTED("aborted", "aborted", "openehr", "531"),

  PLANNED("planned", "planned", "openehr", "526"),

  ACTIVE("active", "active", "openehr", "245");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CurrentStateDefiningCode3(String value, String description, String terminologyId, String code) {
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
