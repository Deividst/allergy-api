package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.938177-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisSeverityDvCodedText implements RMEntity, ProblemDiagnosisSeverityChoice {
  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Severity/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   */
  @Path("|defining_code")
  private SeverityDefiningCode2 severityDefiningCode;

  public void setSeverityDefiningCode(SeverityDefiningCode2 severityDefiningCode) {
     this.severityDefiningCode = severityDefiningCode;
  }

  public SeverityDefiningCode2 getSeverityDefiningCode() {
     return this.severityDefiningCode ;
  }
}
