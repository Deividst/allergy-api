package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAmount;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.853900-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TimingDailyOnOffCycleCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/On / off cycle/On
   * Description: The period of time for which the activity should take place.
   */
  @Path("/items[at0036]/value|value")
  private TemporalAmount onValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/On / off cycle/On/null_flavour
   */
  @Path("/items[at0036]/null_flavour|defining_code")
  private NullFlavour onNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/On / off cycle/Off
   * Description: The period of time for which the activity should NOT take place.
   */
  @Path("/items[at0037]/value|value")
  private TemporalAmount offValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/On / off cycle/Off/null_flavour
   */
  @Path("/items[at0037]/null_flavour|defining_code")
  private NullFlavour offNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/On / off cycle/Repetitions
   * Description: The number of repetitions of the on/off cycle.
   */
  @Path("/items[at0038]/value|magnitude")
  private Long repetitionsMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/On / off cycle/Repetitions/null_flavour
   */
  @Path("/items[at0038]/null_flavour|defining_code")
  private NullFlavour repetitionsNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/On / off cycle/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

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
