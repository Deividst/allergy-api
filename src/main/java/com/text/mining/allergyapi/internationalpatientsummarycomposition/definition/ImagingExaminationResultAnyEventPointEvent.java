package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.112473-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("POINT_EVENT")
public class ImagingExaminationResultAnyEventPointEvent implements PointEventEntity, ImagingExaminationResultAnyEventChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Test name
   * Description: The name of the imaging examination or procedure performed.
   * Comment: Coding with a terminology, potentially a pre-coordinated term specifying both modality and anatomical location, is desirable where possible. Possible candidate terminologies: LOINC, SNOMED CT or RadLex.
   */
  @Path("/data[at0003]/items[at0004]/value|value")
  private String testNameValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Test name/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour testNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Modality
   * Description: Type of equipment that originally acquired the image or series of images.
   * Comment: Also known as 'Examination type'. For example: Ultrasound; Computed tomography; or X-ray. Coding with a terminology is desirable, where possible. If the modality is specified by a code in the Examination result name, then this field may be redundant.
   */
  @Path("/data[at0003]/items[at0005]/value|value")
  private String modalityValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Modality/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour modalityNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Anatomical site
   * Description: Simple description about the physical place on, or in, the body that was imaged.
   * Comment: This data element is redundant if the anatomical site is identified in the 'Test name'.
   */
  @Path("/data[at0003]/items[at0055]/value|value")
  private String anatomicalSiteValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Anatomical site/null_flavour
   */
  @Path("/data[at0003]/items[at0055]/null_flavour|defining_code")
  private NullFlavour anatomicalSiteNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Structured anatomical site
   * Description: Structured detail about the anatomical site related to the entire result.
   * Comment: Identification of the anatomical site related to a specific finding will be recorded within each instance of CLUSTER.imaging_finding.
   */
  @Path("/data[at0003]/items[at0006]")
  private List<Cluster> structuredAnatomicalSite;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Overall result status
   * Description: The status of the examination result as a whole.
   */
  @Path("/data[at0003]/items[at0007]/value|defining_code")
  private OverallResultStatusDefiningCode overallResultStatusDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Overall result status/null_flavour
   */
  @Path("/data[at0003]/items[at0007]/null_flavour|defining_code")
  private NullFlavour overallResultStatusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Findings
   * Description: Narrative description of the clinical findings.
   */
  @Path("/data[at0003]/items[at0008]/value|value")
  private String findingsValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Findings/null_flavour
   */
  @Path("/data[at0003]/items[at0008]/null_flavour|defining_code")
  private NullFlavour findingsNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding
   * Description: A single finding in an imaging examination.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.imaging_finding.v0]")
  private ImagingFindingCluster imagingFinding;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Comparison with previous
   * Description: Narrative descripition about the comparison of this image, or series of images, with previous similar examinations.
   * Comment: If there is no availability of previous imaging and/or reports this should also be stated using this data element.
   */
  @Path("/data[at0003]/items[at0056]/value|value")
  private String comparisonWithPreviousValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Comparison with previous/null_flavour
   */
  @Path("/data[at0003]/items[at0056]/null_flavour|defining_code")
  private NullFlavour comparisonWithPreviousNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Conclusion
   * Description: Narrative concise, clinically relevant interpretation of all imaging findings, and include a comparison with previous studies where appropriate.
   * Comment: Also referred to as 'Opinion' or 'Impression'.
   */
  @Path("/data[at0003]/items[at0021]/value|value")
  private String conclusionValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Conclusion/null_flavour
   */
  @Path("/data[at0003]/items[at0021]/null_flavour|defining_code")
  private NullFlavour conclusionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging differential diagnosis
   * Description: Single word, phrase or brief description representing a possible condition or diagnosis.
   * Comment: This data element has multiple occurrences to allow for more than one differential diagnoses. Coding with a terminology is preferred, where possible. This data element should be regarded as mutually exclusive to 'Imaging diagnosis' - only one of 'Differential diagnoses' OR 'Imaging diagnosis' should be present in each Imaging examination result.
   */
  @Path("/data[at0003]/items[at0058]")
  private List<ImagingExaminationResultImagingDifferentialDiagnosisElement> imagingDifferentialDiagnosis;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging diagnosis
   * Description: Single word, phrase or brief description representing the likely condition or diagnosis.
   * Comment: This data element has multiple occurrences to allow for more than one diagnoses. Coding with a terminology is preferred, where possible. This data element should be regarded as mutually exclusive to 'Differential diagnoses' - only one of 'Differential diagnoses' OR 'Imaging diagnosis' should be present in the each Imaging examination result.
   */
  @Path("/data[at0003]/items[at0020]")
  private List<ImagingExaminationResultImagingDiagnosisElement> imagingDiagnosis;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Multimedia source
   * Description: A multimedia resource that is generated or acquired during the provision of healthcare.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.multimedia_source.v0]")
  private MultimediaSourceCluster multimediaSource;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree
   * Description: @ internal @
   */
  @Path("/state[at0047]")
  private ItemTree tree;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

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

  public void setModalityValue(String modalityValue) {
     this.modalityValue = modalityValue;
  }

  public String getModalityValue() {
     return this.modalityValue ;
  }

  public void setModalityNullFlavourDefiningCode(NullFlavour modalityNullFlavourDefiningCode) {
     this.modalityNullFlavourDefiningCode = modalityNullFlavourDefiningCode;
  }

  public NullFlavour getModalityNullFlavourDefiningCode() {
     return this.modalityNullFlavourDefiningCode ;
  }

  public void setAnatomicalSiteValue(String anatomicalSiteValue) {
     this.anatomicalSiteValue = anatomicalSiteValue;
  }

  public String getAnatomicalSiteValue() {
     return this.anatomicalSiteValue ;
  }

  public void setAnatomicalSiteNullFlavourDefiningCode(
      NullFlavour anatomicalSiteNullFlavourDefiningCode) {
     this.anatomicalSiteNullFlavourDefiningCode = anatomicalSiteNullFlavourDefiningCode;
  }

  public NullFlavour getAnatomicalSiteNullFlavourDefiningCode() {
     return this.anatomicalSiteNullFlavourDefiningCode ;
  }

  public void setStructuredAnatomicalSite(List<Cluster> structuredAnatomicalSite) {
     this.structuredAnatomicalSite = structuredAnatomicalSite;
  }

  public List<Cluster> getStructuredAnatomicalSite() {
     return this.structuredAnatomicalSite ;
  }

  public void setOverallResultStatusDefiningCode(
      OverallResultStatusDefiningCode overallResultStatusDefiningCode) {
     this.overallResultStatusDefiningCode = overallResultStatusDefiningCode;
  }

  public OverallResultStatusDefiningCode getOverallResultStatusDefiningCode() {
     return this.overallResultStatusDefiningCode ;
  }

  public void setOverallResultStatusNullFlavourDefiningCode(
      NullFlavour overallResultStatusNullFlavourDefiningCode) {
     this.overallResultStatusNullFlavourDefiningCode = overallResultStatusNullFlavourDefiningCode;
  }

  public NullFlavour getOverallResultStatusNullFlavourDefiningCode() {
     return this.overallResultStatusNullFlavourDefiningCode ;
  }

  public void setFindingsValue(String findingsValue) {
     this.findingsValue = findingsValue;
  }

  public String getFindingsValue() {
     return this.findingsValue ;
  }

  public void setFindingsNullFlavourDefiningCode(NullFlavour findingsNullFlavourDefiningCode) {
     this.findingsNullFlavourDefiningCode = findingsNullFlavourDefiningCode;
  }

  public NullFlavour getFindingsNullFlavourDefiningCode() {
     return this.findingsNullFlavourDefiningCode ;
  }

  public void setImagingFinding(ImagingFindingCluster imagingFinding) {
     this.imagingFinding = imagingFinding;
  }

  public ImagingFindingCluster getImagingFinding() {
     return this.imagingFinding ;
  }

  public void setComparisonWithPreviousValue(String comparisonWithPreviousValue) {
     this.comparisonWithPreviousValue = comparisonWithPreviousValue;
  }

  public String getComparisonWithPreviousValue() {
     return this.comparisonWithPreviousValue ;
  }

  public void setComparisonWithPreviousNullFlavourDefiningCode(
      NullFlavour comparisonWithPreviousNullFlavourDefiningCode) {
     this.comparisonWithPreviousNullFlavourDefiningCode = comparisonWithPreviousNullFlavourDefiningCode;
  }

  public NullFlavour getComparisonWithPreviousNullFlavourDefiningCode() {
     return this.comparisonWithPreviousNullFlavourDefiningCode ;
  }

  public void setConclusionValue(String conclusionValue) {
     this.conclusionValue = conclusionValue;
  }

  public String getConclusionValue() {
     return this.conclusionValue ;
  }

  public void setConclusionNullFlavourDefiningCode(NullFlavour conclusionNullFlavourDefiningCode) {
     this.conclusionNullFlavourDefiningCode = conclusionNullFlavourDefiningCode;
  }

  public NullFlavour getConclusionNullFlavourDefiningCode() {
     return this.conclusionNullFlavourDefiningCode ;
  }

  public void setImagingDifferentialDiagnosis(
      List<ImagingExaminationResultImagingDifferentialDiagnosisElement> imagingDifferentialDiagnosis) {
     this.imagingDifferentialDiagnosis = imagingDifferentialDiagnosis;
  }

  public List<ImagingExaminationResultImagingDifferentialDiagnosisElement> getImagingDifferentialDiagnosis(
      ) {
     return this.imagingDifferentialDiagnosis ;
  }

  public void setImagingDiagnosis(
      List<ImagingExaminationResultImagingDiagnosisElement> imagingDiagnosis) {
     this.imagingDiagnosis = imagingDiagnosis;
  }

  public List<ImagingExaminationResultImagingDiagnosisElement> getImagingDiagnosis() {
     return this.imagingDiagnosis ;
  }

  public void setMultimediaSource(MultimediaSourceCluster multimediaSource) {
     this.multimediaSource = multimediaSource;
  }

  public MultimediaSourceCluster getMultimediaSource() {
     return this.multimediaSource ;
  }

  public void setTree(ItemTree tree) {
     this.tree = tree;
  }

  public ItemTree getTree() {
     return this.tree ;
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
}
