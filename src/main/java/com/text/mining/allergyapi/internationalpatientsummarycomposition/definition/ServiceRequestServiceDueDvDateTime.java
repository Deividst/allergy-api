package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.273576-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_DATE_TIME")
public class ServiceRequestServiceDueDvDateTime implements RMEntity, ServiceRequestServiceDueChoice {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service due/Service due
   * Description: The date/time, or acceptable interval of date/time, for provision of the service.
   */
  @Path("|value")
  private TemporalAccessor serviceDueValue;

  public void setServiceDueValue(TemporalAccessor serviceDueValue) {
     this.serviceDueValue = serviceDueValue;
  }

  public TemporalAccessor getServiceDueValue() {
     return this.serviceDueValue ;
  }
}
