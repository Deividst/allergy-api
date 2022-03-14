package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.278901-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class ServiceRequestReceiverOrderIdentifierDvText implements RMEntity, ServiceRequestReceiverOrderIdentifierChoice {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Receiver order identifier/Receiver order identifier
   * Description: The local identifier assigned to the request by the clinician or organisation receiving the request for service.
   */
  @Path("|value")
  private String receiverOrderIdentifierValue;

  public void setReceiverOrderIdentifierValue(String receiverOrderIdentifierValue) {
     this.receiverOrderIdentifierValue = receiverOrderIdentifierValue;
  }

  public String getReceiverOrderIdentifierValue() {
     return this.receiverOrderIdentifierValue ;
  }
}
