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
    date = "2021-09-27T22:12:02.318168-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AdvanceCareDirectiveMandateElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Mandate/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Mandate
   * Description: Description of any legislation or other authoritative guidance that apply.
   */
  @Path("/value")
  @Choice
  private List<AdvanceCareDirectiveMandateChoice> value2;

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

  public void setValue2(List<AdvanceCareDirectiveMandateChoice> value2) {
     this.value2 = value2;
  }

  public List<AdvanceCareDirectiveMandateChoice> getValue2() {
     return this.value2 ;
  }
}
