package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAmount;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.timing_nondaily.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.867089-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TimingNonDailyCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Repetition interval
   * Description: The interval between repetitions of the activity.
   * Comment: For example: 'Every 3 weeks'. If necessary, this element can be used to explicity specify that an activity is to take place every single day, by setting it to "1 day".
   */
  @Path("/items[at0002]/value|value")
  private TemporalAmount repetitionIntervalValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/Repetition interval/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour repetitionIntervalNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency
   * Description: The number of days per time period on which the activity is to take place.
   */
  @Path("/items[at0014]/value|magnitude")
  private Double frequencyMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency
   * Description: The number of days per time period on which the activity is to take place.
   */
  @Path("/items[at0014]/value|units")
  private String frequencyUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency/upper
   */
  @Path("/items[at0014]/value/upper|magnitude")
  private Double upperMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency/upper
   */
  @Path("/items[at0014]/value/upper|units")
  private String upperUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency/lower
   */
  @Path("/items[at0014]/value/lower|magnitude")
  private Double lowerMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency/lower
   */
  @Path("/items[at0014]/value/lower|units")
  private String lowerUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency/lower_included
   */
  @Path("/items[at0014]/value/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Frequency/upper_included
   */
  @Path("/items[at0014]/value/upper_included")
  private Boolean upperIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/Frequency/null_flavour
   */
  @Path("/items[at0014]/null_flavour|defining_code")
  private NullFlavour frequencyNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific date
   * Description: The activity should take place on a specific date or a specific range of dates.
   * Comment: For example: 'on 12 Jan 2017' or 'on 30 Oct 2017 to 6 Nov 2017'.
   */
  @Path("/items[at0001]")
  private List<TimingNonDailySpecificDateElement> specificDate;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of week
   * Description: The activity should take place on a specific day of the week.
   * Comment: For example: 'On Monday, Wednesday and Friday'.
   */
  @Path("/items[at0003]")
  private List<TimingNonDailySpecificDayOfWeekElement> specificDayOfWeek;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of month
   * Description: The activity should take place on a specific day or interval of days of the month.
   * Comment: For example: 'on the 3rd, 13th and 23rd of each month' or 'on the 1st to the 10th of each month'.
   */
  @Path("/items[at0004]")
  private List<TimingNonDailySpecificDayOfMonthElement> specificDayOfMonth;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Timing description
   * Description: Text description of the timing.
   * Comment: For example: 'Use for one week, then stop for two weeks, then repeat'. This element is intended to allow implementers to use the structures for daily timings without necessarily specifying the non-daily timings in a structured way.
   */
  @Path("/items[at0021]/value|value")
  private String timingDescriptionValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/Timing description/null_flavour
   */
  @Path("/items[at0021]/null_flavour|defining_code")
  private NullFlavour timingDescriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific event
   * Description: The activity should take place in relation to a specific named event.
   */
  @Path("/items[at0006]")
  private List<TimingNonDailySpecificEventCluster> specificEvent;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/On / off cycle/On
   * Description: The period of time for which the activity should take place.
   */
  @Path("/items[at0010]/items[at0011]/value|value")
  private TemporalAmount onValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/On / off cycle/On/null_flavour
   */
  @Path("/items[at0010]/items[at0011]/null_flavour|defining_code")
  private NullFlavour onNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/On / off cycle/Off
   * Description: The period of time for which the activity should NOT take place.
   */
  @Path("/items[at0010]/items[at0012]/value|value")
  private TemporalAmount offValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/On / off cycle/Off/null_flavour
   */
  @Path("/items[at0010]/items[at0012]/null_flavour|defining_code")
  private NullFlavour offNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/On / off cycle/Repetitions
   * Description: The number of repetitions of the on/off cycle.
   */
  @Path("/items[at0010]/items[at0013]/value|magnitude")
  private Long repetitionsMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/On / off cycle/Repetitions/null_flavour
   */
  @Path("/items[at0010]/items[at0013]/null_flavour|defining_code")
  private NullFlavour repetitionsNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setRepetitionIntervalValue(TemporalAmount repetitionIntervalValue) {
     this.repetitionIntervalValue = repetitionIntervalValue;
  }

  public TemporalAmount getRepetitionIntervalValue() {
     return this.repetitionIntervalValue ;
  }

  public void setRepetitionIntervalNullFlavourDefiningCode(
      NullFlavour repetitionIntervalNullFlavourDefiningCode) {
     this.repetitionIntervalNullFlavourDefiningCode = repetitionIntervalNullFlavourDefiningCode;
  }

  public NullFlavour getRepetitionIntervalNullFlavourDefiningCode() {
     return this.repetitionIntervalNullFlavourDefiningCode ;
  }

  public void setFrequencyMagnitude(Double frequencyMagnitude) {
     this.frequencyMagnitude = frequencyMagnitude;
  }

  public Double getFrequencyMagnitude() {
     return this.frequencyMagnitude ;
  }

  public void setFrequencyUnits(String frequencyUnits) {
     this.frequencyUnits = frequencyUnits;
  }

  public String getFrequencyUnits() {
     return this.frequencyUnits ;
  }

  public void setUpperMagnitude(Double upperMagnitude) {
     this.upperMagnitude = upperMagnitude;
  }

  public Double getUpperMagnitude() {
     return this.upperMagnitude ;
  }

  public void setUpperUnits(String upperUnits) {
     this.upperUnits = upperUnits;
  }

  public String getUpperUnits() {
     return this.upperUnits ;
  }

  public void setLowerMagnitude(Double lowerMagnitude) {
     this.lowerMagnitude = lowerMagnitude;
  }

  public Double getLowerMagnitude() {
     return this.lowerMagnitude ;
  }

  public void setLowerUnits(String lowerUnits) {
     this.lowerUnits = lowerUnits;
  }

  public String getLowerUnits() {
     return this.lowerUnits ;
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

  public void setFrequencyNullFlavourDefiningCode(NullFlavour frequencyNullFlavourDefiningCode) {
     this.frequencyNullFlavourDefiningCode = frequencyNullFlavourDefiningCode;
  }

  public NullFlavour getFrequencyNullFlavourDefiningCode() {
     return this.frequencyNullFlavourDefiningCode ;
  }

  public void setSpecificDate(List<TimingNonDailySpecificDateElement> specificDate) {
     this.specificDate = specificDate;
  }

  public List<TimingNonDailySpecificDateElement> getSpecificDate() {
     return this.specificDate ;
  }

  public void setSpecificDayOfWeek(List<TimingNonDailySpecificDayOfWeekElement> specificDayOfWeek) {
     this.specificDayOfWeek = specificDayOfWeek;
  }

  public List<TimingNonDailySpecificDayOfWeekElement> getSpecificDayOfWeek() {
     return this.specificDayOfWeek ;
  }

  public void setSpecificDayOfMonth(
      List<TimingNonDailySpecificDayOfMonthElement> specificDayOfMonth) {
     this.specificDayOfMonth = specificDayOfMonth;
  }

  public List<TimingNonDailySpecificDayOfMonthElement> getSpecificDayOfMonth() {
     return this.specificDayOfMonth ;
  }

  public void setTimingDescriptionValue(String timingDescriptionValue) {
     this.timingDescriptionValue = timingDescriptionValue;
  }

  public String getTimingDescriptionValue() {
     return this.timingDescriptionValue ;
  }

  public void setTimingDescriptionNullFlavourDefiningCode(
      NullFlavour timingDescriptionNullFlavourDefiningCode) {
     this.timingDescriptionNullFlavourDefiningCode = timingDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getTimingDescriptionNullFlavourDefiningCode() {
     return this.timingDescriptionNullFlavourDefiningCode ;
  }

  public void setSpecificEvent(List<TimingNonDailySpecificEventCluster> specificEvent) {
     this.specificEvent = specificEvent;
  }

  public List<TimingNonDailySpecificEventCluster> getSpecificEvent() {
     return this.specificEvent ;
  }

  public void setOnValue(TemporalAmount onValue) {
     this.onValue = onValue;
  }

  public TemporalAmount getOnValue() {
     return this.onValue ;
  }

  public void setOnNullFlavourDefiningCode(NullFlavour onNullFlavourDefiningCode) {
     this.onNullFlavourDefiningCode = onNullFlavourDefiningCode;
  }

  public NullFlavour getOnNullFlavourDefiningCode() {
     return this.onNullFlavourDefiningCode ;
  }

  public void setOffValue(TemporalAmount offValue) {
     this.offValue = offValue;
  }

  public TemporalAmount getOffValue() {
     return this.offValue ;
  }

  public void setOffNullFlavourDefiningCode(NullFlavour offNullFlavourDefiningCode) {
     this.offNullFlavourDefiningCode = offNullFlavourDefiningCode;
  }

  public NullFlavour getOffNullFlavourDefiningCode() {
     return this.offNullFlavourDefiningCode ;
  }

  public void setRepetitionsMagnitude(Long repetitionsMagnitude) {
     this.repetitionsMagnitude = repetitionsMagnitude;
  }

  public Long getRepetitionsMagnitude() {
     return this.repetitionsMagnitude ;
  }

  public void setRepetitionsNullFlavourDefiningCode(
      NullFlavour repetitionsNullFlavourDefiningCode) {
     this.repetitionsNullFlavourDefiningCode = repetitionsNullFlavourDefiningCode;
  }

  public NullFlavour getRepetitionsNullFlavourDefiningCode() {
     return this.repetitionsNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
