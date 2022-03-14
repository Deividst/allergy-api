package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.840833-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TimingDailySpecificTimeElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Timing - daily/Specific time/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily/Specific time
   * Description: A specific time or interval of time when the activity should occur.
   */
  @Path("/value")
  @Choice
  private List<TimingDailySpecificTimeChoice> value2;

  public void setValue(NullFlavour value) {
     this.value = value;
  }

  public NullFlavour getValue() {
     return this.value ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setValue2(List<TimingDailySpecificTimeChoice> value2) {
     this.value2 = value2;
  }

  public List<TimingDailySpecificTimeChoice> getValue2() {
     return this.value2 ;
  }
}
