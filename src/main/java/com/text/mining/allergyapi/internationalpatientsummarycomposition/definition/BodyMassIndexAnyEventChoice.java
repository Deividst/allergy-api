package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.179240-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface BodyMassIndexAnyEventChoice {
  Double getBodyMassIndexMagnitude();

  void setBodyMassIndexMagnitude(Double bodyMassIndexMagnitude);

  String getBodyMassIndexUnits();

  void setBodyMassIndexUnits(String bodyMassIndexUnits);

  NullFlavour getBodyMassIndexNullFlavourDefiningCode();

  void setBodyMassIndexNullFlavourDefiningCode(NullFlavour bodyMassIndexNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  ItemTree getTree();

  void setTree(ItemTree tree);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
