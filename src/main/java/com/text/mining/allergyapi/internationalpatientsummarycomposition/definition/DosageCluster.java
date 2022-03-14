package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Archetype("openEHR-EHR-CLUSTER.dosage.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.815896-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DosageCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount
   * Description: The value of the amount of medication administered at one time, as a real number, or range of real numbers, and associated with the Dose unit.
   */
  @Path("/items[at0144]/value|magnitude")
  private Double doseAmountMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount
   * Description: The value of the amount of medication administered at one time, as a real number, or range of real numbers, and associated with the Dose unit.
   */
  @Path("/items[at0144]/value|units")
  private String doseAmountUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount/upper
   */
  @Path("/items[at0144]/value/upper|magnitude")
  private Double upperMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount/upper
   */
  @Path("/items[at0144]/value/upper|units")
  private String upperUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount/lower
   */
  @Path("/items[at0144]/value/lower|magnitude")
  private Double lowerMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount/lower
   */
  @Path("/items[at0144]/value/lower|units")
  private String lowerUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount/lower_included
   */
  @Path("/items[at0144]/value/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose amount/upper_included
   */
  @Path("/items[at0144]/value/upper_included")
  private Boolean upperIncluded;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Dose amount/null_flavour
   */
  @Path("/items[at0144]/null_flavour|defining_code")
  private NullFlavour doseAmountNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose unit
   * Description: The unit which is associated with the Dose amount.
   * Comment: For example: 'tablet','mg'. Coding of the dose unit with a terminology is preferred, where possible.
   */
  @Path("/items[at0145]/value|value")
  private String doseUnitValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Dose unit/null_flavour
   */
  @Path("/items[at0145]/null_flavour|defining_code")
  private NullFlavour doseUnitNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Dose formula/null_flavour
   */
  @Path("/items[at0135]/null_flavour|defining_code")
  private NullFlavour doseFormulaNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose description
   * Description: Text description of the dose.
   * Comment: For example: "Apply ointment to affected area until it glistens". This element is intended to allow implementers to use the structures for increasing/tapering dosages without necessarily specifying the doses in a structured way.
   */
  @Path("/items[at0178]/value|value")
  private String doseDescriptionValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Dosage/Dose description/null_flavour
   */
  @Path("/items[at0178]/null_flavour|defining_code")
  private NullFlavour doseDescriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Timing - daily
   * Description: Structured information about the intended timing of a therapeutic or diagnostic activity within any 24 hour period.
   */
  @Path("/items[openEHR-EHR-CLUSTER.timing_daily.v1]")
  private TimingDailyCluster timingDaily;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage/Dose formula
   * Description: The formula used to calculate the dose amount or administration rate where this is dependent on some other factor, such as body weight or surface area.
   */
  @Path("/items[at0135]/value")
  @Choice
  private DosageDoseFormulaChoice doseFormula;

  public void setDoseAmountMagnitude(Double doseAmountMagnitude) {
     this.doseAmountMagnitude = doseAmountMagnitude;
  }

  public Double getDoseAmountMagnitude() {
     return this.doseAmountMagnitude ;
  }

  public void setDoseAmountUnits(String doseAmountUnits) {
     this.doseAmountUnits = doseAmountUnits;
  }

  public String getDoseAmountUnits() {
     return this.doseAmountUnits ;
  }

  public void setUpperMagnitude(Double upperMagnitude) {
     this.upperMagnitude = upperMagnitude;
  }

  public Double getUpperMagnitude() {
     return this.upperMagnitude ;
  }

  public void setUpperUnits(String upperUnits) {
     this.upperUnits = upperUnits;
  }

  public String getUpperUnits() {
     return this.upperUnits ;
  }

  public void setLowerMagnitude(Double lowerMagnitude) {
     this.lowerMagnitude = lowerMagnitude;
  }

  public Double getLowerMagnitude() {
     return this.lowerMagnitude ;
  }

  public void setLowerUnits(String lowerUnits) {
     this.lowerUnits = lowerUnits;
  }

  public String getLowerUnits() {
     return this.lowerUnits ;
  }

  public void setLowerIncluded(Boolean lowerIncluded) {
     this.lowerIncluded = lowerIncluded;
  }

  public Boolean isLowerIncluded() {
     return this.lowerIncluded ;
  }

  public void setUpperIncluded(Boolean upperIncluded) {
     this.upperIncluded = upperIncluded;
  }

  public Boolean isUpperIncluded() {
     return this.upperIncluded ;
  }

  public void setDoseAmountNullFlavourDefiningCode(NullFlavour doseAmountNullFlavourDefiningCode) {
     this.doseAmountNullFlavourDefiningCode = doseAmountNullFlavourDefiningCode;
  }

  public NullFlavour getDoseAmountNullFlavourDefiningCode() {
     return this.doseAmountNullFlavourDefiningCode ;
  }

  public void setDoseUnitValue(String doseUnitValue) {
     this.doseUnitValue = doseUnitValue;
  }

  public String getDoseUnitValue() {
     return this.doseUnitValue ;
  }

  public void setDoseUnitNullFlavourDefiningCode(NullFlavour doseUnitNullFlavourDefiningCode) {
     this.doseUnitNullFlavourDefiningCode = doseUnitNullFlavourDefiningCode;
  }

  public NullFlavour getDoseUnitNullFlavourDefiningCode() {
     return this.doseUnitNullFlavourDefiningCode ;
  }

  public void setDoseFormulaNullFlavourDefiningCode(
      NullFlavour doseFormulaNullFlavourDefiningCode) {
     this.doseFormulaNullFlavourDefiningCode = doseFormulaNullFlavourDefiningCode;
  }

  public NullFlavour getDoseFormulaNullFlavourDefiningCode() {
     return this.doseFormulaNullFlavourDefiningCode ;
  }

  public void setDoseDescriptionValue(String doseDescriptionValue) {
     this.doseDescriptionValue = doseDescriptionValue;
  }

  public String getDoseDescriptionValue() {
     return this.doseDescriptionValue ;
  }

  public void setDoseDescriptionNullFlavourDefiningCode(
      NullFlavour doseDescriptionNullFlavourDefiningCode) {
     this.doseDescriptionNullFlavourDefiningCode = doseDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDoseDescriptionNullFlavourDefiningCode() {
     return this.doseDescriptionNullFlavourDefiningCode ;
  }

  public void setTimingDaily(TimingDailyCluster timingDaily) {
     this.timingDaily = timingDaily;
  }

  public TimingDailyCluster getTimingDaily() {
     return this.timingDaily ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setDoseFormula(DosageDoseFormulaChoice doseFormula) {
     this.doseFormula = doseFormula;
  }

  public DosageDoseFormulaChoice getDoseFormula() {
     return this.doseFormula ;
  }
}
