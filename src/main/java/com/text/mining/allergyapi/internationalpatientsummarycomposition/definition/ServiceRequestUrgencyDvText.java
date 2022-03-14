package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.272337-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class ServiceRequestUrgencyDvText implements RMEntity, ServiceRequestUrgencyChoice {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Urgency/Urgency
   * Description: Urgency of the request for service.
   */
  @Path("|value")
  private String urgencyValue;

  public void setUrgencyValue(String urgencyValue) {
     this.urgencyValue = urgencyValue;
  }

  public String getUrgencyValue() {
     return this.urgencyValue ;
  }
}
