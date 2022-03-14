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
@Archetype("openEHR-EHR-EVALUATION.clinical_synopsis.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.297915-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ClinicalImpressionEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Functional Status/Clinical impression/Impression
   * Description: The summary, assessment, conclusions or evaluation of the clinical findings.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Impression']/value|value")
  private String impressionValue;

  /**
   * Path: International Patient Summary/Functional Status/Clinical impression/List/Impression/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Impression']/null_flavour|defining_code")
  private NullFlavour impressionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Functional Status/Clinical impression/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0003]/items[at0004]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Functional Status/Clinical impression/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Functional Status/Clinical impression/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Functional Status/Clinical impression/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setImpressionValue(String impressionValue) {
     this.impressionValue = impressionValue;
  }

  public String getImpressionValue() {
     return this.impressionValue ;
  }

  public void setImpressionNullFlavourDefiningCode(NullFlavour impressionNullFlavourDefiningCode) {
     this.impressionNullFlavourDefiningCode = impressionNullFlavourDefiningCode;
  }

  public NullFlavour getImpressionNullFlavourDefiningCode() {
     return this.impressionNullFlavourDefiningCode ;
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
