package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;
import java.time.temporal.Temporal;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.872125-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_DATE")
public class TimingNonDailySpecificDateDvDate implements RMEntity, TimingNonDailySpecificDateChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific date/Specific date
   * Description: The activity should take place on a specific date or a specific range of dates.
   */
  @Path("|value")
  private Temporal specificDateValue;

  public void setSpecificDateValue(Temporal specificDateValue) {
     this.specificDateValue = specificDateValue;
  }

  public Temporal getSpecificDateValue() {
     return this.specificDateValue ;
  }
}
