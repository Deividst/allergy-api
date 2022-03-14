package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.311422-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AdvanceCareDirectiveDirectiveLocationCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Directive location/Location
   * Description: Information regarding where the advance care directive is stored and how to gain access to it.
   * Comment: For example, 'In the top drawer of the bedside table'.
   */
  @Path("/items[at0030]/value|value")
  private String locationValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Item tree/Directive location/Location/null_flavour
   */
  @Path("/items[at0030]/null_flavour|defining_code")
  private NullFlavour locationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Directive location/Copy holder
   * Description: Details of a person who has a copy of the advance care directive.
   * Comment: For example, 'John Smith, Lawyer'.
   */
  @Path("/items[at0059]")
  private Cluster copyHolder;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Directive location/Digital representation
   * Description: Digital document, image or video representing the advance care directive.
   */
  @Path("/items[at0060]")
  private Cluster digitalRepresentation;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive/Directive location/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setLocationValue(String locationValue) {
     this.locationValue = locationValue;
  }

  public String getLocationValue() {
     return this.locationValue ;
  }

  public void setLocationNullFlavourDefiningCode(NullFlavour locationNullFlavourDefiningCode) {
     this.locationNullFlavourDefiningCode = locationNullFlavourDefiningCode;
  }

  public NullFlavour getLocationNullFlavourDefiningCode() {
     return this.locationNullFlavourDefiningCode ;
  }

  public void setCopyHolder(Cluster copyHolder) {
     this.copyHolder = copyHolder;
  }

  public Cluster getCopyHolder() {
     return this.copyHolder ;
  }

  public void setDigitalRepresentation(Cluster digitalRepresentation) {
     this.digitalRepresentation = digitalRepresentation;
  }

  public Cluster getDigitalRepresentation() {
     return this.digitalRepresentation ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
