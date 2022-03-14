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
@Archetype("openEHR-EHR-EVALUATION.adverse_reaction_risk.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.903168-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AllergyIntoleranceEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Substance
   * Description: Identification of a substance, or substance class, that is considered to put the individual at risk of an adverse reaction event.
   * Comment: Both an individual substance and a substance class are valid entries in 'Substance'. A substance may be a compound of simpler substances, for example a medicinal product. If the value in 'Substance' is an individual substance, it may be duplicated in 'Specific substance'. It is strongly recommended that both 'Substance' and 'Specific substance' be coded with a terminology capable of triggering decision support, where possible. For example: Snomed CT, DM+D, RxNorm, NDFRT, ATC, New Zealand Universal List of Medicines and Australian Medicines Terminology. Free text entry should only be used if there is no appropriate terminology available.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String substanceValue;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Substance/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour substanceNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Verification status/null_flavour
   */
  @Path("/data[at0001]/items[at0063 and name/value='Verification status']/null_flavour|defining_code")
  private NullFlavour verificationStatusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Criticality
   * Description: An indication of the potential for critical system organ damage or life threatening consequence.
   * Comment: This can be regarded as a predictive judgement of a 'worst case scenario'.
   *  In most contexts 'Low' would be regarded as the default value.
   */
  @Path("/data[at0001]/items[at0101]/value|defining_code")
  private CriticalityDefiningCode criticalityDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Criticality/null_flavour
   */
  @Path("/data[at0001]/items[at0101]/null_flavour|defining_code")
  private NullFlavour criticalityNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Type
   * Description: Identification of the underlying physiological mechanism for the adverse reaction.
   * Comment: Immune-mediated responses have been traditionally regarded as an indicator for escalation of significant future risk. Contemporary knowledge suggests that some reactions previously thought to be immune are actually non-immune and still carry life threatening risk. 
   *
   * Immunological testing may provide supporting evidence for the mechanism and causative substance , but no tests are 100% sensitive or specific for a sensitivity. 
   *
   * It is acknowledged that most clinicians will NOT be able to distinguish the mechanism of any specific reaction. However this data element is included because many legacy systems have captured this attribute.
   */
  @Path("/data[at0001]/items[at0058 and name/value='Type']/value|value")
  private String typeValue;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Type/null_flavour
   */
  @Path("/data[at0001]/items[at0058 and name/value='Type']/null_flavour|defining_code")
  private NullFlavour typeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Comment
   * Description: Additional narrative about the propensity for the adverse reaction, not captured in other fields.
   * Comment: For example: including reason for flagging a 'Criticality' of 'High risk'; and instructions related to future exposure or administration of the Substance, such as administration within an Intensive Care Unit or under corticosteroid cover.
   */
  @Path("/data[at0001]/items[at0006]/value|value")
  private String commentValue;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0006]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction
   * Description: Details about each adverse reaction event linked to exposure to the identified 'Substance'.
   */
  @Path("/data[at0001]/items[at0009 and name/value='Reaction']")
  private List<AllergyIntoleranceReactionCluster> reaction;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Last updated
   * Description: Date when the propensity or the reaction event was updated.
   * Comment: Note: maps to recordedDate in FHIR.
   */
  @Path("/protocol[at0042]/items[at0062]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0042]/items[at0062]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0042]/items[at0128]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Verification status
   * Description: Assertion about the certainty of the propensity, or potential future risk, of the identified 'Substance' to cause a reaction.
   */
  @Path("/data[at0001]/items[at0063 and name/value='Verification status']/value")
  @Choice
  private AllergyIntoleranceVerificationStatusChoice verificationStatus;

  public void setSubstanceValue(String substanceValue) {
     this.substanceValue = substanceValue;
  }

  public String getSubstanceValue() {
     return this.substanceValue ;
  }

  public void setSubstanceNullFlavourDefiningCode(NullFlavour substanceNullFlavourDefiningCode) {
     this.substanceNullFlavourDefiningCode = substanceNullFlavourDefiningCode;
  }

  public NullFlavour getSubstanceNullFlavourDefiningCode() {
     return this.substanceNullFlavourDefiningCode ;
  }

  public void setVerificationStatusNullFlavourDefiningCode(
      NullFlavour verificationStatusNullFlavourDefiningCode) {
     this.verificationStatusNullFlavourDefiningCode = verificationStatusNullFlavourDefiningCode;
  }

  public NullFlavour getVerificationStatusNullFlavourDefiningCode() {
     return this.verificationStatusNullFlavourDefiningCode ;
  }

  public void setCriticalityDefiningCode(CriticalityDefiningCode criticalityDefiningCode) {
     this.criticalityDefiningCode = criticalityDefiningCode;
  }

  public CriticalityDefiningCode getCriticalityDefiningCode() {
     return this.criticalityDefiningCode ;
  }

  public void setCriticalityNullFlavourDefiningCode(
      NullFlavour criticalityNullFlavourDefiningCode) {
     this.criticalityNullFlavourDefiningCode = criticalityNullFlavourDefiningCode;
  }

  public NullFlavour getCriticalityNullFlavourDefiningCode() {
     return this.criticalityNullFlavourDefiningCode ;
  }

  public void setTypeValue(String typeValue) {
     this.typeValue = typeValue;
  }

  public String getTypeValue() {
     return this.typeValue ;
  }

  public void setTypeNullFlavourDefiningCode(NullFlavour typeNullFlavourDefiningCode) {
     this.typeNullFlavourDefiningCode = typeNullFlavourDefiningCode;
  }

  public NullFlavour getTypeNullFlavourDefiningCode() {
     return this.typeNullFlavourDefiningCode ;
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

  public void setReaction(List<AllergyIntoleranceReactionCluster> reaction) {
     this.reaction = reaction;
  }

  public List<AllergyIntoleranceReactionCluster> getReaction() {
     return this.reaction ;
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

  public void setVerificationStatus(AllergyIntoleranceVerificationStatusChoice verificationStatus) {
     this.verificationStatus = verificationStatus;
  }

  public AllergyIntoleranceVerificationStatusChoice getVerificationStatus() {
     return this.verificationStatus ;
  }
}
