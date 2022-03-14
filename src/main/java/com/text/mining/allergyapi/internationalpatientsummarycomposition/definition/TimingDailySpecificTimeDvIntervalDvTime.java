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
    date = "2021-09-27T22:12:01.842431-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_INTERVAL<DV_TIME>")
public class TimingDailySpecificTimeDvIntervalDvTime implements RMEntity, TimingDailySpecificTimeChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time/upper
   */
  @Path("/upper|value")
  private TemporalAccessor upperValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time/lower
   */
  @Path("/lower|value")
  private TemporalAccessor lowerValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time/lower_included
   */
  @Path("/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time/upper_included
   */
  @Path("/upper_included")
  private Boolean upperIncluded;

  public void setUpperValue(TemporalAccessor upperValue) {
     this.upperValue = upperValue;
  }

  public TemporalAccessor getUpperValue() {
     return this.upperValue ;
  }

  public void setLowerValue(TemporalAccessor lowerValue) {
     this.lowerValue = lowerValue;
  }

  public TemporalAccessor getLowerValue() {
     return this.lowerValue ;
  }

  public void setLowerIncluded(Boolean lowerIncluded) {
     this.lowerIncluded = lowerIncluded;
  }

  public Boolean isLowerIncluded() {
     return this.lowerIncluded ;
  }

  public void setUpperIncluded(Boolean upperIncluded) {
     this.upperIncluded = upperIncluded;
  }

  public Boolean isUpperIncluded() {
     return this.upperIncluded ;
  }
}
