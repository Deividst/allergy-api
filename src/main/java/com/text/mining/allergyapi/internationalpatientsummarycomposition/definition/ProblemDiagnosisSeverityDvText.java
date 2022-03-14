package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.938596-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisSeverityDvText implements RMEntity, ProblemDiagnosisSeverityChoice {
  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Severity/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   */
  @Path("|value")
  private String severityValue;

  public void setSeverityValue(String severityValue) {
     this.severityValue = severityValue;
  }

  public String getSeverityValue() {
     return this.severityValue ;
  }
}
