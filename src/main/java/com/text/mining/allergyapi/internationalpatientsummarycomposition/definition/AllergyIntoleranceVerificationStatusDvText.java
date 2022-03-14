package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.918746-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class AllergyIntoleranceVerificationStatusDvText implements RMEntity, AllergyIntoleranceVerificationStatusChoice {
  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Verification status/Verification status
   * Description: Assertion about the certainty of the propensity, or potential future risk, of the identified 'Substance' to cause a reaction.
   */
  @Path("|value")
  private String verificationStatusValue;

  public void setVerificationStatusValue(String verificationStatusValue) {
     this.verificationStatusValue = verificationStatusValue;
  }

  public String getVerificationStatusValue() {
     return this.verificationStatusValue ;
  }
}
