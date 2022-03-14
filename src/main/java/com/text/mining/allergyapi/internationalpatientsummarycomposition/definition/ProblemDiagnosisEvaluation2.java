package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.problem_diagnosis.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.190983-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ProblemDiagnosisEvaluation2 implements EntryEntity {
  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String problemDiagnosisNameValue;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/structure/Problem/Diagnosis name/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour problemDiagnosisNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Body site
   * Description: Identification of a simple body site for the location of the problem or diagnosis.
   * Comment: Coding of the name of the anatomical location with a terminology is preferred, where possible.
   * Use this data element to record precoordinated anatomical locations. If the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the 'Structured anatomical location' SLOT in this archetype. Occurrences for this data element are unbounded to allow for clinical scenarios such as describing a rash in multiple locations but where all of the other attributes are identical. If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant.
   */
  @Path("/data[at0001]/items[at0012]")
  private List<ProblemDiagnosisBodySiteElement> bodySite;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Structured body site
   * Description: A structured anatomical location for the problem or diagnosis.
   * Comment: Use this SLOT to insert the CLUSTER.anatomical_location or CLUSTER.relative_location archetypes if the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations.
   *
   * If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, use of this SLOT becomes redundant.
   */
  @Path("/data[at0001]/items[at0039]")
  private List<Cluster> structuredBodySite;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Date/time of onset
   * Description: Estimated or actual date/time that signs or symptoms of the problem/diagnosis were first observed.
   * Comment: Data captured/imported as "Age at onset" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0077]/value|value")
  private TemporalAccessor dateTimeOfOnsetValue;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/structure/Date/time of onset/null_flavour
   */
  @Path("/data[at0001]/items[at0077]/null_flavour|defining_code")
  private NullFlavour dateTimeOfOnsetNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/structure/Severity/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour severityNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Specific details
   * Description: Details that are additionally required to record as unique attributes of this problem or diagnosis.
   * Comment: May include structured detail about the grading or staging of the diagnosis; diagnostic criteria, classification criteria or formal severity assessments such as Common Terminology Criteria for Adverse Events.
   */
  @Path("/data[at0001]/items[at0043]")
  private List<Cluster> specificDetails;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Date of abatement
   * Description: Estimated or actual date/time of resolution or remission for this problem or diagnosis, as determined by a healthcare professional.
   * Comment: Partial dates are acceptable. If the subject of care is under the age of one year, then the complete date or a minimum of the month and year is necessary to enable accurate age calculations - for example, if used to drive decision support. Data captured/imported as "Age at time of resolution" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0030 and name/value='Date of abatement']/value|value")
  private TemporalAccessor dateOfAbatementValue;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/structure/Date of abatement/null_flavour
   */
  @Path("/data[at0001]/items[at0030 and name/value='Date of abatement']/null_flavour|defining_code")
  private NullFlavour dateOfAbatementNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Problem/Diagnosis qualifier
   * Description: Contextual or temporal qualifier for a specified problem or diagnosis.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.problem_qualifier.v1]")
  private ProblemDiagnosisQualifierCluster problemDiagnosisQualifier;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/structure/Diagnostic certainty/null_flavour
   */
  @Path("/data[at0001]/items[at0073]/null_flavour|defining_code")
  private NullFlavour diagnosticCertaintyNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Last updated
   * Description: The date this problem or diagnosis was last updated.
   */
  @Path("/protocol[at0032]/items[at0070]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0032]/items[at0070]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0032]/items[at0071]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   */
  @Path("/data[at0001]/items[at0073]/value")
  @Choice
  private ProblemDiagnosisDiagnosticCertaintyChoice diagnosticCertainty;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   */
  @Path("/data[at0001]/items[at0005]/value")
  @Choice
  private ProblemDiagnosisSeverityChoice severity;

  public void setProblemDiagnosisNameValue(String problemDiagnosisNameValue) {
     this.problemDiagnosisNameValue = problemDiagnosisNameValue;
  }

  public String getProblemDiagnosisNameValue() {
     return this.problemDiagnosisNameValue ;
  }

  public void setProblemDiagnosisNameNullFlavourDefiningCode(
      NullFlavour problemDiagnosisNameNullFlavourDefiningCode) {
     this.problemDiagnosisNameNullFlavourDefiningCode = problemDiagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getProblemDiagnosisNameNullFlavourDefiningCode() {
     return this.problemDiagnosisNameNullFlavourDefiningCode ;
  }

  public void setBodySite(List<ProblemDiagnosisBodySiteElement> bodySite) {
     this.bodySite = bodySite;
  }

  public List<ProblemDiagnosisBodySiteElement> getBodySite() {
     return this.bodySite ;
  }

  public void setStructuredBodySite(List<Cluster> structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public List<Cluster> getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setDateTimeOfOnsetValue(TemporalAccessor dateTimeOfOnsetValue) {
     this.dateTimeOfOnsetValue = dateTimeOfOnsetValue;
  }

  public TemporalAccessor getDateTimeOfOnsetValue() {
     return this.dateTimeOfOnsetValue ;
  }

  public void setDateTimeOfOnsetNullFlavourDefiningCode(
      NullFlavour dateTimeOfOnsetNullFlavourDefiningCode) {
     this.dateTimeOfOnsetNullFlavourDefiningCode = dateTimeOfOnsetNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeOfOnsetNullFlavourDefiningCode() {
     return this.dateTimeOfOnsetNullFlavourDefiningCode ;
  }

  public void setSeverityNullFlavourDefiningCode(NullFlavour severityNullFlavourDefiningCode) {
     this.severityNullFlavourDefiningCode = severityNullFlavourDefiningCode;
  }

  public NullFlavour getSeverityNullFlavourDefiningCode() {
     return this.severityNullFlavourDefiningCode ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setDateOfAbatementValue(TemporalAccessor dateOfAbatementValue) {
     this.dateOfAbatementValue = dateOfAbatementValue;
  }

  public TemporalAccessor getDateOfAbatementValue() {
     return this.dateOfAbatementValue ;
  }

  public void setDateOfAbatementNullFlavourDefiningCode(
      NullFlavour dateOfAbatementNullFlavourDefiningCode) {
     this.dateOfAbatementNullFlavourDefiningCode = dateOfAbatementNullFlavourDefiningCode;
  }

  public NullFlavour getDateOfAbatementNullFlavourDefiningCode() {
     return this.dateOfAbatementNullFlavourDefiningCode ;
  }

  public void setProblemDiagnosisQualifier(
      ProblemDiagnosisQualifierCluster problemDiagnosisQualifier) {
     this.problemDiagnosisQualifier = problemDiagnosisQualifier;
  }

  public ProblemDiagnosisQualifierCluster getProblemDiagnosisQualifier() {
     return this.problemDiagnosisQualifier ;
  }

  public void setDiagnosticCertaintyNullFlavourDefiningCode(
      NullFlavour diagnosticCertaintyNullFlavourDefiningCode) {
     this.diagnosticCertaintyNullFlavourDefiningCode = diagnosticCertaintyNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosticCertaintyNullFlavourDefiningCode() {
     return this.diagnosticCertaintyNullFlavourDefiningCode ;
  }

  public void setLastUpdatedValue(TemporalAccessor lastUpdatedValue) {
     this.lastUpdatedValue = lastUpdatedValue;
  }

  public TemporalAccessor getLastUpdatedValue() {
     return this.lastUpdatedValue ;
  }

  public void setLastUpdatedNullFlavourDefiningCode(
      NullFlavour lastUpdatedNullFlavourDefiningCode) {
     this.lastUpdatedNullFlavourDefiningCode = lastUpdatedNullFlavourDefiningCode;
  }

  public NullFlavour getLastUpdatedNullFlavourDefiningCode() {
     return this.lastUpdatedNullFlavourDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setDiagnosticCertainty(
      ProblemDiagnosisDiagnosticCertaintyChoice diagnosticCertainty) {
     this.diagnosticCertainty = diagnosticCertainty;
  }

  public ProblemDiagnosisDiagnosticCertaintyChoice getDiagnosticCertainty() {
     return this.diagnosticCertainty ;
  }

  public void setSeverity(ProblemDiagnosisSeverityChoice severity) {
     this.severity = severity;
  }

  public ProblemDiagnosisSeverityChoice getSeverity() {
     return this.severity ;
  }
}
