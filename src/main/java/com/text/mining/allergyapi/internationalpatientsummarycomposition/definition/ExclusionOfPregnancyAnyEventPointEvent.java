package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
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
    date = "2021-09-27T22:12:02.207693-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("POINT_EVENT")
public class ExclusionOfPregnancyAnyEventPointEvent implements PointEventEntity, ExclusionOfPregnancyAnyEventChoice {
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
}
