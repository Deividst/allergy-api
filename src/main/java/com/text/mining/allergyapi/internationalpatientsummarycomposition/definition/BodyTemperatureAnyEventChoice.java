package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.156282-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface BodyTemperatureAnyEventChoice {
  NullFlavour getTemperatureNullFlavourDefiningCode();

  void setTemperatureNullFlavourDefiningCode(NullFlavour temperatureNullFlavourDefiningCode);

  String getTemperatureUnits();

  void setTemperatureUnits(String temperatureUnits);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  Double getTemperatureMagnitude();

  void setTemperatureMagnitude(Double temperatureMagnitude);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  List<Cluster> getEnvironmentalConditions();

  void setEnvironmentalConditions(List<Cluster> environmentalConditions);
}
