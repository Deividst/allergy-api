package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.858525-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_QUANTITY")
public class DosageDoseFormulaDvQuantity implements RMEntity, DosageDoseFormulaChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose formula/Dose formula
   * Description: The formula used to calculate the dose amount or administration rate where this is dependent on some other factor, such as body weight or surface area.
   */
  @Path("|magnitude")
  private Double doseFormulaMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose formula/Dose formula
   * Description: The formula used to calculate the dose amount or administration rate where this is dependent on some other factor, such as body weight or surface area.
   */
  @Path("|units")
  private String doseFormulaUnits;

  public void setDoseFormulaMagnitude(Double doseFormulaMagnitude) {
     this.doseFormulaMagnitude = doseFormulaMagnitude;
  }

  public Double getDoseFormulaMagnitude() {
     return this.doseFormulaMagnitude ;
  }

  public void setDoseFormulaUnits(String doseFormulaUnits) {
     this.doseFormulaUnits = doseFormulaUnits;
  }

  public String getDoseFormulaUnits() {
     return this.doseFormulaUnits ;
  }
}
