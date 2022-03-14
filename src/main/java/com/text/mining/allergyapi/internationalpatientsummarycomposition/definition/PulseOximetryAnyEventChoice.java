package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.quantity.DvProportion;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.171711-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface PulseOximetryAnyEventChoice {
  Cluster getExertion();

  void setExertion(Cluster exertion);

  NullFlavour getSpoNullFlavourDefiningCode();

  void setSpoNullFlavourDefiningCode(NullFlavour spoNullFlavourDefiningCode);

  List<Cluster> getWaveform();

  void setWaveform(List<Cluster> waveform);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  Cluster getInspiredOxygen();

  void setInspiredOxygen(Cluster inspiredOxygen);

  List<Cluster> getMultimediaImage();

  void setMultimediaImage(List<Cluster> multimediaImage);

  DvProportion getSpo();

  void setSpo(DvProportion spo);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);
}
