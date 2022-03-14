package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.786313-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class MedicationBatchIdDvText implements RMEntity, MedicationBatchIdChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Batch ID/Batch ID
   * Description: The identifier assigned to the production batch by the manufacturer during production.
   */
  @Path("|value")
  private String batchIdValue;

  public void setBatchIdValue(String batchIdValue) {
     this.batchIdValue = batchIdValue;
  }

  public String getBatchIdValue() {
     return this.batchIdValue ;
  }
}
