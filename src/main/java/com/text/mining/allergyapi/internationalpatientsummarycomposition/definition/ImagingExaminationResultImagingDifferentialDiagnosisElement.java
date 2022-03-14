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
    date = "2021-09-27T22:12:02.108055-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImagingExaminationResultImagingDifferentialDiagnosisElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging differential diagnosis
   * Description: Single word, phrase or brief description representing a possible condition or diagnosis.
   * Comment: This data element has multiple occurrences to allow for more than one differential diagnoses. Coding with a terminology is preferred, where possible. This data element should be regarded as mutually exclusive to 'Imaging diagnosis' - only one of 'Differential diagnoses' OR 'Imaging diagnosis' should be present in each Imaging examination result.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Imaging differential diagnosis/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/feeder_audit
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
