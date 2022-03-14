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
    date = "2021-09-27T22:12:01.883398-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TimingNonDailySpecificEventCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific event/Event name
   * Description: The name of the event that triggers the activity to take place.
   * Comment: This element is intended for events that can occur at variable dates, such as onset of menstruation, and not for doses or activities that are conditional on a different varable. If required, the event name can be coded using a terminology, which could potentially be used to trigger an application to set a concrete date for the activity.
   */
  @Path("/items[at0005]/value|value")
  private String eventNameValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/Specific event/Event name/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour eventNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific event/Time offset
   * Description: The period of time before or after the named event when the activity should take place. Negative durations can be used to signify that the activity should be taken before a known event.
   * Comment: For example: '3 days after onset of menstruation = menstrual onset + 3 days', '2 weeks prior to admission= admission -2 weeks'.
   */
  @Path("/items[at0009]/value|value")
  private TemporalAmount timeOffsetValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/Specific event/Time offset/null_flavour
   */
  @Path("/items[at0009]/null_flavour|defining_code")
  private NullFlavour timeOffsetNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setEventNameValue(String eventNameValue) {
     this.eventNameValue = eventNameValue;
  }

  public String getEventNameValue() {
     return this.eventNameValue ;
  }

  public void setEventNameNullFlavourDefiningCode(NullFlavour eventNameNullFlavourDefiningCode) {
     this.eventNameNullFlavourDefiningCode = eventNameNullFlavourDefiningCode;
  }

  public NullFlavour getEventNameNullFlavourDefiningCode() {
     return this.eventNameNullFlavourDefiningCode ;
  }

  public void setTimeOffsetValue(TemporalAmount timeOffsetValue) {
     this.timeOffsetValue = timeOffsetValue;
  }

  public TemporalAmount getTimeOffsetValue() {
     return this.timeOffsetValue ;
  }

  public void setTimeOffsetNullFlavourDefiningCode(NullFlavour timeOffsetNullFlavourDefiningCode) {
     this.timeOffsetNullFlavourDefiningCode = timeOffsetNullFlavourDefiningCode;
  }

  public NullFlavour getTimeOffsetNullFlavourDefiningCode() {
     return this.timeOffsetNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
