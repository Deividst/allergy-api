package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.807588-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class MedicationRoleDvText implements RMEntity, MedicationRoleChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Role/Role
   * Description: The role of the medication or medication component within a mixture.
   */
  @Path("|value")
  private String roleValue;

  public void setRoleValue(String roleValue) {
     this.roleValue = roleValue;
  }

  public String getRoleValue() {
     return this.roleValue ;
  }
}
