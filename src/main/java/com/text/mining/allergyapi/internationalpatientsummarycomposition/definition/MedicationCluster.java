package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.medication.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.770647-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class MedicationCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Name
   * Description: The name of the medication or medication component.
   * Comment: For example: 'Zinacef 750 mg powder' or 'cefuroxim'. This item should be coded if possible, using for example, RxNorm, DM+D, Australian Medicines Terminology or FEST. Usage of this element will vary according to context of use. This element may be omitted where the name of the medication is recorded in the parent INSTRUCTION or ACTION archetype, and this archetype is only used to record that the form must be or was 'liquid'.
   */
  @Path("/items[at0132]/value|value")
  private String nameValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Name/null_flavour
   */
  @Path("/items[at0132]/null_flavour|defining_code")
  private NullFlavour nameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Form
   * Description: The formulation or presentation of the medication or medication component.
   * Comment: For example: 'tablet', 'capsule', 'cream', 'infusion fluid' or 'inhalation powder'. Coding of the form with a terminology is preferred, where possible. Medicines catalogues may differentiate between administrable form 'solution for injection' and product form 'powder for solution for injection'. The recorded form will depend on the exact context of use but administrable form is likely to be used in most instances.
   */
  @Path("/items[at0071]")
  private List<MedicationFormElement> form;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Category/null_flavour
   */
  @Path("/items[at0142]/null_flavour|defining_code")
  private NullFlavour categoryNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (presentation)/Strength numerator
   * Description: The value of the numerator of the strength fraction.
   * Comment: For example: For a presentation strength of '300 µg/0.3 ml', the strength numerator value is '300'. For a presentation strength of '100 mg/tablet', the strength numerator value is '100'.
   */
  @Path("/items[at0152]/items[at0153]/value|magnitude")
  private Double strengthNumeratorMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (presentation)/Strength numerator
   * Description: The value of the numerator of the strength fraction.
   * Comment: For example: For a presentation strength of '300 µg/0.3 ml', the strength numerator value is '300'. For a presentation strength of '100 mg/tablet', the strength numerator value is '100'.
   */
  @Path("/items[at0152]/items[at0153]/value|units")
  private String strengthNumeratorUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Strength (presentation)/Strength numerator/null_flavour
   */
  @Path("/items[at0152]/items[at0153]/null_flavour|defining_code")
  private NullFlavour strengthNumeratorNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (presentation)/Strength numerator unit
   * Description: The unit of the numerator of the strength fraction.
   * Comment: The strength numerator is usually recorded using mass, volume or arbitrary units. For example: 'mg', 'ml', 'IU'. For a presentation strength of '300 µg/0.3 ml', the strength numerator unit is 'µg'. For a presentation strength of '100 mg/tablet', the strength numerator value is 'mg'.
   */
  @Path("/items[at0152]/items[at0004]/value|value")
  private String strengthNumeratorUnitValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Strength (presentation)/Strength numerator unit/null_flavour
   */
  @Path("/items[at0152]/items[at0004]/null_flavour|defining_code")
  private NullFlavour strengthNumeratorUnitNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (presentation)/Strength denominator
   * Description: The value of the denominator of the strength fraction.
   * Comment: For example: For a presentation strength of '300 µg/0.3 ml', the strength denominator value is '0.3'. For a presentation strength of '100 mg/tablet', the strength denominator value is '1'.
   */
  @Path("/items[at0152]/items[at0157]/value|magnitude")
  private Double strengthDenominatorMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (presentation)/Strength denominator
   * Description: The value of the denominator of the strength fraction.
   * Comment: For example: For a presentation strength of '300 µg/0.3 ml', the strength denominator value is '0.3'. For a presentation strength of '100 mg/tablet', the strength denominator value is '1'.
   */
  @Path("/items[at0152]/items[at0157]/value|units")
  private String strengthDenominatorUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Strength (presentation)/Strength denominator/null_flavour
   */
  @Path("/items[at0152]/items[at0157]/null_flavour|defining_code")
  private NullFlavour strengthDenominatorNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (presentation)/Strength denominator unit
   * Description: The unit of the denominator of the strength fraction.
   * Comment: The strength denominator is usually recorded using mass or volume units. For example: 'g', 'ml'. For a presentation strength of '300 µg/0.3 ml', the strength denominator unit is 'ml'. For a presentation strength of '100 mg/tablet', the strength denominator unit is '1'. For this example, the 'Unit of presentation' element is used to record the presentation unit of the medication, 'tablet'.
   */
  @Path("/items[at0152]/items[at0005]/value|value")
  private String strengthDenominatorUnitValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Strength (presentation)/Strength denominator unit/null_flavour
   */
  @Path("/items[at0152]/items[at0005]/null_flavour|defining_code")
  private NullFlavour strengthDenominatorUnitNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Unit of presentation
   * Description: The unit of presentation for a single dose of the medication, for use with the 'Strength denominator unit' element.
   * Comment: For example: 'tablet', 'capsule', 'puff', 'inhalation'. In most cases, like for tablets and capsules, the unit of presentation is identical to the Form. For some presentations such as inhalers, the Form may be 'inhalation powder', 'inhalation aerosol' or 'inhaler' while the unit of presentation is 'inhalation', 'puff', or 'dose'.
   */
  @Path("/items[at0158]/value|value")
  private String unitOfPresentationValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Unit of presentation/null_flavour
   */
  @Path("/items[at0158]/null_flavour|defining_code")
  private NullFlavour unitOfPresentationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (concentration)
   * Description: The strength of the medication or medication component, as a concentration.
   * Comment: This element is used for liquid or semisolid medications, or medications intended to be diluted in a liquid before administration. For example: '10 mg/ml', '20 mg/g', '5 %', '10,000 SQ-U/ml'.
   */
  @Path("/items[at0115]/value|magnitude")
  private Double strengthConcentrationMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Strength (concentration)
   * Description: The strength of the medication or medication component, as a concentration.
   * Comment: This element is used for liquid or semisolid medications, or medications intended to be diluted in a liquid before administration. For example: '10 mg/ml', '20 mg/g', '5 %', '10,000 SQ-U/ml'.
   */
  @Path("/items[at0115]/value|units")
  private String strengthConcentrationUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Strength (concentration)/null_flavour
   */
  @Path("/items[at0115]/null_flavour|defining_code")
  private NullFlavour strengthConcentrationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Manufacturer
   * Description: The manufacturer of the medication or medication component.
   * Comment: For example: 'Abbott'.
   */
  @Path("/items[at0151]/value|value")
  private String manufacturerValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Manufacturer/null_flavour
   */
  @Path("/items[at0151]/null_flavour|defining_code")
  private NullFlavour manufacturerNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Batch ID
   * Description: The identifier assigned to the production batch by the manufacturer during production.
   */
  @Path("/items[at0150]")
  private List<MedicationBatchIdElement> batchId;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Expiry
   * Description: The expiry date and/or time of the medication or medication component, as given by the manufacturer or individual preparing the mixture.
   * Comment: Any other form of expiry date, such as time from production or depending on storage environment, can be inserted using a specific CLUSTER archetype in the Substance Details slot or added as part of the Description.
   *  For example: '2017-05-23'.
   */
  @Path("/items[at0003]/value|value")
  private TemporalAccessor expiryValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Expiry/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour expiryNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Constituent
   * Description: Details of an ingredient or product used to make up a mixed pack, preparation or infusion.
   * Comment: This slot is intended to be used to add details about constituents of the medication or medication component, using nested instances of this archetype. This is not normally required other than where a mixture is being described.
   */
  @Path("/items[at0138]")
  private List<Cluster> constituent;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Amount
   * Description: The value of the amount of medication or medication component.
   * Comment: For example: '1', '1.5', '1000'. 
   * Note: the associated unit for this amount is recorded using the 'Amount unit' element.
   */
  @Path("/items[at0139]/value|magnitude")
  private Double amountMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Amount
   * Description: The value of the amount of medication or medication component.
   * Comment: For example: '1', '1.5', '1000'. 
   * Note: the associated unit for this amount is recorded using the 'Amount unit' element.
   */
  @Path("/items[at0139]/value|units")
  private String amountUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Amount/null_flavour
   */
  @Path("/items[at0139]/null_flavour|defining_code")
  private NullFlavour amountNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Amount unit
   * Description: The unit of the amount of medication or medication component.
   * Comment: For example: 'mg', 'ml', 'IU'.
   * Note: The value of the amount is recorded using the 'Amount' element.
   */
  @Path("/items[at0008]/value|value")
  private String amountUnitValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Amount unit/null_flavour
   */
  @Path("/items[at0008]/null_flavour|defining_code")
  private NullFlavour amountUnitNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Alternate amount
   * Description: The value of an equivalent representation of the amount of the medication or medication component.
   * Comment: The unit of the alternate amount is recorded in the 'Alternate amount unit' element. For example: for a medication with a strength of '5 mg/ml' and where the Amount is '1 ml', the equivalent amount would be 5 mg and the value recorded in this data element would be '5'.
   */
  @Path("/items[at0148]/value|magnitude")
  private Double alternateAmountMagnitude;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Alternate amount
   * Description: The value of an equivalent representation of the amount of the medication or medication component.
   * Comment: The unit of the alternate amount is recorded in the 'Alternate amount unit' element. For example: for a medication with a strength of '5 mg/ml' and where the Amount is '1 ml', the equivalent amount would be 5 mg and the value recorded in this data element would be '5'.
   */
  @Path("/items[at0148]/value|units")
  private String alternateAmountUnits;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Alternate amount/null_flavour
   */
  @Path("/items[at0148]/null_flavour|defining_code")
  private NullFlavour alternateAmountNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Alternate amount unit
   * Description: The unit of an equivalent representation of the amount of the medication or medication component.
   * Comment: The value of the alternate amount is recorded in the 'Alternate amount' element. For example: for a medication with a strength of '5 mg/ml' and where the Amount is '1 ml', the equivalent amount would be 5 mg and the value recorded in this data element would be 'mg'.
   */
  @Path("/items[at0007]/value|value")
  private String alternateAmountUnitValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Alternate amount unit/null_flavour
   */
  @Path("/items[at0007]/null_flavour|defining_code")
  private NullFlavour alternateAmountUnitNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Role/null_flavour
   */
  @Path("/items[at0127]/null_flavour|defining_code")
  private NullFlavour roleNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Description
   * Description: Narrative description of the medication or medication component where it is not possible to describe this fully using structured elements.
   */
  @Path("/items[at0133]/value|value")
  private String descriptionValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Description/null_flavour
   */
  @Path("/items[at0133]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Structured details
   * Description: Additional details about the medication or medication component.
   * Comment: For example: detailed information about the drug class or intended routes, or additional expiry information.
   */
  @Path("/items[at0141]")
  private List<Cluster> structuredDetails;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Category
   * Description: The category of the medication or medication component, with regard to manufacturing or preparation, and the number of ingredients.
   */
  @Path("/items[at0142]/value")
  @Choice
  private MedicationCategoryChoice category;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Role
   * Description: The role of the medication or medication component within a mixture.
   */
  @Path("/items[at0127]/value")
  @Choice
  private MedicationRoleChoice role;

  public void setNameValue(String nameValue) {
     this.nameValue = nameValue;
  }

  public String getNameValue() {
     return this.nameValue ;
  }

  public void setNameNullFlavourDefiningCode(NullFlavour nameNullFlavourDefiningCode) {
     this.nameNullFlavourDefiningCode = nameNullFlavourDefiningCode;
  }

  public NullFlavour getNameNullFlavourDefiningCode() {
     return this.nameNullFlavourDefiningCode ;
  }

  public void setForm(List<MedicationFormElement> form) {
     this.form = form;
  }

  public List<MedicationFormElement> getForm() {
     return this.form ;
  }

  public void setCategoryNullFlavourDefiningCode(NullFlavour categoryNullFlavourDefiningCode) {
     this.categoryNullFlavourDefiningCode = categoryNullFlavourDefiningCode;
  }

  public NullFlavour getCategoryNullFlavourDefiningCode() {
     return this.categoryNullFlavourDefiningCode ;
  }

  public void setStrengthNumeratorMagnitude(Double strengthNumeratorMagnitude) {
     this.strengthNumeratorMagnitude = strengthNumeratorMagnitude;
  }

  public Double getStrengthNumeratorMagnitude() {
     return this.strengthNumeratorMagnitude ;
  }

  public void setStrengthNumeratorUnits(String strengthNumeratorUnits) {
     this.strengthNumeratorUnits = strengthNumeratorUnits;
  }

  public String getStrengthNumeratorUnits() {
     return this.strengthNumeratorUnits ;
  }

  public void setStrengthNumeratorNullFlavourDefiningCode(
      NullFlavour strengthNumeratorNullFlavourDefiningCode) {
     this.strengthNumeratorNullFlavourDefiningCode = strengthNumeratorNullFlavourDefiningCode;
  }

  public NullFlavour getStrengthNumeratorNullFlavourDefiningCode() {
     return this.strengthNumeratorNullFlavourDefiningCode ;
  }

  public void setStrengthNumeratorUnitValue(String strengthNumeratorUnitValue) {
     this.strengthNumeratorUnitValue = strengthNumeratorUnitValue;
  }

  public String getStrengthNumeratorUnitValue() {
     return this.strengthNumeratorUnitValue ;
  }

  public void setStrengthNumeratorUnitNullFlavourDefiningCode(
      NullFlavour strengthNumeratorUnitNullFlavourDefiningCode) {
     this.strengthNumeratorUnitNullFlavourDefiningCode = strengthNumeratorUnitNullFlavourDefiningCode;
  }

  public NullFlavour getStrengthNumeratorUnitNullFlavourDefiningCode() {
     return this.strengthNumeratorUnitNullFlavourDefiningCode ;
  }

  public void setStrengthDenominatorMagnitude(Double strengthDenominatorMagnitude) {
     this.strengthDenominatorMagnitude = strengthDenominatorMagnitude;
  }

  public Double getStrengthDenominatorMagnitude() {
     return this.strengthDenominatorMagnitude ;
  }

  public void setStrengthDenominatorUnits(String strengthDenominatorUnits) {
     this.strengthDenominatorUnits = strengthDenominatorUnits;
  }

  public String getStrengthDenominatorUnits() {
     return this.strengthDenominatorUnits ;
  }

  public void setStrengthDenominatorNullFlavourDefiningCode(
      NullFlavour strengthDenominatorNullFlavourDefiningCode) {
     this.strengthDenominatorNullFlavourDefiningCode = strengthDenominatorNullFlavourDefiningCode;
  }

  public NullFlavour getStrengthDenominatorNullFlavourDefiningCode() {
     return this.strengthDenominatorNullFlavourDefiningCode ;
  }

  public void setStrengthDenominatorUnitValue(String strengthDenominatorUnitValue) {
     this.strengthDenominatorUnitValue = strengthDenominatorUnitValue;
  }

  public String getStrengthDenominatorUnitValue() {
     return this.strengthDenominatorUnitValue ;
  }

  public void setStrengthDenominatorUnitNullFlavourDefiningCode(
      NullFlavour strengthDenominatorUnitNullFlavourDefiningCode) {
     this.strengthDenominatorUnitNullFlavourDefiningCode = strengthDenominatorUnitNullFlavourDefiningCode;
  }

  public NullFlavour getStrengthDenominatorUnitNullFlavourDefiningCode() {
     return this.strengthDenominatorUnitNullFlavourDefiningCode ;
  }

  public void setUnitOfPresentationValue(String unitOfPresentationValue) {
     this.unitOfPresentationValue = unitOfPresentationValue;
  }

  public String getUnitOfPresentationValue() {
     return this.unitOfPresentationValue ;
  }

  public void setUnitOfPresentationNullFlavourDefiningCode(
      NullFlavour unitOfPresentationNullFlavourDefiningCode) {
     this.unitOfPresentationNullFlavourDefiningCode = unitOfPresentationNullFlavourDefiningCode;
  }

  public NullFlavour getUnitOfPresentationNullFlavourDefiningCode() {
     return this.unitOfPresentationNullFlavourDefiningCode ;
  }

  public void setStrengthConcentrationMagnitude(Double strengthConcentrationMagnitude) {
     this.strengthConcentrationMagnitude = strengthConcentrationMagnitude;
  }

  public Double getStrengthConcentrationMagnitude() {
     return this.strengthConcentrationMagnitude ;
  }

  public void setStrengthConcentrationUnits(String strengthConcentrationUnits) {
     this.strengthConcentrationUnits = strengthConcentrationUnits;
  }

  public String getStrengthConcentrationUnits() {
     return this.strengthConcentrationUnits ;
  }

  public void setStrengthConcentrationNullFlavourDefiningCode(
      NullFlavour strengthConcentrationNullFlavourDefiningCode) {
     this.strengthConcentrationNullFlavourDefiningCode = strengthConcentrationNullFlavourDefiningCode;
  }

  public NullFlavour getStrengthConcentrationNullFlavourDefiningCode() {
     return this.strengthConcentrationNullFlavourDefiningCode ;
  }

  public void setManufacturerValue(String manufacturerValue) {
     this.manufacturerValue = manufacturerValue;
  }

  public String getManufacturerValue() {
     return this.manufacturerValue ;
  }

  public void setManufacturerNullFlavourDefiningCode(
      NullFlavour manufacturerNullFlavourDefiningCode) {
     this.manufacturerNullFlavourDefiningCode = manufacturerNullFlavourDefiningCode;
  }

  public NullFlavour getManufacturerNullFlavourDefiningCode() {
     return this.manufacturerNullFlavourDefiningCode ;
  }

  public void setBatchId(List<MedicationBatchIdElement> batchId) {
     this.batchId = batchId;
  }

  public List<MedicationBatchIdElement> getBatchId() {
     return this.batchId ;
  }

  public void setExpiryValue(TemporalAccessor expiryValue) {
     this.expiryValue = expiryValue;
  }

  public TemporalAccessor getExpiryValue() {
     return this.expiryValue ;
  }

  public void setExpiryNullFlavourDefiningCode(NullFlavour expiryNullFlavourDefiningCode) {
     this.expiryNullFlavourDefiningCode = expiryNullFlavourDefiningCode;
  }

  public NullFlavour getExpiryNullFlavourDefiningCode() {
     return this.expiryNullFlavourDefiningCode ;
  }

  public void setConstituent(List<Cluster> constituent) {
     this.constituent = constituent;
  }

  public List<Cluster> getConstituent() {
     return this.constituent ;
  }

  public void setAmountMagnitude(Double amountMagnitude) {
     this.amountMagnitude = amountMagnitude;
  }

  public Double getAmountMagnitude() {
     return this.amountMagnitude ;
  }

  public void setAmountUnits(String amountUnits) {
     this.amountUnits = amountUnits;
  }

  public String getAmountUnits() {
     return this.amountUnits ;
  }

  public void setAmountNullFlavourDefiningCode(NullFlavour amountNullFlavourDefiningCode) {
     this.amountNullFlavourDefiningCode = amountNullFlavourDefiningCode;
  }

  public NullFlavour getAmountNullFlavourDefiningCode() {
     return this.amountNullFlavourDefiningCode ;
  }

  public void setAmountUnitValue(String amountUnitValue) {
     this.amountUnitValue = amountUnitValue;
  }

  public String getAmountUnitValue() {
     return this.amountUnitValue ;
  }

  public void setAmountUnitNullFlavourDefiningCode(NullFlavour amountUnitNullFlavourDefiningCode) {
     this.amountUnitNullFlavourDefiningCode = amountUnitNullFlavourDefiningCode;
  }

  public NullFlavour getAmountUnitNullFlavourDefiningCode() {
     return this.amountUnitNullFlavourDefiningCode ;
  }

  public void setAlternateAmountMagnitude(Double alternateAmountMagnitude) {
     this.alternateAmountMagnitude = alternateAmountMagnitude;
  }

  public Double getAlternateAmountMagnitude() {
     return this.alternateAmountMagnitude ;
  }

  public void setAlternateAmountUnits(String alternateAmountUnits) {
     this.alternateAmountUnits = alternateAmountUnits;
  }

  public String getAlternateAmountUnits() {
     return this.alternateAmountUnits ;
  }

  public void setAlternateAmountNullFlavourDefiningCode(
      NullFlavour alternateAmountNullFlavourDefiningCode) {
     this.alternateAmountNullFlavourDefiningCode = alternateAmountNullFlavourDefiningCode;
  }

  public NullFlavour getAlternateAmountNullFlavourDefiningCode() {
     return this.alternateAmountNullFlavourDefiningCode ;
  }

  public void setAlternateAmountUnitValue(String alternateAmountUnitValue) {
     this.alternateAmountUnitValue = alternateAmountUnitValue;
  }

  public String getAlternateAmountUnitValue() {
     return this.alternateAmountUnitValue ;
  }

  public void setAlternateAmountUnitNullFlavourDefiningCode(
      NullFlavour alternateAmountUnitNullFlavourDefiningCode) {
     this.alternateAmountUnitNullFlavourDefiningCode = alternateAmountUnitNullFlavourDefiningCode;
  }

  public NullFlavour getAlternateAmountUnitNullFlavourDefiningCode() {
     return this.alternateAmountUnitNullFlavourDefiningCode ;
  }

  public void setRoleNullFlavourDefiningCode(NullFlavour roleNullFlavourDefiningCode) {
     this.roleNullFlavourDefiningCode = roleNullFlavourDefiningCode;
  }

  public NullFlavour getRoleNullFlavourDefiningCode() {
     return this.roleNullFlavourDefiningCode ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setStructuredDetails(List<Cluster> structuredDetails) {
     this.structuredDetails = structuredDetails;
  }

  public List<Cluster> getStructuredDetails() {
     return this.structuredDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setCategory(MedicationCategoryChoice category) {
     this.category = category;
  }

  public MedicationCategoryChoice getCategory() {
     return this.category ;
  }

  public void setRole(MedicationRoleChoice role) {
     this.role = role;
  }

  public MedicationRoleChoice getRole() {
     return this.role ;
  }
}
