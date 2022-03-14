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

public class ProcedureActionContainment extends Containment {
  public SelectAqlField<ProcedureAction> PROCEDURE_ACTION = new AqlFieldImp<ProcedureAction>(ProcedureAction.class, "", "ProcedureAction", ProcedureAction.class, this);

  public SelectAqlField<String> PROCEDURE_NAME_VALUE = new AqlFieldImp<String>(ProcedureAction.class, "/description[at0001]/items[at0002]/value|value", "procedureNameValue", String.class, this);

  public SelectAqlField<NullFlavour> PROCEDURE_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProcedureAction.class, "/description[at0001]/items[at0002]/null_flavour|defining_code", "procedureNameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ProcedureBodySiteElement> BODY_SITE = new ListAqlFieldImp<ProcedureBodySiteElement>(ProcedureAction.class, "/description[at0001]/items[at0063]", "bodySite", ProcedureBodySiteElement.class, this);

  public ListSelectAqlField<Cluster> PROCEDURE_DETAIL = new ListAqlFieldImp<Cluster>(ProcedureAction.class, "/description[at0001]/items[at0003]", "procedureDetail", Cluster.class, this);

  public ListSelectAqlField<Cluster> MULTIMEDIA = new ListAqlFieldImp<Cluster>(ProcedureAction.class, "/description[at0001]/items[at0062]", "multimedia", Cluster.class, this);

  public SelectAqlField<Cluster> REQUESTOR = new AqlFieldImp<Cluster>(ProcedureAction.class, "/protocol[at0053]/items[at0055]", "requestor", Cluster.class, this);

  public ListSelectAqlField<Cluster> RECEIVER = new ListAqlFieldImp<Cluster>(ProcedureAction.class, "/protocol[at0053]/items[at0057]", "receiver", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProcedureAction.class, "/protocol[at0053]/items[at0064]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProcedureAction.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProcedureAction.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProcedureAction.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(ProcedureAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<CareflowStepDefiningCode3> CAREFLOW_STEP_DEFINING_CODE = new AqlFieldImp<CareflowStepDefiningCode3>(ProcedureAction.class, "/ism_transition/careflow_step|defining_code", "careflowStepDefiningCode", CareflowStepDefiningCode3.class, this);

  public SelectAqlField<CurrentStateDefiningCode3> CURRENT_STATE_DEFINING_CODE = new AqlFieldImp<CurrentStateDefiningCode3>(ProcedureAction.class, "/ism_transition/current_state|defining_code", "currentStateDefiningCode", CurrentStateDefiningCode3.class, this);

  public SelectAqlField<Transition> TRANSITION_DEFINING_CODE = new AqlFieldImp<Transition>(ProcedureAction.class, "/ism_transition/transition|defining_code", "transitionDefiningCode", Transition.class, this);

  private ProcedureActionContainment() {
    super("openEHR-EHR-ACTION.procedure.v1");
  }

  public static ProcedureActionContainment getInstance() {
    return new ProcedureActionContainment();
  }
}
