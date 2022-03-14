package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Archetype("openEHR-EHR-CLUSTER.problem_qualifier.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.932792-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ProblemDiagnosisQualifierCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Problem/Diagnosis qualifier/Active/Inactive?
   * Description: Category that supports division of problems and diagnoses into Active or Inactive problem lists.
   * Comment: The Active/Inactive and Current/Past data elements have similar clinical impact but represent slightly different semantics. Both are actively used in different clinical settings, but usually not together. If a Current/Past qualifier is recorded, then this data element is likely to be redundant. An exception where a condition can be current but inactive is asthma that is not causing acute symptoms.
   */
  @Path("/items[at0003]/value|defining_code")
  private ActiveInactiveDefiningCode activeInactiveDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Active/Inactive?/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour activeInactiveNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Problem/Diagnosis qualifier/Resolution phase
   * Description: Phase of healing for an acute problem or diagnosis.
   * Comment: For example: tracking the progress of resolution of a middle ear infection.
   */
  @Path("/items[at0083]/value|defining_code")
  private ResolutionPhaseDefiningCode resolutionPhaseDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Resolution phase/null_flavour
   */
  @Path("/items[at0083]/null_flavour|defining_code")
  private NullFlavour resolutionPhaseNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Problem/Diagnosis qualifier/Remission status
   * Description: Status of the remission of an incurable diagnosis.
   * Comment: For example: the status of a cancer or haematological diagnosis.
   */
  @Path("/items[at0089]/value|defining_code")
  private RemissionStatusDefiningCode remissionStatusDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Remission status/null_flavour
   */
  @Path("/items[at0089]/null_flavour|defining_code")
  private NullFlavour remissionStatusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Problem/Diagnosis qualifier/Occurrence
   * Description: Category of the occurrence for this problem or diagnosis.
   * Comment: This data element can be an additional qualifier to the 'New' value in the 'Episodicity' value set, that is a condition such as asthma can have recurring new episodes that have periods of resolution in between. However it can be important to identify the first ever episode of asthma from all of the other episodes.
   */
  @Path("/items[at0071]/value|defining_code")
  private OccurrenceDefiningCode occurrenceDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Occurrence/null_flavour
   */
  @Path("/items[at0071]/null_flavour|defining_code")
  private NullFlavour occurrenceNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis/Problem/Diagnosis qualifier/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setActiveInactiveDefiningCode(ActiveInactiveDefiningCode activeInactiveDefiningCode) {
     this.activeInactiveDefiningCode = activeInactiveDefiningCode;
  }

  public ActiveInactiveDefiningCode getActiveInactiveDefiningCode() {
     return this.activeInactiveDefiningCode ;
  }

  public void setActiveInactiveNullFlavourDefiningCode(
      NullFlavour activeInactiveNullFlavourDefiningCode) {
     this.activeInactiveNullFlavourDefiningCode = activeInactiveNullFlavourDefiningCode;
  }

  public NullFlavour getActiveInactiveNullFlavourDefiningCode() {
     return this.activeInactiveNullFlavourDefiningCode ;
  }

  public void setResolutionPhaseDefiningCode(
      ResolutionPhaseDefiningCode resolutionPhaseDefiningCode) {
     this.resolutionPhaseDefiningCode = resolutionPhaseDefiningCode;
  }

  public ResolutionPhaseDefiningCode getResolutionPhaseDefiningCode() {
     return this.resolutionPhaseDefiningCode ;
  }

  public void setResolutionPhaseNullFlavourDefiningCode(
      NullFlavour resolutionPhaseNullFlavourDefiningCode) {
     this.resolutionPhaseNullFlavourDefiningCode = resolutionPhaseNullFlavourDefiningCode;
  }

  public NullFlavour getResolutionPhaseNullFlavourDefiningCode() {
     return this.resolutionPhaseNullFlavourDefiningCode ;
  }

  public void setRemissionStatusDefiningCode(
      RemissionStatusDefiningCode remissionStatusDefiningCode) {
     this.remissionStatusDefiningCode = remissionStatusDefiningCode;
  }

  public RemissionStatusDefiningCode getRemissionStatusDefiningCode() {
     return this.remissionStatusDefiningCode ;
  }

  public void setRemissionStatusNullFlavourDefiningCode(
      NullFlavour remissionStatusNullFlavourDefiningCode) {
     this.remissionStatusNullFlavourDefiningCode = remissionStatusNullFlavourDefiningCode;
  }

  public NullFlavour getRemissionStatusNullFlavourDefiningCode() {
     return this.remissionStatusNullFlavourDefiningCode ;
  }

  public void setOccurrenceDefiningCode(OccurrenceDefiningCode occurrenceDefiningCode) {
     this.occurrenceDefiningCode = occurrenceDefiningCode;
  }

  public OccurrenceDefiningCode getOccurrenceDefiningCode() {
     return this.occurrenceDefiningCode ;
  }

  public void setOccurrenceNullFlavourDefiningCode(NullFlavour occurrenceNullFlavourDefiningCode) {
     this.occurrenceNullFlavourDefiningCode = occurrenceNullFlavourDefiningCode;
  }

  public NullFlavour getOccurrenceNullFlavourDefiningCode() {
     return this.occurrenceNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
