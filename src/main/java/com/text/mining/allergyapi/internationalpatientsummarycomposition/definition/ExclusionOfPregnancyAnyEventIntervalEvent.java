package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
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
    date = "2021-09-27T22:12:02.206430-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("INTERVAL_EVENT")
public class ExclusionOfPregnancyAnyEventIntervalEvent implements IntervalEventEntity, ExclusionOfPregnancyAnyEventChoice {
  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/Exclusion statement
   * Description: An overall statement of exclusion about the state of pregnancy.
   */
  @Path("/data[at0003]/items[at0006]/value|value")
  private String exclusionStatementValue;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/Tree/Exclusion statement/null_flavour
   */
  @Path("/data[at0003]/items[at0006]/null_flavour|defining_code")
  private NullFlavour exclusionStatementNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setExclusionStatementValue(String exclusionStatementValue) {
     this.exclusionStatementValue = exclusionStatementValue;
  }

  public String getExclusionStatementValue() {
     return this.exclusionStatementValue ;
  }

  public void setExclusionStatementNullFlavourDefiningCode(
      NullFlavour exclusionStatementNullFlavourDefiningCode) {
     this.exclusionStatementNullFlavourDefiningCode = exclusionStatementNullFlavourDefiningCode;
  }

  public NullFlavour getExclusionStatementNullFlavourDefiningCode() {
     return this.exclusionStatementNullFlavourDefiningCode ;
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
