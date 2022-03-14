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
    date = "2021-09-27T22:12:02.160389-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class HeadCircumferenceAnyEventIntervalEvent implements IntervalEventEntity, HeadCircumferenceAnyEventChoice {
  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/Head circumference
   * Description: The measurement of the longest distance around the head.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double headCircumferenceMagnitude;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/Head circumference
   * Description: The measurement of the longest distance around the head.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String headCircumferenceUnits;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/Tree/Head circumference/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour headCircumferenceNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/Tree
   * Description: @ internal @
   */
  @Path("/state[at0008]")
  private ItemTree tree;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setHeadCircumferenceMagnitude(Double headCircumferenceMagnitude) {
     this.headCircumferenceMagnitude = headCircumferenceMagnitude;
  }

  public Double getHeadCircumferenceMagnitude() {
     return this.headCircumferenceMagnitude ;
  }

  public void setHeadCircumferenceUnits(String headCircumferenceUnits) {
     this.headCircumferenceUnits = headCircumferenceUnits;
  }

  public String getHeadCircumferenceUnits() {
     return this.headCircumferenceUnits ;
  }

  public void setHeadCircumferenceNullFlavourDefiningCode(
      NullFlavour headCircumferenceNullFlavourDefiningCode) {
     this.headCircumferenceNullFlavourDefiningCode = headCircumferenceNullFlavourDefiningCode;
  }

  public NullFlavour getHeadCircumferenceNullFlavourDefiningCode() {
     return this.headCircumferenceNullFlavourDefiningCode ;
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
