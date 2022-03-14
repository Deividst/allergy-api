package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.939479-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisDiagnosticCertaintyDvCodedText implements RMEntity, ProblemDiagnosisDiagnosticCertaintyChoice {
  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Diagnostic certainty/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   */
  @Path("|defining_code")
  private DiagnosticCertaintyDefiningCode diagnosticCertaintyDefiningCode;

  public void setDiagnosticCertaintyDefiningCode(
      DiagnosticCertaintyDefiningCode diagnosticCertaintyDefiningCode) {
     this.diagnosticCertaintyDefiningCode = diagnosticCertaintyDefiningCode;
  }

  public DiagnosticCertaintyDefiningCode getDiagnosticCertaintyDefiningCode() {
     return this.diagnosticCertaintyDefiningCode ;
  }
}
