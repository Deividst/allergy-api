package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
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
    date = "2021-09-27T22:12:02.140181-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class RespirationAnyEventIntervalEvent implements IntervalEventEntity, RespirationAnyEventChoice {
  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/Rate
   * Description: The frequency of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double rateMagnitude;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/Rate
   * Description: The frequency of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String rateUnits;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/List/Rate/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour rateNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/Inspired oxygen
   * Description: Details of the amount of oxygen being delivered to the individual at the time of observation.
   * Comment: Assumed values of 21% oxygen concentration, Fi02 of 0.21 and oxygen flow rate of 0 l/min or 0 ml/min.
   */
  @Path("/state[at0022]/items[at0055]")
  private Cluster inspiredOxygen;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/Exertion
   * Description: Details about physical exertion being undertaken during the examination.
   * Comment: The individual's level of exertion during, or just prior to, the observation.
   */
  @Path("/state[at0022]/items[at0037]")
  private Cluster exertion;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setRateMagnitude(Double rateMagnitude) {
     this.rateMagnitude = rateMagnitude;
  }

  public Double getRateMagnitude() {
     return this.rateMagnitude ;
  }

  public void setRateUnits(String rateUnits) {
     this.rateUnits = rateUnits;
  }

  public String getRateUnits() {
     return this.rateUnits ;
  }

  public void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode) {
     this.rateNullFlavourDefiningCode = rateNullFlavourDefiningCode;
  }

  public NullFlavour getRateNullFlavourDefiningCode() {
     return this.rateNullFlavourDefiningCode ;
  }

  public void setInspiredOxygen(Cluster inspiredOxygen) {
     this.inspiredOxygen = inspiredOxygen;
  }

  public Cluster getInspiredOxygen() {
     return this.inspiredOxygen ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
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
