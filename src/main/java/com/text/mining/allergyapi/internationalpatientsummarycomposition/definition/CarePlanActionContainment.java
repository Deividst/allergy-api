package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Transition;

import java.time.temporal.TemporalAccessor;

public class CarePlanActionContainment extends Containment {
  public SelectAqlField<CarePlanAction> CARE_PLAN_ACTION = new AqlFieldImp<CarePlanAction>(CarePlanAction.class, "", "CarePlanAction", CarePlanAction.class, this);

  public SelectAqlField<String> CARE_PLAN_NAME_VALUE = new AqlFieldImp<String>(CarePlanAction.class, "/description[at0019]/items[at0002]/value|value", "carePlanNameValue", String.class, this);

  public SelectAqlField<NullFlavour> CARE_PLAN_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(CarePlanAction.class, "/description[at0019]/items[at0002]/null_flavour|defining_code", "carePlanNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(CarePlanAction.class, "/description[at0019]/items[at0021]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(CarePlanAction.class, "/description[at0019]/items[at0021]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> REASON_VALUE = new AqlFieldImp<String>(CarePlanAction.class, "/description[at0019]/items[at0025]/value|value", "reasonValue", String.class, this);

  public SelectAqlField<NullFlavour> REASON_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(CarePlanAction.class, "/description[at0019]/items[at0025]/null_flavour|defining_code", "reasonNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<DvIdentifier> CARE_PLAN_ID = new AqlFieldImp<DvIdentifier>(CarePlanAction.class, "/protocol[at0015]/items[at0016]/value", "carePlanId", DvIdentifier.class, this);

  public SelectAqlField<NullFlavour> CARE_PLAN_ID_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(CarePlanAction.class, "/protocol[at0015]/items[at0016]/null_flavour|defining_code", "carePlanIdNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> EXPIRY_DATE_VALUE = new AqlFieldImp<TemporalAccessor>(CarePlanAction.class, "/protocol[at0015]/items[at0017]/value|value", "expiryDateValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> EXPIRY_DATE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(CarePlanAction.class, "/protocol[at0015]/items[at0017]/null_flavour|defining_code", "expiryDateNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(CarePlanAction.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(CarePlanAction.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(CarePlanAction.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(CarePlanAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<CareflowStepDefiningCode4> CAREFLOW_STEP_DEFINING_CODE = new AqlFieldImp<CareflowStepDefiningCode4>(CarePlanAction.class, "/ism_transition/careflow_step|defining_code", "careflowStepDefiningCode", CareflowStepDefiningCode4.class, this);

  public SelectAqlField<CurrentStateDefiningCode4> CURRENT_STATE_DEFINING_CODE = new AqlFieldImp<CurrentStateDefiningCode4>(CarePlanAction.class, "/ism_transition/current_state|defining_code", "currentStateDefiningCode", CurrentStateDefiningCode4.class, this);

  public SelectAqlField<Transition> TRANSITION_DEFINING_CODE = new AqlFieldImp<Transition>(CarePlanAction.class, "/ism_transition/transition|defining_code", "transitionDefiningCode", Transition.class, this);

  private CarePlanActionContainment() {
    super("openEHR-EHR-ACTION.care_plan.v0");
  }

  public static CarePlanActionContainment getInstance() {
    return new CarePlanActionContainment();
  }
}
