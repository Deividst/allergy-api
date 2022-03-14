package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.279177-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_IDENTIFIER")
public class ServiceRequestReceiverOrderIdentifierDvIdentifier implements RMEntity, ServiceRequestReceiverOrderIdentifierChoice {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Receiver order identifier/Receiver order identifier
   * Description: The local identifier assigned to the request by the clinician or organisation receiving the request for service.
   */
  @Path("")
  private DvIdentifier receiverOrderIdentifier;

  public void setReceiverOrderIdentifier(DvIdentifier receiverOrderIdentifier) {
     this.receiverOrderIdentifier = receiverOrderIdentifier;
  }

  public DvIdentifier getReceiverOrderIdentifier() {
     return this.receiverOrderIdentifier ;
  }
}
