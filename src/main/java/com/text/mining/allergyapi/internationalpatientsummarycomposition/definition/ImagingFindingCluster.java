package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.imaging_finding.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.099515-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImagingFindingCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Finding name
   * Description: The name of the finding.
   * Comment: Coding with an external terminology is strongly recommended.
   */
  @Path("/items[at0024]/value|value")
  private String findingNameValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Imaging finding/Finding name/null_flavour
   */
  @Path("/items[at0024]/null_flavour|defining_code")
  private NullFlavour findingNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Anatomical location
   * Description: Simple description of anatomical location.
   */
  @Path("/items[at0033]/value|value")
  private String anatomicalLocationValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Imaging finding/Anatomical location/null_flavour
   */
  @Path("/items[at0033]/null_flavour|defining_code")
  private NullFlavour anatomicalLocationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Structured anatomical location
   * Description: Structured details about the location of the finding.
   */
  @Path("/items[at0034]")
  private List<Cluster> structuredAnatomicalLocation;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Presence?
   * Description: The presence or absence of the finding.
   * Comment: For example '7.3 mmol/l', 'Raised'. The 'Any' data type will need to be constrained to an appropriate data type in a specialisation, a template or at run-time to reflect the actual analyte result. The Quantity data type has reference model attributes that include flags for normal/abnormal, reference ranges and approximations - see https://specifications.openehr.org/releases/RM/latest/data_types.html#_dv_quantity_class for more details.
   */
  @Path("/items[at0001]")
  private List<ImagingFindingPresenceElement> presence;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Description
   * Description: Narrative description about the observed clinical finding.
   */
  @Path("/items[at0028]/value|value")
  private String descriptionValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Imaging finding/Description/null_flavour
   */
  @Path("/items[at0028]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Structured detail
   * Description: Additional structured detail about the finding.
   */
  @Path("/items[at0014]")
  private List<Cluster> structuredDetail;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Imaging finding/Comparison to previous/null_flavour
   */
  @Path("/items[at0029]/null_flavour|defining_code")
  private NullFlavour comparisonToPreviousNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Comment
   * Description: Additional narrative about the finding, not captured in other fields.
   */
  @Path("/items[at0003]")
  private List<ImagingFindingCommentElement> comment;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Comparison to previous
   * Description: Narrative description about the difference between a previous finding and the finding in this report.
   */
  @Path("/items[at0029]/value")
  @Choice
  private ImagingFindingComparisonToPreviousChoice comparisonToPrevious;

  public void setFindingNameValue(String findingNameValue) {
     this.findingNameValue = findingNameValue;
  }

  public String getFindingNameValue() {
     return this.findingNameValue ;
  }

  public void setFindingNameNullFlavourDefiningCode(
      NullFlavour findingNameNullFlavourDefiningCode) {
     this.findingNameNullFlavourDefiningCode = findingNameNullFlavourDefiningCode;
  }

  public NullFlavour getFindingNameNullFlavourDefiningCode() {
     return this.findingNameNullFlavourDefiningCode ;
  }

  public void setAnatomicalLocationValue(String anatomicalLocationValue) {
     this.anatomicalLocationValue = anatomicalLocationValue;
  }

  public String getAnatomicalLocationValue() {
     return this.anatomicalLocationValue ;
  }

  public void setAnatomicalLocationNullFlavourDefiningCode(
      NullFlavour anatomicalLocationNullFlavourDefiningCode) {
     this.anatomicalLocationNullFlavourDefiningCode = anatomicalLocationNullFlavourDefiningCode;
  }

  public NullFlavour getAnatomicalLocationNullFlavourDefiningCode() {
     return this.anatomicalLocationNullFlavourDefiningCode ;
  }

  public void setStructuredAnatomicalLocation(List<Cluster> structuredAnatomicalLocation) {
     this.structuredAnatomicalLocation = structuredAnatomicalLocation;
  }

  public List<Cluster> getStructuredAnatomicalLocation() {
     return this.structuredAnatomicalLocation ;
  }

  public void setPresence(List<ImagingFindingPresenceElement> presence) {
     this.presence = presence;
  }

  public List<ImagingFindingPresenceElement> getPresence() {
     return this.presence ;
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

  public void setStructuredDetail(List<Cluster> structuredDetail) {
     this.structuredDetail = structuredDetail;
  }

  public List<Cluster> getStructuredDetail() {
     return this.structuredDetail ;
  }

  public void setComparisonToPreviousNullFlavourDefiningCode(
      NullFlavour comparisonToPreviousNullFlavourDefiningCode) {
     this.comparisonToPreviousNullFlavourDefiningCode = comparisonToPreviousNullFlavourDefiningCode;
  }

  public NullFlavour getComparisonToPreviousNullFlavourDefiningCode() {
     return this.comparisonToPreviousNullFlavourDefiningCode ;
  }

  public void setComment(List<ImagingFindingCommentElement> comment) {
     this.comment = comment;
  }

  public List<ImagingFindingCommentElement> getComment() {
     return this.comment ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setComparisonToPrevious(
      ImagingFindingComparisonToPreviousChoice comparisonToPrevious) {
     this.comparisonToPrevious = comparisonToPrevious;
  }

  public ImagingFindingComparisonToPreviousChoice getComparisonToPrevious() {
     return this.comparisonToPrevious ;
  }
}
