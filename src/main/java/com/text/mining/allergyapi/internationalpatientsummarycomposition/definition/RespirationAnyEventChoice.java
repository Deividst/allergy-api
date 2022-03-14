package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.142839-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface RespirationAnyEventChoice {
  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getRateUnits();

  void setRateUnits(String rateUnits);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  Double getRateMagnitude();

  void setRateMagnitude(Double rateMagnitude);

  NullFlavour getRateNullFlavourDefiningCode();

  void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode);

  Cluster getInspiredOxygen();

  void setInspiredOxygen(Cluster inspiredOxygen);
}
