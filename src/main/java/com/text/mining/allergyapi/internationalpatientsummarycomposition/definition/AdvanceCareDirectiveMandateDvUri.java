package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;
import java.net.URI;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.319481-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_URI")
public class AdvanceCareDirectiveMandateDvUri implements RMEntity, AdvanceCareDirectiveMandateChoice {
  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Mandate/Mandate
   * Description: Description of any legislation or other authoritative guidance that apply.
   */
  @Path("|value")
  private URI mandateValue;

  public void setMandateValue(URI mandateValue) {
     this.mandateValue = mandateValue;
  }

  public URI getMandateValue() {
     return this.mandateValue ;
  }
}
