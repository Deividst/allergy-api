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
    date = "2021-09-27T22:12:02.308828-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AdvanceCareDirectiveConditionElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Condition
   * Description: The conditions or situations in which the individual wishes the advance care directive to apply.
   * Comment: For example: dementia, brain injury, diseases of the central nervous system, and terminal illness. Coding with a terminology is preferred, where possible.
   *
   * The advance care directive applies to all specified conditions if the individual can no longer make or communicate decisions about their medical treatment and is unlikely to regain the ability to make such decisions. Details of specific decisions that apply to different conditions or situations can be included using CLUSTER archetypes in the 'Directive details' slot.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Condition/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
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
