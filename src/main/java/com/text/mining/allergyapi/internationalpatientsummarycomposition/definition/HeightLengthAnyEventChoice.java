package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.136158-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface HeightLengthAnyEventChoice {
  NullFlavour getHeightLengthNullFlavourDefiningCode();

  void setHeightLengthNullFlavourDefiningCode(NullFlavour heightLengthNullFlavourDefiningCode);

  Double getHeightLengthMagnitude();

  void setHeightLengthMagnitude(Double heightLengthMagnitude);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getHeightLengthUnits();

  void setHeightLengthUnits(String heightLengthUnits);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  ItemTree getTree();

  void setTree(ItemTree tree);
}
