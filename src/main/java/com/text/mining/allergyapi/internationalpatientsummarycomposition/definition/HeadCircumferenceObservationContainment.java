package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

import java.time.temporal.TemporalAccessor;

public class HeadCircumferenceObservationContainment extends Containment {
  public SelectAqlField<HeadCircumferenceObservation> HEAD_CIRCUMFERENCE_OBSERVATION = new AqlFieldImp<HeadCircumferenceObservation>(HeadCircumferenceObservation.class, "", "HeadCircumferenceObservation", HeadCircumferenceObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(HeadCircumferenceObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(HeadCircumferenceObservation.class, "/protocol[at0005]/items[at0006]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HeadCircumferenceObservation.class, "/protocol[at0005]/items[at0012]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HeadCircumferenceObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HeadCircumferenceObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(HeadCircumferenceObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<HeadCircumferenceAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<HeadCircumferenceAnyEventChoice>(HeadCircumferenceObservation.class, "/data[at0001]/events[at0010]", "anyEvent", HeadCircumferenceAnyEventChoice.class, this);

  private HeadCircumferenceObservationContainment() {
    super("openEHR-EHR-OBSERVATION.head_circumference.v1");
  }

  public static HeadCircumferenceObservationContainment getInstance() {
    return new HeadCircumferenceObservationContainment();
  }
}
