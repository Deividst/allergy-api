package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.105816-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class ImagingFindingComparisonToPreviousDvText implements RMEntity, ImagingFindingComparisonToPreviousChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Comparison to previous/Comparison to previous
   * Description: Narrative description about the difference between a previous finding and the finding in this report.
   */
  @Path("|value")
  private String comparisonToPreviousValue;

  public void setComparisonToPreviousValue(String comparisonToPreviousValue) {
     this.comparisonToPreviousValue = comparisonToPreviousValue;
  }

  public String getComparisonToPreviousValue() {
     return this.comparisonToPreviousValue ;
  }
}
