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
    date = "2021-09-27T22:12:01.872447-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_INTERVAL<DV_DATE>")
public class TimingNonDailySpecificDateDvIntervalDvDate implements RMEntity, TimingNonDailySpecificDateChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific date/upper
   */
  @Path("/upper|value")
  private Temporal upperValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific date/lower
   */
  @Path("/lower|value")
  private Temporal lowerValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific date/lower_included
   */
  @Path("/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific date/upper_included
   */
  @Path("/upper_included")
  private Boolean upperIncluded;

  public void setUpperValue(Temporal upperValue) {
     this.upperValue = upperValue;
  }

  public Temporal getUpperValue() {
     return this.upperValue ;
  }

  public void setLowerValue(Temporal lowerValue) {
     this.lowerValue = lowerValue;
  }

  public Temporal getLowerValue() {
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
