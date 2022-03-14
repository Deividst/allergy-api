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
@Archetype("openEHR-EHR-EVALUATION.estimated_date_delivery.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.200687-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class EstimatedDateOfDeliveryEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/By date of conception
   * Description: The EDD calculated from a known date of conception.
   * Comment: The date of conception will be recorded elsewhere in the health record, for example as part of the record for an IVF procedure.
   */
  @Path("/data[at0002]/items[at0003]/value|value")
  private TemporalAccessor byDateOfConceptionValue;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Item tree/By date of conception/null_flavour
   */
  @Path("/data[at0002]/items[at0003]/null_flavour|defining_code")
  private NullFlavour byDateOfConceptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/By cycle
   * Description: The EDD estimated from an LNMP and characteristics of the menstrual cycle.
   * Comment: The details about the menstrual cycle will be recorded elsewhere in the health record, usually captured using the OBSERVATION.menstruation archetype.
   */
  @Path("/data[at0002]/items[at0004]/value|value")
  private TemporalAccessor byCycleValue;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Item tree/By cycle/null_flavour
   */
  @Path("/data[at0002]/items[at0004]/null_flavour|defining_code")
  private NullFlavour byCycleNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/By ultrasound/Estimated date by ultrasound
   * Description: Details about an EDD estimated from the findings on a pregnancy ultrasound.
   * Comment: Only one 'Agreed EDD' is appropriate at any one time. If the agreed EDD needs to be revised then this should be captured in a new revision of this archetype within a health record.
   */
  @Path("/data[at0002]/items[at0006]/items[at0008]/value|value")
  private TemporalAccessor estimatedDateByUltrasoundValue;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Item tree/By ultrasound/Estimated date by ultrasound/null_flavour
   */
  @Path("/data[at0002]/items[at0006]/items[at0008]/null_flavour|defining_code")
  private NullFlavour estimatedDateByUltrasoundNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Agreed EDD
   * Description: Details about the agreed EDD which is used as the basis for clinical decision-making during the pregnancy.
   */
  @Path("/data[at0002]/items[at0009]")
  private List<EstimatedDateOfDeliveryAgreedEddCluster> agreedEdd;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Last updated
   * Description: The date any EDD was last updated.
   */
  @Path("/protocol[at0001]/items[at0013]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Item tree/Last updated/null_flavour
   */
  @Path("/protocol[at0001]/items[at0013]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0001]/items[at0012]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setByDateOfConceptionValue(TemporalAccessor byDateOfConceptionValue) {
     this.byDateOfConceptionValue = byDateOfConceptionValue;
  }

  public TemporalAccessor getByDateOfConceptionValue() {
     return this.byDateOfConceptionValue ;
  }

  public void setByDateOfConceptionNullFlavourDefiningCode(
      NullFlavour byDateOfConceptionNullFlavourDefiningCode) {
     this.byDateOfConceptionNullFlavourDefiningCode = byDateOfConceptionNullFlavourDefiningCode;
  }

  public NullFlavour getByDateOfConceptionNullFlavourDefiningCode() {
     return this.byDateOfConceptionNullFlavourDefiningCode ;
  }

  public void setByCycleValue(TemporalAccessor byCycleValue) {
     this.byCycleValue = byCycleValue;
  }

  public TemporalAccessor getByCycleValue() {
     return this.byCycleValue ;
  }

  public void setByCycleNullFlavourDefiningCode(NullFlavour byCycleNullFlavourDefiningCode) {
     this.byCycleNullFlavourDefiningCode = byCycleNullFlavourDefiningCode;
  }

  public NullFlavour getByCycleNullFlavourDefiningCode() {
     return this.byCycleNullFlavourDefiningCode ;
  }

  public void setEstimatedDateByUltrasoundValue(TemporalAccessor estimatedDateByUltrasoundValue) {
     this.estimatedDateByUltrasoundValue = estimatedDateByUltrasoundValue;
  }

  public TemporalAccessor getEstimatedDateByUltrasoundValue() {
     return this.estimatedDateByUltrasoundValue ;
  }

  public void setEstimatedDateByUltrasoundNullFlavourDefiningCode(
      NullFlavour estimatedDateByUltrasoundNullFlavourDefiningCode) {
     this.estimatedDateByUltrasoundNullFlavourDefiningCode = estimatedDateByUltrasoundNullFlavourDefiningCode;
  }

  public NullFlavour getEstimatedDateByUltrasoundNullFlavourDefiningCode() {
     return this.estimatedDateByUltrasoundNullFlavourDefiningCode ;
  }

  public void setAgreedEdd(List<EstimatedDateOfDeliveryAgreedEddCluster> agreedEdd) {
     this.agreedEdd = agreedEdd;
  }

  public List<EstimatedDateOfDeliveryAgreedEddCluster> getAgreedEdd() {
     return this.agreedEdd ;
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
}
