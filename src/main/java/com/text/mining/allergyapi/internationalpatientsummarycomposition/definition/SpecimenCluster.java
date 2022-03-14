package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.specimen.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.021945-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class SpecimenCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Specimen type
   * Description: The type of specimen.
   * Comment: For example: Venous blood, bacterial culture, cytology, or tissue sample. Coding of the specimen type with a terminology is preferred, where possible.
   */
  @Path("/items[at0029]/value|value")
  private String specimenTypeValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Specimen/Specimen type/null_flavour
   */
  @Path("/items[at0029]/null_flavour|defining_code")
  private NullFlavour specimenTypeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Physical properties
   * Description: Physical dimensions, mass or non-measurable properties of the specimen.
   * Comment: For example: Volume, mass, circumference, colour, smell, turbidity. This element can be used to specify the properties of the specimen to be collected, in the context of an INSTRUCTION archetype, or the properties of the specimen which was collected, in the context of an ACTION or OBSERVATION archetype. For example, an INSTRUCTION may request the collection of 20 ml of blood, while the corresponding ACTION records that only 15 ml was collected.
   */
  @Path("/items[at0027]")
  private List<Cluster> physicalProperties;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Method
   * Description: The method of collection used.
   * Comment: For example: venepuncture, biopsy, resection. Coding of the collection method with a terminology is preferred, where possible. If the collection method is included in the 'Specimen type' via precoordinated codes, this data element becomes redundant.
   */
  @Path("/items[at0007 and name/value='Method']/value|value")
  private String methodValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Specimen/Method/null_flavour
   */
  @Path("/items[at0007 and name/value='Method']/null_flavour|defining_code")
  private NullFlavour methodNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Body site
   * Description: Identification of the body site or other location from where the specimen is collected.
   * Comment: For example: 'wound on left calf', 'IV cannula right arm', 'right kidney'.
   * Coding of the name of the source site with a terminology is preferred, where possible. Use this data element to record precoordinated source sites. If the requirements for recording the source site are determined at run-time by the application or require more complex modelling such as relative locations then use the 'Structured source site' SLOT in this archetype. If the source site is included in the 'Specimen type' via precoordinated codes, this data element becomes redundant.
   */
  @Path("/items[at0087 and name/value='Body site']/value|value")
  private String bodySiteValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Specimen/Body site/null_flavour
   */
  @Path("/items[at0087 and name/value='Body site']/null_flavour|defining_code")
  private NullFlavour bodySiteNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Structured source site
   * Description: A structured description of the area of the body from where the specimen is collected.
   * Comment: Utilise the more detailed archetypes to describe structured or more complex anatomical sites, or to support recording the source site at run-time by the application. If the body site has been fully identified in the 'Source site' data element, this SLOT becomes redundant.
   */
  @Path("/items[at0013]")
  private List<Cluster> structuredSourceSite;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Specimen collector details
   * Description: The person or organisation responsible for collecting the specimen.
   */
  @Path("/items[at0071]")
  private List<Cluster> specimenCollectorDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Additional collection details
   * Description: Addtional details related to specific collection methods.
   * Comment: For example details about needle biopsies in prostate cancer, where both the request and reporting about the specimen are detailed and specific.
   */
  @Path("/items[at0083]")
  private List<Cluster> additionalCollectionDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Container details
   * Description: Details about containers used.
   */
  @Path("/items[at0085]")
  private List<Cluster> containerDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Processing details
   * Description: Structured details about preparation or processing of the specimen.
   * Comment: For example: Staining or fixation.
   */
  @Path("/items[at0068]")
  private List<Cluster> processingDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Transport details
   * Description: Structured details about transport of the specimen.
   */
  @Path("/items[at0093]")
  private List<Cluster> transportDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/Digital representation
   * Description: Structured details about a digital representation of the specimen.
   * Comment: For example the scanned image of a histopathology slide.
   */
  @Path("/items[at0096]")
  private List<Cluster> digitalRepresentation;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Specimen/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setSpecimenTypeValue(String specimenTypeValue) {
     this.specimenTypeValue = specimenTypeValue;
  }

  public String getSpecimenTypeValue() {
     return this.specimenTypeValue ;
  }

  public void setSpecimenTypeNullFlavourDefiningCode(
      NullFlavour specimenTypeNullFlavourDefiningCode) {
     this.specimenTypeNullFlavourDefiningCode = specimenTypeNullFlavourDefiningCode;
  }

  public NullFlavour getSpecimenTypeNullFlavourDefiningCode() {
     return this.specimenTypeNullFlavourDefiningCode ;
  }

  public void setPhysicalProperties(List<Cluster> physicalProperties) {
     this.physicalProperties = physicalProperties;
  }

  public List<Cluster> getPhysicalProperties() {
     return this.physicalProperties ;
  }

  public void setMethodValue(String methodValue) {
     this.methodValue = methodValue;
  }

  public String getMethodValue() {
     return this.methodValue ;
  }

  public void setMethodNullFlavourDefiningCode(NullFlavour methodNullFlavourDefiningCode) {
     this.methodNullFlavourDefiningCode = methodNullFlavourDefiningCode;
  }

  public NullFlavour getMethodNullFlavourDefiningCode() {
     return this.methodNullFlavourDefiningCode ;
  }

  public void setBodySiteValue(String bodySiteValue) {
     this.bodySiteValue = bodySiteValue;
  }

  public String getBodySiteValue() {
     return this.bodySiteValue ;
  }

  public void setBodySiteNullFlavourDefiningCode(NullFlavour bodySiteNullFlavourDefiningCode) {
     this.bodySiteNullFlavourDefiningCode = bodySiteNullFlavourDefiningCode;
  }

  public NullFlavour getBodySiteNullFlavourDefiningCode() {
     return this.bodySiteNullFlavourDefiningCode ;
  }

  public void setStructuredSourceSite(List<Cluster> structuredSourceSite) {
     this.structuredSourceSite = structuredSourceSite;
  }

  public List<Cluster> getStructuredSourceSite() {
     return this.structuredSourceSite ;
  }

  public void setSpecimenCollectorDetails(List<Cluster> specimenCollectorDetails) {
     this.specimenCollectorDetails = specimenCollectorDetails;
  }

  public List<Cluster> getSpecimenCollectorDetails() {
     return this.specimenCollectorDetails ;
  }

  public void setAdditionalCollectionDetails(List<Cluster> additionalCollectionDetails) {
     this.additionalCollectionDetails = additionalCollectionDetails;
  }

  public List<Cluster> getAdditionalCollectionDetails() {
     return this.additionalCollectionDetails ;
  }

  public void setContainerDetails(List<Cluster> containerDetails) {
     this.containerDetails = containerDetails;
  }

  public List<Cluster> getContainerDetails() {
     return this.containerDetails ;
  }

  public void setProcessingDetails(List<Cluster> processingDetails) {
     this.processingDetails = processingDetails;
  }

  public List<Cluster> getProcessingDetails() {
     return this.processingDetails ;
  }

  public void setTransportDetails(List<Cluster> transportDetails) {
     this.transportDetails = transportDetails;
  }

  public List<Cluster> getTransportDetails() {
     return this.transportDetails ;
  }

  public void setDigitalRepresentation(List<Cluster> digitalRepresentation) {
     this.digitalRepresentation = digitalRepresentation;
  }

  public List<Cluster> getDigitalRepresentation() {
     return this.digitalRepresentation ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
