package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.875603-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TimingNonDailySpecificDayOfWeekElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/Specific day of week
   * Description: The activity should take place on a specific day of the week.
   * Comment: For example: 'On Monday, Wednesday and Friday'.
   */
  @Path("/value|defining_code")
  private SpecificDayOfWeekDefiningCode value;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Timing - non-daily/Specific day of week/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(SpecificDayOfWeekDefiningCode value) {
     this.value = value;
  }

  public SpecificDayOfWeekDefiningCode getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
