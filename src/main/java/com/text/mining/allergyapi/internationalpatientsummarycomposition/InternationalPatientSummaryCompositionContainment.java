package com.text.mining.allergyapi.internationalpatientsummarycomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.definition.*;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

import java.time.temporal.TemporalAccessor;

public class InternationalPatientSummaryCompositionContainment extends Containment {
  public SelectAqlField<InternationalPatientSummaryComposition> INTERNATIONAL_PATIENT_SUMMARY_COMPOSITION = new AqlFieldImp<InternationalPatientSummaryComposition>(InternationalPatientSummaryComposition.class, "", "InternationalPatientSummaryComposition", InternationalPatientSummaryComposition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(InternationalPatientSummaryComposition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(InternationalPatientSummaryComposition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(InternationalPatientSummaryComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(InternationalPatientSummaryComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(InternationalPatientSummaryComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(InternationalPatientSummaryComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(InternationalPatientSummaryComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(InternationalPatientSummaryComposition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<MedicationStatementAction> MEDICATION_STATEMENT = new AqlFieldImp<MedicationStatementAction>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-ACTION.medication.v1]", "medicationStatement", MedicationStatementAction.class, this);

  public SelectAqlField<ExclusionGlobalEvaluation> MEDICATION_SUMMARY_EXCLUSION_GLOBAL = new AqlFieldImp<ExclusionGlobalEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.exclusion_global.v1]", "medicationSummaryExclusionGlobal", ExclusionGlobalEvaluation.class, this);

  public SelectAqlField<AbsenceOfInformationEvaluation> MEDICATION_SUMMARY_ABSENCE_OF_INFORMATION = new AqlFieldImp<AbsenceOfInformationEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.absence.v2]", "medicationSummaryAbsenceOfInformation", AbsenceOfInformationEvaluation.class, this);

  public SelectAqlField<AllergyIntoleranceEvaluation> ALLERGY_INTOLERANCE = new AqlFieldImp<AllergyIntoleranceEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.adverse_reaction_risk.v1]", "allergyIntolerance", AllergyIntoleranceEvaluation.class, this);

  public SelectAqlField<ExclusionGlobalEvaluation2> ALLERGIES_INTOLERANCES_EXCLUSION_GLOBAL = new AqlFieldImp<ExclusionGlobalEvaluation2>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.exclusion_global.v1]", "allergiesIntolerancesExclusionGlobal", ExclusionGlobalEvaluation2.class, this);

  public SelectAqlField<AbsenceOfInformationEvaluation2> ALLERGIES_INTOLERANCES_ABSENCE_OF_INFORMATION = new AqlFieldImp<AbsenceOfInformationEvaluation2>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.absence.v2]", "allergiesIntolerancesAbsenceOfInformation", AbsenceOfInformationEvaluation2.class, this);

  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_LIST_PROBLEM_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "problemListProblemDiagnosis", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<ExclusionGlobalEvaluation3> PROBLEM_LIST_EXCLUSION_GLOBAL = new AqlFieldImp<ExclusionGlobalEvaluation3>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.exclusion_global.v1]", "problemListExclusionGlobal", ExclusionGlobalEvaluation3.class, this);

  public SelectAqlField<AbsenceOfInformationEvaluation3> PROBLEM_LIST_ABSENCE_OF_INFORMATION = new AqlFieldImp<AbsenceOfInformationEvaluation3>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.absence.v2]", "problemListAbsenceOfInformation", AbsenceOfInformationEvaluation3.class, this);

  public SelectAqlField<ImmunizationStatementAction> IMMUNIZATION_STATEMENT = new AqlFieldImp<ImmunizationStatementAction>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-ACTION.medication.v1]", "immunizationStatement", ImmunizationStatementAction.class, this);

  public SelectAqlField<AbsenceOfInformationEvaluation4> IMMUNIZATIONS_ABSENCE_OF_INFORMATION = new AqlFieldImp<AbsenceOfInformationEvaluation4>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.absence.v2]", "immunizationsAbsenceOfInformation", AbsenceOfInformationEvaluation4.class, this);

  public SelectAqlField<ProcedureAction> PROCEDURE = new AqlFieldImp<ProcedureAction>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-ACTION.procedure.v1]", "procedure", ProcedureAction.class, this);

  public SelectAqlField<AbsenceOfInformationEvaluation5> HISTORY_OF_PROCEDURES_ABSENCE_OF_INFORMATION = new AqlFieldImp<AbsenceOfInformationEvaluation5>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.absence.v2]", "historyOfProceduresAbsenceOfInformation", AbsenceOfInformationEvaluation5.class, this);

  public SelectAqlField<ExclusionGlobalEvaluation4> HISTORY_OF_PROCEDURES_EXCLUSION_GLOBAL = new AqlFieldImp<ExclusionGlobalEvaluation4>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.exclusion_global.v1]", "historyOfProceduresExclusionGlobal", ExclusionGlobalEvaluation4.class, this);

  public SelectAqlField<DeviceUseStatementEvaluation> DEVICE_USE_STATEMENT = new AqlFieldImp<DeviceUseStatementEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.device_summary.v0]", "deviceUseStatement", DeviceUseStatementEvaluation.class, this);

  public SelectAqlField<LaboratoryTestResultObservation> LABORATORY_TEST_RESULT = new AqlFieldImp<LaboratoryTestResultObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.laboratory_test_result.v1]", "laboratoryTestResult", LaboratoryTestResultObservation.class, this);

  public SelectAqlField<ImagingExaminationResultObservation> IMAGING_EXAMINATION_RESULT = new AqlFieldImp<ImagingExaminationResultObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.imaging_exam_result.v0]", "imagingExaminationResult", ImagingExaminationResultObservation.class, this);

  public SelectAqlField<BodyWeightObservation> BODY_WEIGHT = new AqlFieldImp<BodyWeightObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.body_weight.v2]", "bodyWeight", BodyWeightObservation.class, this);

  public SelectAqlField<HeightLengthObservation> HEIGHT_LENGTH = new AqlFieldImp<HeightLengthObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.height.v2]", "heightLength", HeightLengthObservation.class, this);

  public SelectAqlField<RespirationObservation> RESPIRATION = new AqlFieldImp<RespirationObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.respiration.v2]", "respiration", RespirationObservation.class, this);

  public SelectAqlField<PulseHeartBeatObservation> PULSE_HEART_BEAT = new AqlFieldImp<PulseHeartBeatObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.pulse.v2]", "pulseHeartBeat", PulseHeartBeatObservation.class, this);

  public SelectAqlField<BodyTemperatureObservation> BODY_TEMPERATURE = new AqlFieldImp<BodyTemperatureObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.body_temperature.v2]", "bodyTemperature", BodyTemperatureObservation.class, this);

  public SelectAqlField<HeadCircumferenceObservation> HEAD_CIRCUMFERENCE = new AqlFieldImp<HeadCircumferenceObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.head_circumference.v1]", "headCircumference", HeadCircumferenceObservation.class, this);

  public SelectAqlField<PulseOximetryObservation> PULSE_OXIMETRY = new AqlFieldImp<PulseOximetryObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.pulse_oximetry.v1]", "pulseOximetry", PulseOximetryObservation.class, this);

  public SelectAqlField<BodyMassIndexObservation> BODY_MASS_INDEX = new AqlFieldImp<BodyMassIndexObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.body_mass_index.v2]", "bodyMassIndex", BodyMassIndexObservation.class, this);

  public SelectAqlField<BloodPressureObservation> BLOOD_PRESSURE = new AqlFieldImp<BloodPressureObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.blood_pressure.v2]", "bloodPressure", BloodPressureObservation.class, this);

  public SelectAqlField<ProblemDiagnosisEvaluation2> PAST_HISTORY_OF_ILLNESSES_PROBLEM_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisEvaluation2>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "pastHistoryOfIllnessesProblemDiagnosis", ProblemDiagnosisEvaluation2.class, this);

  public SelectAqlField<PregnancySummaryEvaluation> PREGNANCY_SUMMARY = new AqlFieldImp<PregnancySummaryEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.pregnancy_summary.v0]", "pregnancySummary", PregnancySummaryEvaluation.class, this);

  public SelectAqlField<EstimatedDateOfDeliveryEvaluation> ESTIMATED_DATE_OF_DELIVERY = new AqlFieldImp<EstimatedDateOfDeliveryEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.estimated_date_delivery.v0]", "estimatedDateOfDelivery", EstimatedDateOfDeliveryEvaluation.class, this);

  public SelectAqlField<ExclusionOfPregnancyObservation> EXCLUSION_OF_PREGNANCY = new AqlFieldImp<ExclusionOfPregnancyObservation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.exclusion_pregnancy.v0]", "exclusionOfPregnancy", ExclusionOfPregnancyObservation.class, this);

  public SelectAqlField<TobaccoSmokingSummaryEvaluation> TOBACCO_SMOKING_SUMMARY = new AqlFieldImp<TobaccoSmokingSummaryEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.tobacco_smoking_summary.v1]", "tobaccoSmokingSummary", TobaccoSmokingSummaryEvaluation.class, this);

  public SelectAqlField<AlcoholConsumptionSummaryEvaluation> ALCOHOL_CONSUMPTION_SUMMARY = new AqlFieldImp<AlcoholConsumptionSummaryEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.alcohol_consumption_summary.v1]", "alcoholConsumptionSummary", AlcoholConsumptionSummaryEvaluation.class, this);

  public SelectAqlField<CarePlanAction> CARE_PLAN = new AqlFieldImp<CarePlanAction>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-ACTION.care_plan.v0]", "carePlan", CarePlanAction.class, this);

  public SelectAqlField<ServiceRequestInstruction> SERVICE_REQUEST = new AqlFieldImp<ServiceRequestInstruction>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-INSTRUCTION.service_request.v1]", "serviceRequest", ServiceRequestInstruction.class, this);

  public SelectAqlField<ProblemDiagnosisEvaluation3> FUNCTIONAL_STATUS_PROBLEM_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisEvaluation3>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "functionalStatusProblemDiagnosis", ProblemDiagnosisEvaluation3.class, this);

  public SelectAqlField<ClinicalImpressionEvaluation> CLINICAL_IMPRESSION = new AqlFieldImp<ClinicalImpressionEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.clinical_synopsis.v1]", "clinicalImpression", ClinicalImpressionEvaluation.class, this);

  public SelectAqlField<AdvanceCareDirectiveEvaluation> ADVANCE_CARE_DIRECTIVE = new AqlFieldImp<AdvanceCareDirectiveEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.advance_care_directive.v1]", "advanceCareDirective", AdvanceCareDirectiveEvaluation.class, this);

  public SelectAqlField<LimitationOfTreatmentEvaluation> LIMITATION_OF_TREATMENT = new AqlFieldImp<LimitationOfTreatmentEvaluation>(InternationalPatientSummaryComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.limitation_of_treatment.v0]", "limitationOfTreatment", LimitationOfTreatmentEvaluation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(InternationalPatientSummaryComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(InternationalPatientSummaryComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(InternationalPatientSummaryComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(InternationalPatientSummaryComposition.class, "/territory", "territory", Territory.class, this);

  private InternationalPatientSummaryCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.health_summary.v1");
  }

  public static InternationalPatientSummaryCompositionContainment getInstance() {
    return new InternationalPatientSummaryCompositionContainment();
  }
}
