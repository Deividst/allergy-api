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
@Archetype("openEHR-EHR-CLUSTER.multimedia_source.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.039926-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class MultimediaSourceCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Resource name
   * Description: Name or title of the multimedia resource.
   */
  @Path("/items[at0002]/value|value")
  private String resourceNameValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Multimedia source/Resource name/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour resourceNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Multimedia source/Content/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour contentNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Creator
   * Description: Details about the individual or organisation who generated or authored the resource.
   */
  @Path("/items[at0012]")
  private List<Cluster> creator;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Source device
   * Description: Details about the device used to generate or author the resource.
   * Comment: For example: the camera used to capture an image.
   */
  @Path("/items[at0011]")
  private List<Cluster> sourceDevice;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Additional details
   * Description: Further details about the multimedia source.
   */
  @Path("/items[at0013]")
  private List<Cluster> additionalDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Content
   * Description: Digital representation of the resource.
   */
  @Path("/items[at0001]/value")
  @Choice
  private MultimediaSourceContentChoice content;

  public void setResourceNameValue(String resourceNameValue) {
     this.resourceNameValue = resourceNameValue;
  }

  public String getResourceNameValue() {
     return this.resourceNameValue ;
  }

  public void setResourceNameNullFlavourDefiningCode(
      NullFlavour resourceNameNullFlavourDefiningCode) {
     this.resourceNameNullFlavourDefiningCode = resourceNameNullFlavourDefiningCode;
  }

  public NullFlavour getResourceNameNullFlavourDefiningCode() {
     return this.resourceNameNullFlavourDefiningCode ;
  }

  public void setContentNullFlavourDefiningCode(NullFlavour contentNullFlavourDefiningCode) {
     this.contentNullFlavourDefiningCode = contentNullFlavourDefiningCode;
  }

  public NullFlavour getContentNullFlavourDefiningCode() {
     return this.contentNullFlavourDefiningCode ;
  }

  public void setCreator(List<Cluster> creator) {
     this.creator = creator;
  }

  public List<Cluster> getCreator() {
     return this.creator ;
  }

  public void setSourceDevice(List<Cluster> sourceDevice) {
     this.sourceDevice = sourceDevice;
  }

  public List<Cluster> getSourceDevice() {
     return this.sourceDevice ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setContent(MultimediaSourceContentChoice content) {
     this.content = content;
  }

  public MultimediaSourceContentChoice getContent() {
     return this.content ;
  }
}
