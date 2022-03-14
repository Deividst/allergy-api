package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.280218-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class ServiceRequestRequesterOrderIdentifierDvText implements RMEntity, ServiceRequestRequesterOrderIdentifierChoice {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Requester order identifier/Requester order identifier
   * Description: The local identifier assigned by the requesting clinical system.
   */
  @Path("|value")
  private String requesterOrderIdentifierValue;

  public void setRequesterOrderIdentifierValue(String requesterOrderIdentifierValue) {
     this.requesterOrderIdentifierValue = requesterOrderIdentifierValue;
  }

  public String getRequesterOrderIdentifierValue() {
     return this.requesterOrderIdentifierValue ;
  }
}
