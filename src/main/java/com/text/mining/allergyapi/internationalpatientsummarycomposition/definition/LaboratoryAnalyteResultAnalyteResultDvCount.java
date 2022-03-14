package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.034678-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_COUNT")
public class LaboratoryAnalyteResultAnalyteResultDvCount implements RMEntity, LaboratoryAnalyteResultAnalyteResultChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result/Analyte result
   * Description: The value of the analyte result.
   */
  @Path("|magnitude")
  private Long analyteResultMagnitude;

  public void setAnalyteResultMagnitude(Long analyteResultMagnitude) {
     this.analyteResultMagnitude = analyteResultMagnitude;
  }

  public Long getAnalyteResultMagnitude() {
     return this.analyteResultMagnitude ;
  }
}
