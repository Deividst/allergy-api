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

public class BodyMassIndexObservationContainment extends Containment {
  public SelectAqlField<BodyMassIndexObservation> BODY_MASS_INDEX_OBSERVATION = new AqlFieldImp<BodyMassIndexObservation>(BodyMassIndexObservation.class, "", "BodyMassIndexObservation", BodyMassIndexObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(BodyMassIndexObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(BodyMassIndexObservation.class, "/protocol[at0005]/items[at0015]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(BodyMassIndexObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(BodyMassIndexObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(BodyMassIndexObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<BodyMassIndexAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<BodyMassIndexAnyEventChoice>(BodyMassIndexObservation.class, "/data[at0001]/events[at0002]", "anyEvent", BodyMassIndexAnyEventChoice.class, this);

  private BodyMassIndexObservationContainment() {
    super("openEHR-EHR-OBSERVATION.body_mass_index.v2");
  }

  public static BodyMassIndexObservationContainment getInstance() {
    return new BodyMassIndexObservationContainment();
  }
}
