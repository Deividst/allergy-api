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
    date = "2021-09-27T22:12:02.280526-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_IDENTIFIER")
public class ServiceRequestRequesterOrderIdentifierDvIdentifier implements RMEntity, ServiceRequestRequesterOrderIdentifierChoice {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Requester order identifier/Requester order identifier
   * Description: The local identifier assigned by the requesting clinical system.
   */
  @Path("")
  private DvIdentifier requesterOrderIdentifier;

  public void setRequesterOrderIdentifier(DvIdentifier requesterOrderIdentifier) {
     this.requesterOrderIdentifier = requesterOrderIdentifier;
  }

  public DvIdentifier getRequesterOrderIdentifier() {
     return this.requesterOrderIdentifier ;
  }
}
