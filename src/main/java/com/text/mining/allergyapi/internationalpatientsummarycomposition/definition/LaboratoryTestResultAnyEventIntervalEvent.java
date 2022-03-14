package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.019405-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class LaboratoryTestResultAnyEventIntervalEvent implements IntervalEventEntity, LaboratoryTestResultAnyEventChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Test name
   * Description: Name of the laboratory investigation performed on the specimen(s).
   * Comment: A test result may be for a single analyte, or a group of items, including panel tests. It is strongly recommended that 'Test name' be coded with a terminology, for example LOINC or SNOMED CT. For example: 'Glucose', 'Urea and Electrolytes', 'Swab', 'Cortisol (am)', 'Potassium in perspiration' or 'Melanoma histopathology'. The name may sometimes include specimen type and patient state, for example 'Fasting blood glucose' or include other information, as 'Potassium (PNA blood gas)'.
   */
  @Path("/data[at0003]/items[at0005]/value|value")
  private String testNameValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Test name/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour testNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen
   * Description: A physical sample collected from, or related to, an individual for the purpose of investigation, examination or analysis.
   * Comment: For example: Tissue or body fluid.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.specimen.v1]")
  private SpecimenCluster specimen;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Diagnostic service category
   * Description: The diagnostic service or discipline that is responsible for the laboratory test result.
   * Comment: This is intended to be a general categorisation and not to capture the organisational name of the laboratory. For example: anatomical pathology, immunology and transfusion medicine, medical microbiology, clinical pharmacology, medical genetics, medical biochemistry. Alternatively more granular sub categories or sub disciplines, such as endocrinology, haematology, and allergology services, may be used. This may assist clinicians in filtering between categories of results. Coding with a terminology is desirable, where possible.
   */
  @Path("/data[at0003]/items[at0077]/value|value")
  private String diagnosticServiceCategoryValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Diagnostic service category/null_flavour
   */
  @Path("/data[at0003]/items[at0077]/null_flavour|defining_code")
  private NullFlavour diagnosticServiceCategoryNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result
   * Description: The result of a laboratory test for a single analyte value.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.laboratory_test_analyte.v1]")
  private LaboratoryAnalyteResultCluster laboratoryAnalyteResult;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Interpretation
   * Description: Narrative description of the key findings.
   * Comment: For example: 'Pattern suggests significant renal impairment'. The content of the conclusion will vary, depending on the investigation performed. This conclusion should be aligned with the coded 'Test diagnosis'.
   */
  @Path("/data[at0003]/items[at0057 and name/value='Interpretation']/value|value")
  private String interpretationValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Interpretation/null_flavour
   */
  @Path("/data[at0003]/items[at0057 and name/value='Interpretation']/null_flavour|defining_code")
  private NullFlavour interpretationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Structured test diagnosis
   * Description: A structured or complex diagnosis for the laboratory test.
   * Comment: For example: Anatomical pathology diagnoses consisting of several different axes such as morphology, etiology and function.
   */
  @Path("/data[at0003]/items[at0122]")
  private List<Cluster> structuredTestDiagnosis;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source
   * Description: A multimedia resource that is generated or acquired during the provision of healthcare.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.multimedia_source.v0]")
  private MultimediaSourceCluster multimediaSource;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Structured confounding factors
   * Description: Details of issues or circumstances that impact on the accurate interpretation of the measurement or test result.
   * Comment: For example: Last Normal Menstrual Period (LNMP).
   */
  @Path("/state[at0112]/items[at0114]")
  private List<Cluster> structuredConfoundingFactors;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setTestNameValue(String testNameValue) {
     this.testNameValue = testNameValue;
  }

  public String getTestNameValue() {
     return this.testNameValue ;
  }

  public void setTestNameNullFlavourDefiningCode(NullFlavour testNameNullFlavourDefiningCode) {
     this.testNameNullFlavourDefiningCode = testNameNullFlavourDefiningCode;
  }

  public NullFlavour getTestNameNullFlavourDefiningCode() {
     return this.testNameNullFlavourDefiningCode ;
  }

  public void setSpecimen(SpecimenCluster specimen) {
     this.specimen = specimen;
  }

  public SpecimenCluster getSpecimen() {
     return this.specimen ;
  }

  public void setDiagnosticServiceCategoryValue(String diagnosticServiceCategoryValue) {
     this.diagnosticServiceCategoryValue = diagnosticServiceCategoryValue;
  }

  public String getDiagnosticServiceCategoryValue() {
     return this.diagnosticServiceCategoryValue ;
  }

  public void setDiagnosticServiceCategoryNullFlavourDefiningCode(
      NullFlavour diagnosticServiceCategoryNullFlavourDefiningCode) {
     this.diagnosticServiceCategoryNullFlavourDefiningCode = diagnosticServiceCategoryNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosticServiceCategoryNullFlavourDefiningCode() {
     return this.diagnosticServiceCategoryNullFlavourDefiningCode ;
  }

  public void setLaboratoryAnalyteResult(LaboratoryAnalyteResultCluster laboratoryAnalyteResult) {
     this.laboratoryAnalyteResult = laboratoryAnalyteResult;
  }

  public LaboratoryAnalyteResultCluster getLaboratoryAnalyteResult() {
     return this.laboratoryAnalyteResult ;
  }

  public void setInterpretationValue(String interpretationValue) {
     this.interpretationValue = interpretationValue;
  }

  public String getInterpretationValue() {
     return this.interpretationValue ;
  }

  public void setInterpretationNullFlavourDefiningCode(
      NullFlavour interpretationNullFlavourDefiningCode) {
     this.interpretationNullFlavourDefiningCode = interpretationNullFlavourDefiningCode;
  }

  public NullFlavour getInterpretationNullFlavourDefiningCode() {
     return this.interpretationNullFlavourDefiningCode ;
  }

  public void setStructuredTestDiagnosis(List<Cluster> structuredTestDiagnosis) {
     this.structuredTestDiagnosis = structuredTestDiagnosis;
  }

  public List<Cluster> getStructuredTestDiagnosis() {
     return this.structuredTestDiagnosis ;
  }

  public void setMultimediaSource(MultimediaSourceCluster multimediaSource) {
     this.multimediaSource = multimediaSource;
  }

  public MultimediaSourceCluster getMultimediaSource() {
     return this.multimediaSource ;
  }

  public void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors) {
     this.structuredConfoundingFactors = structuredConfoundingFactors;
  }

  public List<Cluster> getStructuredConfoundingFactors() {
     return this.structuredConfoundingFactors ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
