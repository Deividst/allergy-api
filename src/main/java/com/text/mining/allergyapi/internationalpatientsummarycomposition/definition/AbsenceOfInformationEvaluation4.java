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
@Archetype("openEHR-EHR-EVALUATION.absence.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.955030-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AbsenceOfInformationEvaluation4 implements EntryEntity {
  /**
   * Path: International Patient Summary/Immunizations/Absence of information/Absence statement
   * Description: Positive statement that no information is available.
   * Comment: For example: "No information available about adverse reactions"; No information available about problems or diagnoses"; "No information available about previous procedures performed"; or "No information available about medications used".
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String absenceStatementValue;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/Tree/Absence statement/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour absenceStatementNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/Last updated
   * Description: The date at which the absence was last updated.
   */
  @Path("/protocol[at0003]/items[at0004]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0003]/items[at0006]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setAbsenceStatementValue(String absenceStatementValue) {
     this.absenceStatementValue = absenceStatementValue;
  }

  public String getAbsenceStatementValue() {
     return this.absenceStatementValue ;
  }

  public void setAbsenceStatementNullFlavourDefiningCode(
      NullFlavour absenceStatementNullFlavourDefiningCode) {
     this.absenceStatementNullFlavourDefiningCode = absenceStatementNullFlavourDefiningCode;
  }

  public NullFlavour getAbsenceStatementNullFlavourDefiningCode() {
     return this.absenceStatementNullFlavourDefiningCode ;
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
