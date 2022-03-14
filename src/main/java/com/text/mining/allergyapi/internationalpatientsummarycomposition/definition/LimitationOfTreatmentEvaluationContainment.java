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

import java.time.temporal.TemporalAccessor;

public class LimitationOfTreatmentEvaluationContainment extends Containment {
  public SelectAqlField<LimitationOfTreatmentEvaluation> LIMITATION_OF_TREATMENT_EVALUATION = new AqlFieldImp<LimitationOfTreatmentEvaluation>(LimitationOfTreatmentEvaluation.class, "", "LimitationOfTreatmentEvaluation", LimitationOfTreatmentEvaluation.class, this);

  public SelectAqlField<StatusDefiningCode3> STATUS_DEFINING_CODE = new AqlFieldImp<StatusDefiningCode3>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0002]/value|defining_code", "statusDefiningCode", StatusDefiningCode3.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<LimitationOfTreatmentPerLimitationCluster> PER_LIMITATION = new ListAqlFieldImp<LimitationOfTreatmentPerLimitationCluster>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0006]", "perLimitation", LimitationOfTreatmentPerLimitationCluster.class, this);

  public SelectAqlField<String> RATIONALE_VALUE = new AqlFieldImp<String>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0021]/value|value", "rationaleValue", String.class, this);

  public SelectAqlField<NullFlavour> RATIONALE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0021]/null_flavour|defining_code", "rationaleNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PatientAwarenessDefiningCode> PATIENT_AWARENESS_DEFINING_CODE = new AqlFieldImp<PatientAwarenessDefiningCode>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0022]/value|defining_code", "patientAwarenessDefiningCode", PatientAwarenessDefiningCode.class, this);

  public SelectAqlField<NullFlavour> PATIENT_AWARENESS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0022]/null_flavour|defining_code", "patientAwarenessNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> CARER_AWARENESS_VALUE = new AqlFieldImp<String>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0025]/value|value", "carerAwarenessValue", String.class, this);

  public SelectAqlField<NullFlavour> CARER_AWARENESS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0025]/null_flavour|defining_code", "carerAwarenessNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0026]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/data[at0001]/items[at0026]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> ELEMENT_VALUE = new AqlFieldImp<TemporalAccessor>(LimitationOfTreatmentEvaluation.class, "/protocol[at0027]/items[at029]/value|value", "elementValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> ELEMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/protocol[at0027]/items[at029]/null_flavour|defining_code", "elementNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> REVIEW_DATE_VALUE = new AqlFieldImp<TemporalAccessor>(LimitationOfTreatmentEvaluation.class, "/protocol[at0027]/items[at0030]/value|value", "reviewDateValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> REVIEW_DATE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LimitationOfTreatmentEvaluation.class, "/protocol[at0027]/items[at0030]/null_flavour|defining_code", "reviewDateNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(LimitationOfTreatmentEvaluation.class, "/protocol[at0027]/items[at0031]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(LimitationOfTreatmentEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(LimitationOfTreatmentEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(LimitationOfTreatmentEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private LimitationOfTreatmentEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.limitation_of_treatment.v0");
  }

  public static LimitationOfTreatmentEvaluationContainment getInstance() {
    return new LimitationOfTreatmentEvaluationContainment();
  }
}
