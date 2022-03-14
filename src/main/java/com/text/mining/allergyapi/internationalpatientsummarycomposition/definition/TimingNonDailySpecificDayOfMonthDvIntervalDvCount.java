package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.879745-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_INTERVAL<DV_COUNT>")
public class TimingNonDailySpecificDayOfMonthDvIntervalDvCount implements RMEntity, TimingNonDailySpecificDayOfMonthChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of month/upper
   */
  @Path("/upper|magnitude")
  private Long upperMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of month/lower
   */
  @Path("/lower|magnitude")
  private Long lowerMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of month/lower_included
   */
  @Path("/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of month/upper_included
   */
  @Path("/upper_included")
  private Boolean upperIncluded;

  public void setUpperMagnitude(Long upperMagnitude) {
     this.upperMagnitude = upperMagnitude;
  }

  public Long getUpperMagnitude() {
     return this.upperMagnitude ;
  }

  public void setLowerMagnitude(Long lowerMagnitude) {
     this.lowerMagnitude = lowerMagnitude;
  }

  public Long getLowerMagnitude() {
     return this.lowerMagnitude ;
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
