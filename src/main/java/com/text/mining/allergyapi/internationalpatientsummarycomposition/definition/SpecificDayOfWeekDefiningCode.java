package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SpecificDayOfWeekDefiningCode implements EnumValueSet {
  MONDAY("Monday", "The activity should take place on Monday.", "local", "at0007"),

  THURSDAY("Thursday", "The activity should take place on Thursday.", "local", "at0017"),

  WEDNESDAY("Wednesday", "The activity should take place on Wednesday.", "local", "at0016"),

  SUNDAY("Sunday", "The activity should take place on Sunday.", "local", "at0020"),

  SATURDAY("Saturday", "The activity should take place on Saturday.", "local", "at0019"),

  FRIDAY("Friday", "The activity should take place on Friday.", "local", "at0018"),

  TUESDAY("Tuesday", "The activity should take place on Tuesday.", "local", "at0008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SpecificDayOfWeekDefiningCode(String value, String description, String terminologyId,
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
