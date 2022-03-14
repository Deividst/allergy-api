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

public class ExclusionOfPregnancyObservationContainment extends Containment {
  public SelectAqlField<ExclusionOfPregnancyObservation> EXCLUSION_OF_PREGNANCY_OBSERVATION = new AqlFieldImp<ExclusionOfPregnancyObservation>(ExclusionOfPregnancyObservation.class, "", "ExclusionOfPregnancyObservation", ExclusionOfPregnancyObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ExclusionOfPregnancyObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ExclusionOfPregnancyObservation.class, "/protocol[at0004]/items[at0005]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ExclusionOfPregnancyObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ExclusionOfPregnancyObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExclusionOfPregnancyObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<ExclusionOfPregnancyAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<ExclusionOfPregnancyAnyEventChoice>(ExclusionOfPregnancyObservation.class, "/data[at0001]/events[at0002]", "anyEvent", ExclusionOfPregnancyAnyEventChoice.class, this);

  private ExclusionOfPregnancyObservationContainment() {
    super("openEHR-EHR-OBSERVATION.exclusion_pregnancy.v0");
  }

  public static ExclusionOfPregnancyObservationContainment getInstance() {
    return new ExclusionOfPregnancyObservationContainment();
  }
}
