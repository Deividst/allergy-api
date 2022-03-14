package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.034538-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_QUANTITY")
public class LaboratoryAnalyteResultAnalyteResultDvQuantity implements RMEntity, LaboratoryAnalyteResultAnalyteResultChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result/Analyte result
   * Description: The value of the analyte result.
   */
  @Path("|magnitude")
  private Double analyteResultMagnitude;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result/Analyte result
   * Description: The value of the analyte result.
   */
  @Path("|units")
  private String analyteResultUnits;

  public void setAnalyteResultMagnitude(Double analyteResultMagnitude) {
     this.analyteResultMagnitude = analyteResultMagnitude;
  }

  public Double getAnalyteResultMagnitude() {
     return this.analyteResultMagnitude ;
  }

  public void setAnalyteResultUnits(String analyteResultUnits) {
     this.analyteResultUnits = analyteResultUnits;
  }

  public String getAnalyteResultUnits() {
     return this.analyteResultUnits ;
  }
}
