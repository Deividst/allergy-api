package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.031655-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class LaboratoryAnalyteResultAnalyteResultElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Laboratory analyte result/Analyte result/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result
   * Description: The value of the analyte result.
   */
  @Path("/value")
  @Choice
  private LaboratoryAnalyteResultAnalyteResultChoice value2;

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

  public void setValue2(LaboratoryAnalyteResultAnalyteResultChoice value2) {
     this.value2 = value2;
  }

  public LaboratoryAnalyteResultAnalyteResultChoice getValue2() {
     return this.value2 ;
  }
}
