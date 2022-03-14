package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.135247-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("POINT_EVENT")
public class HeightLengthAnyEventPointEvent implements PointEventEntity, HeightLengthAnyEventChoice {
  /**
   * Path: International Patient Summary/Vital Signs/Height/Length/Any event/Height/Length
   * Description: The length of the body from crown of head to sole of foot.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double heightLengthMagnitude;

  /**
   * Path: International Patient Summary/Vital Signs/Height/Length/Any event/Height/Length
   * Description: The length of the body from crown of head to sole of foot.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String heightLengthUnits;

  /**
   * Path: International Patient Summary/Vital Signs/Height/Length/Any event/Simple/Height/Length/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour heightLengthNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Height/Length/Any event/Tree
   * Description: @ internal @
   */
  @Path("/state[at0013]")
  private ItemTree tree;

  /**
   * Path: International Patient Summary/Vital Signs/Height/Length/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Height/Length/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setHeightLengthMagnitude(Double heightLengthMagnitude) {
     this.heightLengthMagnitude = heightLengthMagnitude;
  }

  public Double getHeightLengthMagnitude() {
     return this.heightLengthMagnitude ;
  }

  public void setHeightLengthUnits(String heightLengthUnits) {
     this.heightLengthUnits = heightLengthUnits;
  }

  public String getHeightLengthUnits() {
     return this.heightLengthUnits ;
  }

  public void setHeightLengthNullFlavourDefiningCode(
      NullFlavour heightLengthNullFlavourDefiningCode) {
     this.heightLengthNullFlavourDefiningCode = heightLengthNullFlavourDefiningCode;
  }

  public NullFlavour getHeightLengthNullFlavourDefiningCode() {
     return this.heightLengthNullFlavourDefiningCode ;
  }

  public void setTree(ItemTree tree) {
     this.tree = tree;
  }

  public ItemTree getTree() {
     return this.tree ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
