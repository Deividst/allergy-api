package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum TypeOfLimitationDefiningCode implements EnumValueSet {
  BLOOD_PRODUCTS("Blood products", "*", "local", "at0014"),

  DIALYSIS("Dialysis", "*", "local", "at0013"),

  INTRAVENOUS_FLUIDS("Intravenous fluids", "*", "local", "at0016"),

  ENDOTRACHEAL_INTUBATION("Endotracheal intubation", "*", "local", "at0009"),

  VASOPRESSOR_THERAPY("Vasopressor therapy", "*", "local", "at0011"),

  ANTIBIOTICS("Antibiotics", "*", "local", "at0015"),

  PARENTERAL_OR_ARTIFICIAL_NUTRITION("Parenteral or artificial nutrition", "*", "local", "at0012"),

  MECHANICAL_VENTILATION("Mechanical ventilation", "*", "local", "at0010"),

  CARDIOPULMONARY_RESUSCITATION("Cardiopulmonary resuscitation", "Lifesaving emergency procedure involving chest compressions and artificial ventilation.", "local", "at0008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  TypeOfLimitationDefiningCode(String value, String description, String terminologyId,
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
