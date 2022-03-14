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
@Archetype("openEHR-EHR-EVALUATION.advance_care_directive.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.306115-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AdvanceCareDirectiveEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Type of directive
   * Description: The type of advance care directive.
   * Comment: A short text description of the nature of the advance care directive. Coding of the type of directive with a terminology is preferred, where possible. It is expected that this is largely localised to reflect local policy and legislation.
   *
   * For example, in the Netherlands, advance care directive types include, but are not limited to, 'Treatment prohibition', 'Treatment prohibition with completion of Completed Life', 'Euthanasia request' and 'Declaration of life'.
   *
   * In the UK, advance care directive types include 'Advance Decision', 'Advance Directive' and 'Advance Statement'.
   */
  @Path("/data[at0001]/items[at0005]/value|value")
  private String typeOfDirectiveValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Type of directive/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour typeOfDirectiveNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Status/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Description
   * Description: Narrative description of the overall advance care directive.
   * Comment: May be used to record a narrative overview of the complete advance care directive, which may or may not be supported by structured data. Details of specific structured findings can be included using CLUSTER archetypes in the 'Directive details' slot. This data element may be used to capture legacy data that is not available in a structured format.
   */
  @Path("/data[at0001]/items[at0006]/value|value")
  private String descriptionValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Description/null_flavour
   */
  @Path("/data[at0001]/items[at0006]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Condition
   * Description: The conditions or situations in which the individual wishes the advance care directive to apply.
   * Comment: For example: dementia, brain injury, diseases of the central nervous system, and terminal illness. Coding with a terminology is preferred, where possible.
   *
   * The advance care directive applies to all specified conditions if the individual can no longer make or communicate decisions about their medical treatment and is unlikely to regain the ability to make such decisions. Details of specific decisions that apply to different conditions or situations can be included using CLUSTER archetypes in the 'Directive details' slot.
   */
  @Path("/data[at0001]/items[at0007]")
  private List<AdvanceCareDirectiveConditionElement> condition;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Directive detail
   * Description: Structured details about the advance care directive decisions.
   * Comment: This SLOT should also be used to record details for specific conditions or as per national or other local requirements. For example, in the UK, there may be a specific statement about whether to actively prolong life but only during pregnancy.
   */
  @Path("/data[at0001]/items[at0052]")
  private List<Cluster> directiveDetail;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Directive location
   * Description: Information regarding where the advance care directive is stored and who has a copy of it.
   */
  @Path("/data[at0001]/items[at0058]")
  private List<AdvanceCareDirectiveDirectiveLocationCluster> directiveLocation;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Comment
   * Description: Additional narrative about the advance care directive not captured in other fields.
   */
  @Path("/data[at0001]/items[at0038]/value|value")
  private String commentValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0038]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Valid period start
   * Description: The date/time that marks the beginning of the valid period of time for this advance care directive.
   */
  @Path("/protocol[at0010]/items[at0053]/value|value")
  private TemporalAccessor validPeriodStartValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Valid period start/null_flavour
   */
  @Path("/protocol[at0010]/items[at0053]/null_flavour|defining_code")
  private NullFlavour validPeriodStartNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Valid period end
   * Description: The date/time that marks the conclusion of the valid period of time for this advance care directive.
   * Comment: 'Valid period end' may often overlap with 'Review due date'. However, they may need to be recorded separately in circumstances where a document has an extended period of validity but requires an interim review. That may be due to changed personal circumstances/events or local policy.
   */
  @Path("/protocol[at0010]/items[at0054]/value|value")
  private TemporalAccessor validPeriodEndValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Valid period end/null_flavour
   */
  @Path("/protocol[at0010]/items[at0054]/null_flavour|defining_code")
  private NullFlavour validPeriodEndNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Review due date
   * Description: The date at which the advance care directive is due to be reviewed.
   * Comment: 'Valid period end' may often overlap with 'Review due date'. However, they may need to be recorded separately in circumstances where a document has an extended period of validity but requires an interim review. That may be due to changed personal circumstances/events or local policy.
   */
  @Path("/protocol[at0010]/items[at0056]/value|value")
  private TemporalAccessor reviewDueDateValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Review due date/null_flavour
   */
  @Path("/protocol[at0010]/items[at0056]/null_flavour|defining_code")
  private NullFlavour reviewDueDateNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Last updated
   * Description: The date when this advance directive record was last updated. This may not be a formal review but e.g. a typo correction.
   */
  @Path("/protocol[at0010]/items[at0055]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Last updated/null_flavour
   */
  @Path("/protocol[at0010]/items[at0055]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Witness
   * Description: Personal details of a person who witnesses the completion of the advance care directive.
   * Comment: For example, 'John Smith, Lawyer'.
   */
  @Path("/protocol[at0010]/items[at0025]")
  private List<Cluster> witness;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Mandate
   * Description: Description of any legislation or other authoritative guidance that apply.
   * Comment: For example, 'In England and Wales, advance decisions are covered by the Mental Capacity Act.  Mandate: https://www.bma.org.uk/advice/employment/ethics/consent/consent-tool-kit/9-advance-decisions'. 
   *
   * Or 'Jehovah's Witnesses believe that the Bible prohibits Christians from accepting blood transfusions. Mandate: https://en.wikipedia.org/wiki/Jehovah%27s_Witnesses_and_blood_transfusions'.
   */
  @Path("/protocol[at0010]/items[at0027]")
  private List<AdvanceCareDirectiveMandateElement> mandate;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0010]/items[at0061]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Status
   * Description: The status of the advance care directive.
   */
  @Path("/data[at0001]/items[at0004]/value")
  @Choice
  private AdvanceCareDirectiveStatusChoice status;

  public void setTypeOfDirectiveValue(String typeOfDirectiveValue) {
     this.typeOfDirectiveValue = typeOfDirectiveValue;
  }

  public String getTypeOfDirectiveValue() {
     return this.typeOfDirectiveValue ;
  }

  public void setTypeOfDirectiveNullFlavourDefiningCode(
      NullFlavour typeOfDirectiveNullFlavourDefiningCode) {
     this.typeOfDirectiveNullFlavourDefiningCode = typeOfDirectiveNullFlavourDefiningCode;
  }

  public NullFlavour getTypeOfDirectiveNullFlavourDefiningCode() {
     return this.typeOfDirectiveNullFlavourDefiningCode ;
  }

  public void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode) {
     this.statusNullFlavourDefiningCode = statusNullFlavourDefiningCode;
  }

  public NullFlavour getStatusNullFlavourDefiningCode() {
     return this.statusNullFlavourDefiningCode ;
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

  public void setCondition(List<AdvanceCareDirectiveConditionElement> condition) {
     this.condition = condition;
  }

  public List<AdvanceCareDirectiveConditionElement> getCondition() {
     return this.condition ;
  }

  public void setDirectiveDetail(List<Cluster> directiveDetail) {
     this.directiveDetail = directiveDetail;
  }

  public List<Cluster> getDirectiveDetail() {
     return this.directiveDetail ;
  }

  public void setDirectiveLocation(
      List<AdvanceCareDirectiveDirectiveLocationCluster> directiveLocation) {
     this.directiveLocation = directiveLocation;
  }

  public List<AdvanceCareDirectiveDirectiveLocationCluster> getDirectiveLocation() {
     return this.directiveLocation ;
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

  public void setValidPeriodStartValue(TemporalAccessor validPeriodStartValue) {
     this.validPeriodStartValue = validPeriodStartValue;
  }

  public TemporalAccessor getValidPeriodStartValue() {
     return this.validPeriodStartValue ;
  }

  public void setValidPeriodStartNullFlavourDefiningCode(
      NullFlavour validPeriodStartNullFlavourDefiningCode) {
     this.validPeriodStartNullFlavourDefiningCode = validPeriodStartNullFlavourDefiningCode;
  }

  public NullFlavour getValidPeriodStartNullFlavourDefiningCode() {
     return this.validPeriodStartNullFlavourDefiningCode ;
  }

  public void setValidPeriodEndValue(TemporalAccessor validPeriodEndValue) {
     this.validPeriodEndValue = validPeriodEndValue;
  }

  public TemporalAccessor getValidPeriodEndValue() {
     return this.validPeriodEndValue ;
  }

  public void setValidPeriodEndNullFlavourDefiningCode(
      NullFlavour validPeriodEndNullFlavourDefiningCode) {
     this.validPeriodEndNullFlavourDefiningCode = validPeriodEndNullFlavourDefiningCode;
  }

  public NullFlavour getValidPeriodEndNullFlavourDefiningCode() {
     return this.validPeriodEndNullFlavourDefiningCode ;
  }

  public void setReviewDueDateValue(TemporalAccessor reviewDueDateValue) {
     this.reviewDueDateValue = reviewDueDateValue;
  }

  public TemporalAccessor getReviewDueDateValue() {
     return this.reviewDueDateValue ;
  }

  public void setReviewDueDateNullFlavourDefiningCode(
      NullFlavour reviewDueDateNullFlavourDefiningCode) {
     this.reviewDueDateNullFlavourDefiningCode = reviewDueDateNullFlavourDefiningCode;
  }

  public NullFlavour getReviewDueDateNullFlavourDefiningCode() {
     return this.reviewDueDateNullFlavourDefiningCode ;
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

  public void setWitness(List<Cluster> witness) {
     this.witness = witness;
  }

  public List<Cluster> getWitness() {
     return this.witness ;
  }

  public void setMandate(List<AdvanceCareDirectiveMandateElement> mandate) {
     this.mandate = mandate;
  }

  public List<AdvanceCareDirectiveMandateElement> getMandate() {
     return this.mandate ;
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

  public void setStatus(AdvanceCareDirectiveStatusChoice status) {
     this.status = status;
  }

  public AdvanceCareDirectiveStatusChoice getStatus() {
     return this.status ;
  }
}
