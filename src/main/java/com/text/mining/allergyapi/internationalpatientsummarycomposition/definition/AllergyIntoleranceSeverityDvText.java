package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.915029-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class AllergyIntoleranceSeverityDvText implements RMEntity, AllergyIntoleranceSeverityChoice {
  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Severity/Severity
   * Description: Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
   */
  @Path("|value")
  private String severityValue;

  public void setSeverityValue(String severityValue) {
     this.severityValue = severityValue;
  }

  public String getSeverityValue() {
     return this.severityValue ;
  }
}
