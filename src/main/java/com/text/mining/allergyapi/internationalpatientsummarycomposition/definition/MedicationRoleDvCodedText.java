package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.806632-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_CODED_TEXT")
public class MedicationRoleDvCodedText implements RMEntity, MedicationRoleChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Role/Role
   * Description: The role of the medication or medication component within a mixture.
   */
  @Path("|defining_code")
  private RoleDefiningCode roleDefiningCode;

  public void setRoleDefiningCode(RoleDefiningCode roleDefiningCode) {
     this.roleDefiningCode = roleDefiningCode;
  }

  public RoleDefiningCode getRoleDefiningCode() {
     return this.roleDefiningCode ;
  }
}
