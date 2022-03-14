package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.176930-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class BodyMassIndexAnyEventIntervalEvent implements IntervalEventEntity, BodyMassIndexAnyEventChoice {
  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/Body mass index
   * Description: Index describing ratio of weight to height.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double bodyMassIndexMagnitude;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/Body mass index
   * Description: Index describing ratio of weight to height.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String bodyMassIndexUnits;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/Single/Body mass index/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour bodyMassIndexNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/Tree
   * Description: @ internal @
   */
  @Path("/state[at0014]")
  private ItemTree tree;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setBodyMassIndexMagnitude(Double bodyMassIndexMagnitude) {
     this.bodyMassIndexMagnitude = bodyMassIndexMagnitude;
  }

  public Double getBodyMassIndexMagnitude() {
     return this.bodyMassIndexMagnitude ;
  }

  public void setBodyMassIndexUnits(String bodyMassIndexUnits) {
     this.bodyMassIndexUnits = bodyMassIndexUnits;
  }

  public String getBodyMassIndexUnits() {
     return this.bodyMassIndexUnits ;
  }

  public void setBodyMassIndexNullFlavourDefiningCode(
      NullFlavour bodyMassIndexNullFlavourDefiningCode) {
     this.bodyMassIndexNullFlavourDefiningCode = bodyMassIndexNullFlavourDefiningCode;
  }

  public NullFlavour getBodyMassIndexNullFlavourDefiningCode() {
     return this.bodyMassIndexNullFlavourDefiningCode ;
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

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
