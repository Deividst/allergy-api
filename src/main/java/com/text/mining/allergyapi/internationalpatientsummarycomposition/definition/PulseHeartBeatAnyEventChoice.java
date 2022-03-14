package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.149267-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface PulseHeartBeatAnyEventChoice {
  List<Cluster> getExertion();

  void setExertion(List<Cluster> exertion);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getRateNullFlavourDefiningCode();

  void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode);

  String getRateUnits();

  void setRateUnits(String rateUnits);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  Double getRateMagnitude();

  void setRateMagnitude(Double rateMagnitude);
}
