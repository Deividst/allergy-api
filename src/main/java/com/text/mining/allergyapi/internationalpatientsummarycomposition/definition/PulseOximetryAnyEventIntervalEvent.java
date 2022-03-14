package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.quantity.DvProportion;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.167074-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class PulseOximetryAnyEventIntervalEvent implements IntervalEventEntity, PulseOximetryAnyEventChoice {
  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/SpO₂
   * Description: The saturation of oxygen in the peripheral blood, measured via pulse oximetry.
   * Comment: SpO₂ is defined as the percentage of oxyhaemoglobin (HbO₂) to the total concentration of haemoglobin (HbO₂ + deoxyhaemoglobin) in peripheral blood.
   */
  @Path("/data[at0003]/items[at0006]/value")
  private DvProportion spo;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/Tree/SpO₂/null_flavour
   */
  @Path("/data[at0003]/items[at0006]/null_flavour|defining_code")
  private NullFlavour spoNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/Waveform
   * Description: A waveform reading associated with the oximetry measurement.
   */
  @Path("/data[at0003]/items[at0054]")
  private List<Cluster> waveform;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/Multimedia image
   * Description: Details of a series of oximetry readings, other than waveforms, expressed as a multimedia image or series of images. Waveforms should be recorded using the Waveform slot and associated cluster archetype.
   */
  @Path("/data[at0003]/items[at0060]")
  private List<Cluster> multimediaImage;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/Exertion
   * Description: Details about physical activity undertaken at the time of measurement.
   */
  @Path("/state[at0014]/items[at0034]")
  private Cluster exertion;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/Inspired oxygen
   * Description: Details of the amount of oxygen available to the subject at the time of observation.
   * Comment: Assumed values of 21% oxygen concentration, Fi0₂ of 0.21 and oxygen flow rate of 0 l/min or 0 ml/min.
   */
  @Path("/state[at0014]/items[at0015]")
  private Cluster inspiredOxygen;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setSpo(DvProportion spo) {
     this.spo = spo;
  }

  public DvProportion getSpo() {
     return this.spo ;
  }

  public void setSpoNullFlavourDefiningCode(NullFlavour spoNullFlavourDefiningCode) {
     this.spoNullFlavourDefiningCode = spoNullFlavourDefiningCode;
  }

  public NullFlavour getSpoNullFlavourDefiningCode() {
     return this.spoNullFlavourDefiningCode ;
  }

  public void setWaveform(List<Cluster> waveform) {
     this.waveform = waveform;
  }

  public List<Cluster> getWaveform() {
     return this.waveform ;
  }

  public void setMultimediaImage(List<Cluster> multimediaImage) {
     this.multimediaImage = multimediaImage;
  }

  public List<Cluster> getMultimediaImage() {
     return this.multimediaImage ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
  }

  public void setInspiredOxygen(Cluster inspiredOxygen) {
     this.inspiredOxygen = inspiredOxygen;
  }

  public Cluster getInspiredOxygen() {
     return this.inspiredOxygen ;
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
