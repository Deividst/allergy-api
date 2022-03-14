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
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.153589-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class BodyTemperatureAnyEventIntervalEvent implements IntervalEventEntity, BodyTemperatureAnyEventChoice {
  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/Temperature
   * Description: The measured temperature.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double temperatureMagnitude;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/Temperature
   * Description: The measured temperature.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String temperatureUnits;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/Tree/Temperature/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour temperatureNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/Environmental conditions
   * Description: Details about the environmental conditions at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0056]")
  private List<Cluster> environmentalConditions;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/Exertion
   * Description: Details about the exertion of the person at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0057]")
  private Cluster exertion;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setTemperatureMagnitude(Double temperatureMagnitude) {
     this.temperatureMagnitude = temperatureMagnitude;
  }

  public Double getTemperatureMagnitude() {
     return this.temperatureMagnitude ;
  }

  public void setTemperatureUnits(String temperatureUnits) {
     this.temperatureUnits = temperatureUnits;
  }

  public String getTemperatureUnits() {
     return this.temperatureUnits ;
  }

  public void setTemperatureNullFlavourDefiningCode(
      NullFlavour temperatureNullFlavourDefiningCode) {
     this.temperatureNullFlavourDefiningCode = temperatureNullFlavourDefiningCode;
  }

  public NullFlavour getTemperatureNullFlavourDefiningCode() {
     return this.temperatureNullFlavourDefiningCode ;
  }

  public void setEnvironmentalConditions(List<Cluster> environmentalConditions) {
     this.environmentalConditions = environmentalConditions;
  }

  public List<Cluster> getEnvironmentalConditions() {
     return this.environmentalConditions ;
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
