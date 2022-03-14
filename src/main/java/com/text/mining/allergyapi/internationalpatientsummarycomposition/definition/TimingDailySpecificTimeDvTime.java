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
    date = "2021-09-27T22:12:01.842025-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TIME")
public class TimingDailySpecificTimeDvTime implements RMEntity, TimingDailySpecificTimeChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time/Specific time
   * Description: A specific time or interval of time when the activity should occur.
   */
  @Path("|value")
  private TemporalAccessor specificTimeValue;

  public void setSpecificTimeValue(TemporalAccessor specificTimeValue) {
     this.specificTimeValue = specificTimeValue;
  }

  public TemporalAccessor getSpecificTimeValue() {
     return this.specificTimeValue ;
  }
}
