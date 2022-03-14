package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.319193-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class AdvanceCareDirectiveMandateDvText implements RMEntity, AdvanceCareDirectiveMandateChoice {
  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Mandate/Mandate
   * Description: Description of any legislation or other authoritative guidance that apply.
   */
  @Path("|value")
  private String mandateValue;

  public void setMandateValue(String mandateValue) {
     this.mandateValue = mandateValue;
  }

  public String getMandateValue() {
     return this.mandateValue ;
  }
}
