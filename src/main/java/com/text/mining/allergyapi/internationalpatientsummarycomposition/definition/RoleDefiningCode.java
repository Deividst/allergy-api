package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RoleDefiningCode implements EnumValueSet {
  ADJUVANT("Adjuvant", "Constituent whose primary function is to modify the activity of an active constituent. An adjuvant constituent itself may or may not be therapeutically active.", "local", "at0083"),

  EXCIPIENT("Excipient", "Constituent that is inert in relation to the intended activity of the medicinal product.", "local", "at0084"),

  THERAPEUTIC("Therapeutic", "Constituent that alone or in combination with one or more other ingredients is considered to fulfil the intended activity of a medicinal product.", "local", "at0080");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RoleDefiningCode(String value, String description, String terminologyId, String code) {
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
