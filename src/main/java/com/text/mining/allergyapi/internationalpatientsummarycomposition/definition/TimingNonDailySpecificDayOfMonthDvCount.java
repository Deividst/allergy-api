package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.879508-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_COUNT")
public class TimingNonDailySpecificDayOfMonthDvCount implements RMEntity, TimingNonDailySpecificDayOfMonthChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of month/Specific day of month
   * Description: The activity should take place on a specific day or interval of days of the month.
   */
  @Path("|magnitude")
  private Long specificDayOfMonthMagnitude;

  public void setSpecificDayOfMonthMagnitude(Long specificDayOfMonthMagnitude) {
     this.specificDayOfMonthMagnitude = specificDayOfMonthMagnitude;
  }

  public Long getSpecificDayOfMonthMagnitude() {
     return this.specificDayOfMonthMagnitude ;
  }
}
