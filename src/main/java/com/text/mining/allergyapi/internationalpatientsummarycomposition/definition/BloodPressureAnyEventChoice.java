package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.186730-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface BloodPressureAnyEventChoice {
  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getSystolicUnits();

  void setSystolicUnits(String systolicUnits);

  Double getSystolicMagnitude();

  void setSystolicMagnitude(Double systolicMagnitude);

  Double getDiastolicMagnitude();

  void setDiastolicMagnitude(Double diastolicMagnitude);

  NullFlavour getDiastolicNullFlavourDefiningCode();

  void setDiastolicNullFlavourDefiningCode(NullFlavour diastolicNullFlavourDefiningCode);

  NullFlavour getSystolicNullFlavourDefiningCode();

  void setSystolicNullFlavourDefiningCode(NullFlavour systolicNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  String getDiastolicUnits();

  void setDiastolicUnits(String diastolicUnits);
}
