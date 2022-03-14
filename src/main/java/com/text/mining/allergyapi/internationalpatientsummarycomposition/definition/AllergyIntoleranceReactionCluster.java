package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.909086-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AllergyIntoleranceReactionCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Manifestation
   * Description: Clinical symptoms and/or signs that are observed or associated with the adverse reaction.
   * Comment: Manifestation can be expressed as a single word, phrase or brief description. For example: nausea, rash.  'No reaction'may be appropriate where a previous reaction has been noted but the reaction did not re-occur after further exposure. It is preferable that 'Manifestation' should be coded with a terminology, where possible. The values entered here may be used to display on an application screen as part of a list of adverse reactions, as recommended in the UK NHS CUI guidelines.
   *
   *
   *
   * Terminologies commonly used include, but are not limited to, SNOMED-CT or ICD10.
   */
  @Path("/items[at0011]")
  private List<AllergyIntoleranceManifestationElement> manifestation;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Onset
   * Description: Record of the date and/or time of the onset of the reaction.
   */
  @Path("/items[at0027 and name/value='Onset']/value|value")
  private TemporalAccessor onsetValue;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Reaction/Onset/null_flavour
   */
  @Path("/items[at0027 and name/value='Onset']/null_flavour|defining_code")
  private NullFlavour onsetNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Tree/Reaction/Severity/null_flavour
   */
  @Path("/items[at0089 and name/value='Severity']/null_flavour|defining_code")
  private NullFlavour severityNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Reaction details
   * Description: Additional details about the adverse reaction, including anatomical location and Common Toxicity Criteria, can be provided by inclusion of specific archetypes in this SLOT.
   * Comment: May include structured detail about symptoms; the anatomical location of the manifestation; grading, classification or formal severity assessments such as Common Terminology Criteria for Adverse Events; or the Multimedia CLUSTER archetype. [Note: FHIR - These would be extensions as specified in a profile.]
   */
  @Path("/items[at0029]")
  private List<Cluster> reactionDetails;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Exposure details
   * Description: Additional details about exposure to the 'Specific substance', especially in situations where there may have been multiple or cumulative exposures can be provided by inclusion of specific archetypes in this SLOT.
   */
  @Path("/items[at0096]")
  private List<Cluster> exposureDetails;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Clinical management details
   * Description: Additional structured details about clinical management for this reaction event can be provided by inclusion of specific archetypes in this SLOT.
   */
  @Path("/items[at0119]")
  private List<Cluster> clinicalManagementDetails;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Reporting details
   * Description: Additional structured details required for reporting to regulatory bodies can be provided by inclusion of specific archetypes in this SLOT.
   */
  @Path("/items[at0041]")
  private List<Cluster> reportingDetails;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Information source
   * Description: Details about the provenance of the information can be provided by inclusion of specific archetypes in this SLOT.
   * Comment: This SLOT is intended to provide details about the source of information for this particular 'Reaction event'. Details about the source of information for the entire 'Adverse reaction risk' should be recorded using the 'Information Provider' reference model attribute.
   */
  @Path("/items[at0116]")
  private List<Cluster> informationSource;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance/Reaction/Severity
   * Description: Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
   */
  @Path("/items[at0089 and name/value='Severity']/value")
  @Choice
  private AllergyIntoleranceSeverityChoice severity;

  public void setManifestation(List<AllergyIntoleranceManifestationElement> manifestation) {
     this.manifestation = manifestation;
  }

  public List<AllergyIntoleranceManifestationElement> getManifestation() {
     return this.manifestation ;
  }

  public void setOnsetValue(TemporalAccessor onsetValue) {
     this.onsetValue = onsetValue;
  }

  public TemporalAccessor getOnsetValue() {
     return this.onsetValue ;
  }

  public void setOnsetNullFlavourDefiningCode(NullFlavour onsetNullFlavourDefiningCode) {
     this.onsetNullFlavourDefiningCode = onsetNullFlavourDefiningCode;
  }

  public NullFlavour getOnsetNullFlavourDefiningCode() {
     return this.onsetNullFlavourDefiningCode ;
  }

  public void setSeverityNullFlavourDefiningCode(NullFlavour severityNullFlavourDefiningCode) {
     this.severityNullFlavourDefiningCode = severityNullFlavourDefiningCode;
  }

  public NullFlavour getSeverityNullFlavourDefiningCode() {
     return this.severityNullFlavourDefiningCode ;
  }

  public void setReactionDetails(List<Cluster> reactionDetails) {
     this.reactionDetails = reactionDetails;
  }

  public List<Cluster> getReactionDetails() {
     return this.reactionDetails ;
  }

  public void setExposureDetails(List<Cluster> exposureDetails) {
     this.exposureDetails = exposureDetails;
  }

  public List<Cluster> getExposureDetails() {
     return this.exposureDetails ;
  }

  public void setClinicalManagementDetails(List<Cluster> clinicalManagementDetails) {
     this.clinicalManagementDetails = clinicalManagementDetails;
  }

  public List<Cluster> getClinicalManagementDetails() {
     return this.clinicalManagementDetails ;
  }

  public void setReportingDetails(List<Cluster> reportingDetails) {
     this.reportingDetails = reportingDetails;
  }

  public List<Cluster> getReportingDetails() {
     return this.reportingDetails ;
  }

  public void setInformationSource(List<Cluster> informationSource) {
     this.informationSource = informationSource;
  }

  public List<Cluster> getInformationSource() {
     return this.informationSource ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setSeverity(AllergyIntoleranceSeverityChoice severity) {
     this.severity = severity;
  }

  public AllergyIntoleranceSeverityChoice getSeverity() {
     return this.severity ;
  }
}
