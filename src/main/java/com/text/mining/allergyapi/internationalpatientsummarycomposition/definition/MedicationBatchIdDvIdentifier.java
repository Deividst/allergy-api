package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.786919-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_IDENTIFIER")
public class MedicationBatchIdDvIdentifier implements RMEntity, MedicationBatchIdChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Batch ID/Batch ID
   * Description: The identifier assigned to the production batch by the manufacturer during production.
   */
  @Path("")
  private List<DvIdentifier> batchId;

  public void setBatchId(List<DvIdentifier> batchId) {
     this.batchId = batchId;
  }

  public List<DvIdentifier> getBatchId() {
     return this.batchId ;
  }
}
