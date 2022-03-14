package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.limitation_of_treatment.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.327209-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class LimitationOfTreatmentEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Status
   * Description: Category describing the presence of any limitation of treatment.
   */
  @Path("/data[at0001]/items[at0002]/value|defining_code")
  private StatusDefiningCode3 statusDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Status/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Per limitation
   * Description: Details about each limitation on treatment
   */
  @Path("/data[at0001]/items[at0006]")
  private List<LimitationOfTreatmentPerLimitationCluster> perLimitation;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Rationale
   * Description: Narrative rationale or justification for the limitation of treatment decision/s.
   */
  @Path("/data[at0001]/items[at0021]/value|value")
  private String rationaleValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Rationale/null_flavour
   */
  @Path("/data[at0001]/items[at0021]/null_flavour|defining_code")
  private NullFlavour rationaleNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Patient awareness
   * Description: Is the patient aware of the limitation of treatment decision/s?
   */
  @Path("/data[at0001]/items[at0022]/value|defining_code")
  private PatientAwarenessDefiningCode patientAwarenessDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Patient awareness/null_flavour
   */
  @Path("/data[at0001]/items[at0022]/null_flavour|defining_code")
  private NullFlavour patientAwarenessNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Carer awareness
   * Description: Narrative description about awareness of the treatment decision/s by carers and family.
   */
  @Path("/data[at0001]/items[at0025]/value|value")
  private String carerAwarenessValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Carer awareness/null_flavour
   */
  @Path("/data[at0001]/items[at0025]/null_flavour|defining_code")
  private NullFlavour carerAwarenessNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Comment
   * Description: Additional narrative about the limitation of treatment decision/s, not captured in other fields.
   */
  @Path("/data[at0001]/items[at0026]/value|value")
  private String commentValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0026]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/ELEMENT
   * Description: *
   */
  @Path("/protocol[at0027]/items[at029]/value|value")
  private TemporalAccessor elementValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/ELEMENT/null_flavour
   */
  @Path("/protocol[at0027]/items[at029]/null_flavour|defining_code")
  private NullFlavour elementNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Review date
   * Description: The date when this Limitation of treatment archetype is due for review.
   */
  @Path("/protocol[at0027]/items[at0030]/value|value")
  private TemporalAccessor reviewDateValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Review date/null_flavour
   */
  @Path("/protocol[at0027]/items[at0030]/null_flavour|defining_code")
  private NullFlavour reviewDateNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0027]/items[at0031]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setStatusDefiningCode(StatusDefiningCode3 statusDefiningCode) {
     this.statusDefiningCode = statusDefiningCode;
  }

  public StatusDefiningCode3 getStatusDefiningCode() {
     return this.statusDefiningCode ;
  }

  public void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode) {
     this.statusNullFlavourDefiningCode = statusNullFlavourDefiningCode;
  }

  public NullFlavour getStatusNullFlavourDefiningCode() {
     return this.statusNullFlavourDefiningCode ;
  }

  public void setPerLimitation(List<LimitationOfTreatmentPerLimitationCluster> perLimitation) {
     this.perLimitation = perLimitation;
  }

  public List<LimitationOfTreatmentPerLimitationCluster> getPerLimitation() {
     return this.perLimitation ;
  }

  public void setRationaleValue(String rationaleValue) {
     this.rationaleValue = rationaleValue;
  }

  public String getRationaleValue() {
     return this.rationaleValue ;
  }

  public void setRationaleNullFlavourDefiningCode(NullFlavour rationaleNullFlavourDefiningCode) {
     this.rationaleNullFlavourDefiningCode = rationaleNullFlavourDefiningCode;
  }

  public NullFlavour getRationaleNullFlavourDefiningCode() {
     return this.rationaleNullFlavourDefiningCode ;
  }

  public void setPatientAwarenessDefiningCode(
      PatientAwarenessDefiningCode patientAwarenessDefiningCode) {
     this.patientAwarenessDefiningCode = patientAwarenessDefiningCode;
  }

  public PatientAwarenessDefiningCode getPatientAwarenessDefiningCode() {
     return this.patientAwarenessDefiningCode ;
  }

  public void setPatientAwarenessNullFlavourDefiningCode(
      NullFlavour patientAwarenessNullFlavourDefiningCode) {
     this.patientAwarenessNullFlavourDefiningCode = patientAwarenessNullFlavourDefiningCode;
  }

  public NullFlavour getPatientAwarenessNullFlavourDefiningCode() {
     return this.patientAwarenessNullFlavourDefiningCode ;
  }

  public void setCarerAwarenessValue(String carerAwarenessValue) {
     this.carerAwarenessValue = carerAwarenessValue;
  }

  public String getCarerAwarenessValue() {
     return this.carerAwarenessValue ;
  }

  public void setCarerAwarenessNullFlavourDefiningCode(
      NullFlavour carerAwarenessNullFlavourDefiningCode) {
     this.carerAwarenessNullFlavourDefiningCode = carerAwarenessNullFlavourDefiningCode;
  }

  public NullFlavour getCarerAwarenessNullFlavourDefiningCode() {
     return this.carerAwarenessNullFlavourDefiningCode ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setElementValue(TemporalAccessor elementValue) {
     this.elementValue = elementValue;
  }

  public TemporalAccessor getElementValue() {
     return this.elementValue ;
  }

  public void setElementNullFlavourDefiningCode(NullFlavour elementNullFlavourDefiningCode) {
     this.elementNullFlavourDefiningCode = elementNullFlavourDefiningCode;
  }

  public NullFlavour getElementNullFlavourDefiningCode() {
     return this.elementNullFlavourDefiningCode ;
  }

  public void setReviewDateValue(TemporalAccessor reviewDateValue) {
     this.reviewDateValue = reviewDateValue;
  }

  public TemporalAccessor getReviewDateValue() {
     return this.reviewDateValue ;
  }

  public void setReviewDateNullFlavourDefiningCode(NullFlavour reviewDateNullFlavourDefiningCode) {
     this.reviewDateNullFlavourDefiningCode = reviewDateNullFlavourDefiningCode;
  }

  public NullFlavour getReviewDateNullFlavourDefiningCode() {
     return this.reviewDateNullFlavourDefiningCode ;
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
}
