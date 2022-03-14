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
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.alcohol_consumption_summary.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.212908-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AlcoholConsumptionSummaryEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Overall status
   * Description: Statement about current consumption for all types of alcohol.
   */
  @Path("/data[at0001]/items[at0089]/value|defining_code")
  private OverallStatusDefiningCode2 overallStatusDefiningCode;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Tree/Overall status/null_flavour
   */
  @Path("/data[at0001]/items[at0089]/null_flavour|defining_code")
  private NullFlavour overallStatusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Per episode
   * Description: Details about a discrete period of time with a consistent pattern of typical consumption.
   */
  @Path("/data[at0001]/items[at0064]")
  private List<AlcoholConsumptionSummaryPerEpisodeCluster> perEpisode;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Overall details
   * Description: Additional structured details about the overall alcohol consumption.
   */
  @Path("/data[at0001]/items[at0086]")
  private List<Cluster> overallDetails;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0021]/items[at0073]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setOverallStatusDefiningCode(OverallStatusDefiningCode2 overallStatusDefiningCode) {
     this.overallStatusDefiningCode = overallStatusDefiningCode;
  }

  public OverallStatusDefiningCode2 getOverallStatusDefiningCode() {
     return this.overallStatusDefiningCode ;
  }

  public void setOverallStatusNullFlavourDefiningCode(
      NullFlavour overallStatusNullFlavourDefiningCode) {
     this.overallStatusNullFlavourDefiningCode = overallStatusNullFlavourDefiningCode;
  }

  public NullFlavour getOverallStatusNullFlavourDefiningCode() {
     return this.overallStatusNullFlavourDefiningCode ;
  }

  public void setPerEpisode(List<AlcoholConsumptionSummaryPerEpisodeCluster> perEpisode) {
     this.perEpisode = perEpisode;
  }

  public List<AlcoholConsumptionSummaryPerEpisodeCluster> getPerEpisode() {
     return this.perEpisode ;
  }

  public void setOverallDetails(List<Cluster> overallDetails) {
     this.overallDetails = overallDetails;
  }

  public List<Cluster> getOverallDetails() {
     return this.overallDetails ;
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
