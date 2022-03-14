package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.129758-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface BodyWeightAnyEventChoice {
  ItemTree getStateStructure();

  void setStateStructure(ItemTree stateStructure);

  Double getWeightMagnitude();

  void setWeightMagnitude(Double weightMagnitude);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getWeightNullFlavourDefiningCode();

  void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode);

  String getWeightUnits();

  void setWeightUnits(String weightUnits);
}
