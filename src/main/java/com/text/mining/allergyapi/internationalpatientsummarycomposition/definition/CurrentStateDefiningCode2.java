package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CurrentStateDefiningCode2 implements EnumValueSet {
  ACTIVE("active", "active", "openehr", "245");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CurrentStateDefiningCode2(String value, String description, String terminologyId, String code) {
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
