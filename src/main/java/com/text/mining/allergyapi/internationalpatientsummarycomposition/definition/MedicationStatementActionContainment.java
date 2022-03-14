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
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Transition;

import java.time.temporal.TemporalAccessor;

public class MedicationStatementActionContainment extends Containment {
  public SelectAqlField<MedicationStatementAction> MEDICATION_STATEMENT_ACTION = new AqlFieldImp<MedicationStatementAction>(MedicationStatementAction.class, "", "MedicationStatementAction", MedicationStatementAction.class, this);

  public SelectAqlField<String> MEDICATION_ITEM_VALUE = new AqlFieldImp<String>(MedicationStatementAction.class, "/description[at0017]/items[at0020]/value|value", "medicationItemValue", String.class, this);

  public SelectAqlField<NullFlavour> MEDICATION_ITEM_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationStatementAction.class, "/description[at0017]/items[at0020]/null_flavour|defining_code", "medicationItemNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<MedicationCluster> MEDICATION = new AqlFieldImp<MedicationCluster>(MedicationStatementAction.class, "/description[at0017]/items[openEHR-EHR-CLUSTER.medication.v1]", "medication", MedicationCluster.class, this);

  public SelectAqlField<DosageCluster> DOSAGE = new AqlFieldImp<DosageCluster>(MedicationStatementAction.class, "/description[at0017]/items[openEHR-EHR-CLUSTER.dosage.v1]", "dosage", DosageCluster.class, this);

  public SelectAqlField<String> ROUTE_VALUE = new AqlFieldImp<String>(MedicationStatementAction.class, "/description[at0017]/items[at0140]/items[at0147]/value|value", "routeValue", String.class, this);

  public SelectAqlField<NullFlavour> ROUTE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationStatementAction.class, "/description[at0017]/items[at0140]/items[at0147]/null_flavour|defining_code", "routeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> BODY_SITE_VALUE = new AqlFieldImp<String>(MedicationStatementAction.class, "/description[at0017]/items[at0140]/items[at0141]/value|value", "bodySiteValue", String.class, this);

  public SelectAqlField<NullFlavour> BODY_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationStatementAction.class, "/description[at0017]/items[at0140]/items[at0141]/null_flavour|defining_code", "bodySiteNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> STRUCTURED_BODY_SITE = new AqlFieldImp<Cluster>(MedicationStatementAction.class, "/description[at0017]/items[at0140]/items[at0142]", "structuredBodySite", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADMINISTRATION_DEVICE = new ListAqlFieldImp<Cluster>(MedicationStatementAction.class, "/description[at0017]/items[at0140]/items[at0144]", "administrationDevice", Cluster.class, this);

  public SelectAqlField<TimingNonDailyCluster> TIMING_NON_DAILY = new AqlFieldImp<TimingNonDailyCluster>(MedicationStatementAction.class, "/description[at0017]/items[openEHR-EHR-CLUSTER.timing_nondaily.v1]", "timingNonDaily", TimingNonDailyCluster.class, this);

  public ListSelectAqlField<MedicationStatementOrderIdElement> ORDER_ID = new ListAqlFieldImp<MedicationStatementOrderIdElement>(MedicationStatementAction.class, "/protocol[at0030]/items[at0103]", "orderId", MedicationStatementOrderIdElement.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(MedicationStatementAction.class, "/protocol[at0030]/items[at0085]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(MedicationStatementAction.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(MedicationStatementAction.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(MedicationStatementAction.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(MedicationStatementAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<CareflowStepDefiningCode> CAREFLOW_STEP_DEFINING_CODE = new AqlFieldImp<CareflowStepDefiningCode>(MedicationStatementAction.class, "/ism_transition/careflow_step|defining_code", "careflowStepDefiningCode", CareflowStepDefiningCode.class, this);

  public SelectAqlField<CurrentStateDefiningCode> CURRENT_STATE_DEFINING_CODE = new AqlFieldImp<CurrentStateDefiningCode>(MedicationStatementAction.class, "/ism_transition/current_state|defining_code", "currentStateDefiningCode", CurrentStateDefiningCode.class, this);

  public SelectAqlField<Transition> TRANSITION_DEFINING_CODE = new AqlFieldImp<Transition>(MedicationStatementAction.class, "/ism_transition/transition|defining_code", "transitionDefiningCode", Transition.class, this);

  private MedicationStatementActionContainment() {
    super("openEHR-EHR-ACTION.medication.v1");
  }

  public static MedicationStatementActionContainment getInstance() {
    return new MedicationStatementActionContainment();
  }
}
