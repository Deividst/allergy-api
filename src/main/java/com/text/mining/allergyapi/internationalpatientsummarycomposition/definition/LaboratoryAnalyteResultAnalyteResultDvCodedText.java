package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.datavalues.DvCodedText;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.032742-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_CODED_TEXT")
public class LaboratoryAnalyteResultAnalyteResultDvCodedText implements RMEntity, LaboratoryAnalyteResultAnalyteResultChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result/Analyte result
   * Description: The value of the analyte result.
   */
  @Path("")
  private DvCodedText analyteResult;

  public void setAnalyteResult(DvCodedText analyteResult) {
     this.analyteResult = analyteResult;
  }

  public DvCodedText getAnalyteResult() {
     return this.analyteResult ;
  }
}
