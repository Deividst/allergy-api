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
@Archetype("openEHR-EHR-CLUSTER.timing_daily.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.825258-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TimingDailyCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency
   * Description: The frequency as number of times per time period that the activity is to take place.
   */
  @Path("/items[at0003]/value|magnitude")
  private Double frequencyMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency
   * Description: The frequency as number of times per time period that the activity is to take place.
   */
  @Path("/items[at0003]/value|units")
  private String frequencyUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency/upper
   */
  @Path("/items[at0003]/value/upper|magnitude")
  private Double upperMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency/upper
   */
  @Path("/items[at0003]/value/upper|units")
  private String upperUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency/lower
   */
  @Path("/items[at0003]/value/lower|magnitude")
  private Double lowerMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency/lower
   */
  @Path("/items[at0003]/value/lower|units")
  private String lowerUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency/lower_included
   */
  @Path("/items[at0003]/value/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Frequency/upper_included
   */
  @Path("/items[at0003]/value/upper_included")
  private Boolean upperIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/Frequency/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour frequencyNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Interval
   * Description: The time interval or minimum and maximum range of an interval between each scheduled activity.
   * Comment: For example: "Every 4 hours" or "Every 4 to 6 hours".
   */
  @Path("/items[at0014]/value|value")
  private TemporalAmount intervalValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/Interval/null_flavour
   */
  @Path("/items[at0014]/null_flavour|defining_code")
  private NullFlavour intervalNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time
   * Description: A specific time or interval of time when the activity should occur.
   * Comment: For example: "08:00" or "15:00-16:00".
   */
  @Path("/items[at0004]")
  private List<TimingDailySpecificTimeElement> specificTime;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Timing description
   * Description: Text description of the daily timing. This element is intended to allow implementers to use the structures for different timings without necessarily specifying the timings in a structured way.
   * Comment: For example: "Take morning and evening".
   */
  @Path("/items[at0027]/value|value")
  private String timingDescriptionValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/Timing description/null_flavour
   */
  @Path("/items[at0027]/null_flavour|defining_code")
  private NullFlavour timingDescriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Exact timing critical?
   * Description: Is exact timing of the activity critical to effectiveness, or patient safety or wellbeing?
   * Comment: For example when administering antiparkinson medications.
   */
  @Path("/items[at0023]/value|value")
  private Boolean exactTimingCriticalValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/Exact timing critical?/null_flavour
   */
  @Path("/items[at0023]/null_flavour|defining_code")
  private NullFlavour exactTimingCriticalNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/As required
   * Description: Record as True if the activity should only occur when the "'As required' criterion" is met.
   * Comment: Termed 'PRN' ("pro re nata", latin: "as the situation arises") or 'PN' ("per necessare", latin: "when required") in some cultures.
   */
  @Path("/items[at0024]/value|value")
  private Boolean asRequiredValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/As required/null_flavour
   */
  @Path("/items[at0024]/null_flavour|defining_code")
  private NullFlavour asRequiredNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/'As required' criterion
   * Description: The condition which triggers an 'As required' activity.
   * Comment: For example: "for pain".
   */
  @Path("/items[at0025]/value|value")
  private String asRequiredCriterionValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/'As required' criterion/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour asRequiredCriterionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific event
   * Description: A specific, named time event that the activity should occur in relation to.
   */
  @Path("/items[at0039]")
  private List<TimingDailySpecificEventCluster> specificEvent;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/On / off cycle
   * Description: A cycle of activity where an on-off pattern is required.
   * Comment: For example: "Apply an ice pack on for 20 minutes, off for an hour, repeat".
   */
  @Path("/items[at0035]")
  private List<TimingDailyOnOffCycleCluster> onOffCycle;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

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

  public void setIntervalValue(TemporalAmount intervalValue) {
     this.intervalValue = intervalValue;
  }

  public TemporalAmount getIntervalValue() {
     return this.intervalValue ;
  }

  public void setIntervalNullFlavourDefiningCode(NullFlavour intervalNullFlavourDefiningCode) {
     this.intervalNullFlavourDefiningCode = intervalNullFlavourDefiningCode;
  }

  public NullFlavour getIntervalNullFlavourDefiningCode() {
     return this.intervalNullFlavourDefiningCode ;
  }

  public void setSpecificTime(List<TimingDailySpecificTimeElement> specificTime) {
     this.specificTime = specificTime;
  }

  public List<TimingDailySpecificTimeElement> getSpecificTime() {
     return this.specificTime ;
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

  public void setExactTimingCriticalValue(Boolean exactTimingCriticalValue) {
     this.exactTimingCriticalValue = exactTimingCriticalValue;
  }

  public Boolean isExactTimingCriticalValue() {
     return this.exactTimingCriticalValue ;
  }

  public void setExactTimingCriticalNullFlavourDefiningCode(
      NullFlavour exactTimingCriticalNullFlavourDefiningCode) {
     this.exactTimingCriticalNullFlavourDefiningCode = exactTimingCriticalNullFlavourDefiningCode;
  }

  public NullFlavour getExactTimingCriticalNullFlavourDefiningCode() {
     return this.exactTimingCriticalNullFlavourDefiningCode ;
  }

  public void setAsRequiredValue(Boolean asRequiredValue) {
     this.asRequiredValue = asRequiredValue;
  }

  public Boolean isAsRequiredValue() {
     return this.asRequiredValue ;
  }

  public void setAsRequiredNullFlavourDefiningCode(NullFlavour asRequiredNullFlavourDefiningCode) {
     this.asRequiredNullFlavourDefiningCode = asRequiredNullFlavourDefiningCode;
  }

  public NullFlavour getAsRequiredNullFlavourDefiningCode() {
     return this.asRequiredNullFlavourDefiningCode ;
  }

  public void setAsRequiredCriterionValue(String asRequiredCriterionValue) {
     this.asRequiredCriterionValue = asRequiredCriterionValue;
  }

  public String getAsRequiredCriterionValue() {
     return this.asRequiredCriterionValue ;
  }

  public void setAsRequiredCriterionNullFlavourDefiningCode(
      NullFlavour asRequiredCriterionNullFlavourDefiningCode) {
     this.asRequiredCriterionNullFlavourDefiningCode = asRequiredCriterionNullFlavourDefiningCode;
  }

  public NullFlavour getAsRequiredCriterionNullFlavourDefiningCode() {
     return this.asRequiredCriterionNullFlavourDefiningCode ;
  }

  public void setSpecificEvent(List<TimingDailySpecificEventCluster> specificEvent) {
     this.specificEvent = specificEvent;
  }

  public List<TimingDailySpecificEventCluster> getSpecificEvent() {
     return this.specificEvent ;
  }

  public void setOnOffCycle(List<TimingDailyOnOffCycleCluster> onOffCycle) {
     this.onOffCycle = onOffCycle;
  }

  public List<TimingDailyOnOffCycleCluster> getOnOffCycle() {
     return this.onOffCycle ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
