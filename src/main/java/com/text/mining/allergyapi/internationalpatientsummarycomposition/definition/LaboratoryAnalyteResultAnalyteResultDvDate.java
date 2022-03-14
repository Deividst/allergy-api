package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;
import java.time.temporal.Temporal;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.035655-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_DATE")
public class LaboratoryAnalyteResultAnalyteResultDvDate implements RMEntity, LaboratoryAnalyteResultAnalyteResultChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result/Analyte result
   * Description: The value of the analyte result.
   */
  @Path("|value")
  private Temporal analyteResultValue;

  public void setAnalyteResultValue(Temporal analyteResultValue) {
     this.analyteResultValue = analyteResultValue;
  }

  public Temporal getAnalyteResultValue() {
     return this.analyteResultValue ;
  }
}
