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
@Archetype("openEHR-EHR-EVALUATION.exclusion_global.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.894635-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ExclusionGlobalEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global/Global exclusion of medication use
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items.
   * Comment: For example: 'No previous diagnoses', 'No known family history', 'No known history of adverse reactions', 'Never taken any medications' or 'No known operations or significant procedures'.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of medication use']/value|value")
  private String globalExclusionOfMedicationUseValue;

  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global/Tree/Global exclusion of medication use/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of medication use']/null_flavour|defining_code")
  private NullFlavour globalExclusionOfMedicationUseNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0008]/items[at0010]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setGlobalExclusionOfMedicationUseValue(String globalExclusionOfMedicationUseValue) {
     this.globalExclusionOfMedicationUseValue = globalExclusionOfMedicationUseValue;
  }

  public String getGlobalExclusionOfMedicationUseValue() {
     return this.globalExclusionOfMedicationUseValue ;
  }

  public void setGlobalExclusionOfMedicationUseNullFlavourDefiningCode(
      NullFlavour globalExclusionOfMedicationUseNullFlavourDefiningCode) {
     this.globalExclusionOfMedicationUseNullFlavourDefiningCode = globalExclusionOfMedicationUseNullFlavourDefiningCode;
  }

  public NullFlavour getGlobalExclusionOfMedicationUseNullFlavourDefiningCode() {
     return this.globalExclusionOfMedicationUseNullFlavourDefiningCode ;
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
