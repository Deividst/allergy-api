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

public class ImmunizationStatementActionContainment extends Containment {
  public SelectAqlField<ImmunizationStatementAction> IMMUNIZATION_STATEMENT_ACTION = new AqlFieldImp<ImmunizationStatementAction>(ImmunizationStatementAction.class, "", "ImmunizationStatementAction", ImmunizationStatementAction.class, this);

  public SelectAqlField<String> IMMUNISATION_ITEM_VALUE = new AqlFieldImp<String>(ImmunizationStatementAction.class, "/description[at0017]/items[at0020]/value|value", "immunisationItemValue", String.class, this);

  public SelectAqlField<NullFlavour> IMMUNISATION_ITEM_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImmunizationStatementAction.class, "/description[at0017]/items[at0020]/null_flavour|defining_code", "immunisationItemNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> MEDICATION_DETAILS = new AqlFieldImp<Cluster>(ImmunizationStatementAction.class, "/description[at0017]/items[at0104]", "medicationDetails", Cluster.class, this);

  public SelectAqlField<Cluster> AMOUNT = new AqlFieldImp<Cluster>(ImmunizationStatementAction.class, "/description[at0017]/items[at0131]", "amount", Cluster.class, this);

  public SelectAqlField<String> ROUTE_VALUE = new AqlFieldImp<String>(ImmunizationStatementAction.class, "/description[at0017]/items[at0140]/items[at0147]/value|value", "routeValue", String.class, this);

  public SelectAqlField<NullFlavour> ROUTE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImmunizationStatementAction.class, "/description[at0017]/items[at0140]/items[at0147]/null_flavour|defining_code", "routeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> TARGET_SITE_VALUE = new AqlFieldImp<String>(ImmunizationStatementAction.class, "/description[at0017]/items[at0140]/items[at0141]/value|value", "targetSiteValue", String.class, this);

  public SelectAqlField<NullFlavour> TARGET_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImmunizationStatementAction.class, "/description[at0017]/items[at0140]/items[at0141]/null_flavour|defining_code", "targetSiteNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> STRUCTURED_BODY_SITE = new AqlFieldImp<Cluster>(ImmunizationStatementAction.class, "/description[at0017]/items[at0140]/items[at0142]", "structuredBodySite", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADMINISTRATION_DEVICE = new ListAqlFieldImp<Cluster>(ImmunizationStatementAction.class, "/description[at0017]/items[at0140]/items[at0144]", "administrationDevice", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(ImmunizationStatementAction.class, "/description[at0017]/items[at0053]", "additionalDetails", Cluster.class, this);

  public SelectAqlField<Long> SEQUENCE_NUMBER_MAGNITUDE = new AqlFieldImp<Long>(ImmunizationStatementAction.class, "/description[at0017]/items[at0025]/value|magnitude", "sequenceNumberMagnitude", Long.class, this);

  public SelectAqlField<NullFlavour> SEQUENCE_NUMBER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImmunizationStatementAction.class, "/description[at0017]/items[at0025]/null_flavour|defining_code", "sequenceNumberNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ImmunizationStatementAction.class, "/protocol[at0030]/items[at0085]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ImmunizationStatementAction.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ImmunizationStatementAction.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ImmunizationStatementAction.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(ImmunizationStatementAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<CareflowStepDefiningCode2> CAREFLOW_STEP_DEFINING_CODE = new AqlFieldImp<CareflowStepDefiningCode2>(ImmunizationStatementAction.class, "/ism_transition/careflow_step|defining_code", "careflowStepDefiningCode", CareflowStepDefiningCode2.class, this);

  public SelectAqlField<CurrentStateDefiningCode2> CURRENT_STATE_DEFINING_CODE = new AqlFieldImp<CurrentStateDefiningCode2>(ImmunizationStatementAction.class, "/ism_transition/current_state|defining_code", "currentStateDefiningCode", CurrentStateDefiningCode2.class, this);

  public SelectAqlField<Transition> TRANSITION_DEFINING_CODE = new AqlFieldImp<Transition>(ImmunizationStatementAction.class, "/ism_transition/transition|defining_code", "transitionDefiningCode", Transition.class, this);

  private ImmunizationStatementActionContainment() {
    super("openEHR-EHR-ACTION.medication.v1");
  }

  public static ImmunizationStatementActionContainment getInstance() {
    return new ImmunizationStatementActionContainment();
  }
}
