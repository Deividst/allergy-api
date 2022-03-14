package com.text.mining.allergyapi.internationalpatientsummarycomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.definition.*;
import org.ehrbase.client.annotations.*;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.health_summary.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.722940-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Template("International Patient Summary")
public class InternationalPatientSummaryComposition implements CompositionEntity {
  /**
   * Path: International Patient Summary/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: International Patient Summary/context/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/context/other_context[at0001]/items[at0002]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: International Patient Summary/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: International Patient Summary/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: International Patient Summary/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: International Patient Summary/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: International Patient Summary/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement
   * Description: Any activity related to the planning, scheduling, prescription management, dispensing, administration, cessation and other use of a medication, vaccine, nutritional product or other therapeutic item.
   * Comment: This is not limited to activities performed based on medication orders from clinicians, but could also include for example taking over the counter medication.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Medication Summary']/items[openEHR-EHR-ACTION.medication.v1 and name/value='Medication statement']")
  private MedicationStatementAction medicationStatement;

  /**
   * Path: International Patient Summary/Medication Summary/Exclusion - global
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items that are either not currently present, or have not been present in the past.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Medication Summary']/items[openEHR-EHR-EVALUATION.exclusion_global.v1]")
  private ExclusionGlobalEvaluation medicationSummaryExclusionGlobal;

  /**
   * Path: International Patient Summary/Medication Summary/Absence of information
   * Description: Statement that specified health information is not available for inclusion in the health record or extract at the time of recording.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Medication Summary']/items[openEHR-EHR-EVALUATION.absence.v2]")
  private AbsenceOfInformationEvaluation medicationSummaryAbsenceOfInformation;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Allergy Intolerance
   * Description: Risk of harmful or undesirable physiological response which is unique to an individual and associated with exposure to a substance.
   * Comment: Substances include, but are not limited to: a therapeutic substance administered correctly at an appropriate dosage for the individual; food; material derived from plants or animals; or venom from insect stings.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Allergies & Intolerances']/items[openEHR-EHR-EVALUATION.adverse_reaction_risk.v1 and name/value='Allergy Intolerance']")
  private AllergyIntoleranceEvaluation allergyIntolerance;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Exclusion - global
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items that are either not currently present, or have not been present in the past.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Allergies & Intolerances']/items[openEHR-EHR-EVALUATION.exclusion_global.v1]")
  private ExclusionGlobalEvaluation2 allergiesIntolerancesExclusionGlobal;

  /**
   * Path: International Patient Summary/Allergies & Intolerances/Absence of information
   * Description: Statement that specified health information is not available for inclusion in the health record or extract at the time of recording.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Allergies & Intolerances']/items[openEHR-EHR-EVALUATION.absence.v2]")
  private AbsenceOfInformationEvaluation2 allergiesIntolerancesAbsenceOfInformation;

  /**
   * Path: International Patient Summary/Problem List/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Problem List']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private ProblemDiagnosisEvaluation problemListProblemDiagnosis;

  /**
   * Path: International Patient Summary/Problem List/Exclusion - global
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items that are either not currently present, or have not been present in the past.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Problem List']/items[openEHR-EHR-EVALUATION.exclusion_global.v1]")
  private ExclusionGlobalEvaluation3 problemListExclusionGlobal;

  /**
   * Path: International Patient Summary/Problem List/Absence of information
   * Description: Statement that specified health information is not available for inclusion in the health record or extract at the time of recording.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Problem List']/items[openEHR-EHR-EVALUATION.absence.v2]")
  private AbsenceOfInformationEvaluation3 problemListAbsenceOfInformation;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement
   * Description: Any activity related to the planning, scheduling, prescription management, dispensing, administration, cessation and other use of a medication, vaccine, nutritional product or other therapeutic item.
   * Comment: This is not limited to activities performed based on medication orders from clinicians, but could also include for example taking over the counter medication.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Immunizations']/items[openEHR-EHR-ACTION.medication.v1 and name/value='Immunization statement']")
  private ImmunizationStatementAction immunizationStatement;

  /**
   * Path: International Patient Summary/Immunizations/Absence of information
   * Description: Statement that specified health information is not available for inclusion in the health record or extract at the time of recording.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Immunizations']/items[openEHR-EHR-EVALUATION.absence.v2]")
  private AbsenceOfInformationEvaluation4 immunizationsAbsenceOfInformation;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure
   * Description: A clinical activity carried out for screening, investigative, diagnostic, curative, therapeutic, evaluative or palliative purposes.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='History of Procedures']/items[openEHR-EHR-ACTION.procedure.v1]")
  private ProcedureAction procedure;

  /**
   * Path: International Patient Summary/History of Procedures/Absence of information
   * Description: Statement that specified health information is not available for inclusion in the health record or extract at the time of recording.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='History of Procedures']/items[openEHR-EHR-EVALUATION.absence.v2]")
  private AbsenceOfInformationEvaluation5 historyOfProceduresAbsenceOfInformation;

  /**
   * Path: International Patient Summary/History of Procedures/Exclusion - global
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items that are either not currently present, or have not been present in the past.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='History of Procedures']/items[openEHR-EHR-EVALUATION.exclusion_global.v1]")
  private ExclusionGlobalEvaluation4 historyOfProceduresExclusionGlobal;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement
   * Description: An ongoing and persistent overview about medical devices that have been fitted or implanted.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Medical Devices']/items[openEHR-EHR-EVALUATION.device_summary.v0 and name/value='Device use statement']")
  private DeviceUseStatementEvaluation deviceUseStatement;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result
   * Description: The result, including findings and the laboratory's interpretation, of an investigation performed on specimens collected from an individual or related to that individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Diagnostic Results']/items[openEHR-EHR-OBSERVATION.laboratory_test_result.v1]")
  private LaboratoryTestResultObservation laboratoryTestResult;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result
   * Description: Record the findings and interpretation of an imaging examination performed.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Diagnostic Results']/items[openEHR-EHR-OBSERVATION.imaging_exam_result.v0]")
  private ImagingExaminationResultObservation imagingExaminationResult;

  /**
   * Path: International Patient Summary/Vital Signs/Body weight
   * Description: Measurement of the body weight of an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.body_weight.v2]")
  private BodyWeightObservation bodyWeight;

  /**
   * Path: International Patient Summary/Vital Signs/Height/Length
   * Description: Height, or body length, is measured from crown of head to sole of foot.
   * Comment: Height is measured with the individual in a standing position and body length in a recumbent position.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.height.v2]")
  private HeightLengthObservation heightLength;

  /**
   * Path: International Patient Summary/Vital Signs/Respiration
   * Description: The characteristics of spontaneous breathing by an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.respiration.v2]")
  private RespirationObservation respiration;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse/Heart beat
   * Description: The rate and associated attributes for a pulse or heart beat.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.pulse.v2]")
  private PulseHeartBeatObservation pulseHeartBeat;

  /**
   * Path: International Patient Summary/Vital Signs/Body temperature
   * Description: A measurement of the body temperature, which is a surrogate for the core body temperature of the individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.body_temperature.v2]")
  private BodyTemperatureObservation bodyTemperature;

  /**
   * Path: International Patient Summary/Vital Signs/Head circumference
   * Description: The measurement of the longest distance around the head.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.head_circumference.v1]")
  private HeadCircumferenceObservation headCircumference;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry
   * Description: Blood oxygen and related measurements, measured by pulse oximetry or pulse CO-oximetry.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.pulse_oximetry.v1]")
  private PulseOximetryObservation pulseOximetry;

  /**
   * Path: International Patient Summary/Vital Signs/Body mass index
   * Description: Calculated measurement which compares a person's weight and height.
   * Comment: Body Mass Index is a calculated ratio describing how an individual's body weight relates to the weight that is regarded as normal, or desirable, for the individual's height.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.body_mass_index.v2]")
  private BodyMassIndexObservation bodyMassIndex;

  /**
   * Path: International Patient Summary/Vital Signs/Blood pressure
   * Description: The local measurement of arterial blood pressure which is a surrogate for arterial pressure in the systemic circulation.
   * Comment: Most commonly, use of the term 'blood pressure' refers to measurement of brachial artery pressure in the upper arm.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Vital Signs']/items[openEHR-EHR-OBSERVATION.blood_pressure.v2]")
  private BloodPressureObservation bloodPressure;

  /**
   * Path: International Patient Summary/Past History of Illnesses/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Past History of Illnesses']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private ProblemDiagnosisEvaluation2 pastHistoryOfIllnessesProblemDiagnosis;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary
   * Description: Overview or summary record of a pregnancy including the antenatal period, labour, birth and the immediate postnatal period.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Pregnancy']/items[openEHR-EHR-EVALUATION.pregnancy_summary.v0]")
  private PregnancySummaryEvaluation pregnancySummary;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery
   * Description: Estimated date of delivery for a pregnancy.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Pregnancy']/items[openEHR-EHR-EVALUATION.estimated_date_delivery.v0]")
  private EstimatedDateOfDeliveryEvaluation estimatedDateOfDelivery;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy
   * Description: Statement to explicitly record that a pregnancy was not present.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Pregnancy']/items[openEHR-EHR-OBSERVATION.exclusion_pregnancy.v0]")
  private ExclusionOfPregnancyObservation exclusionOfPregnancy;

  /**
   * Path: International Patient Summary/Social History/Tobacco smoking summary
   * Description: Summary or persistent information about the tobacco smoking habits of an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Social History']/items[openEHR-EHR-EVALUATION.tobacco_smoking_summary.v1]")
  private TobaccoSmokingSummaryEvaluation tobaccoSmokingSummary;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary
   * Description: Summary or persistent information about the typical alcohol consumption of an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Social History']/items[openEHR-EHR-EVALUATION.alcohol_consumption_summary.v1]")
  private AlcoholConsumptionSummaryEvaluation alcoholConsumptionSummary;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan
   * Description: Plan or sequence of discrete activities developed to achieve a specified management goal or treatment outcome, carried out by health professionals and/or the patient.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Plan of Care']/items[openEHR-EHR-ACTION.care_plan.v0]")
  private CarePlanAction carePlan;

  /**
   * Path: International Patient Summary/Plan of Care/Service request
   * Description: Request for a health-related service or activity to be delivered by a clinician, organisation or agency.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Plan of Care']/items[openEHR-EHR-INSTRUCTION.service_request.v1]")
  private ServiceRequestInstruction serviceRequest;

  /**
   * Path: International Patient Summary/Functional Status/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Functional Status']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private ProblemDiagnosisEvaluation3 functionalStatusProblemDiagnosis;

  /**
   * Path: International Patient Summary/Functional Status/Clinical impression
   * Description: Narrative summary or overview about a patient, specifically from the perspective of a healthcare provider, and with or without associated interpretations.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Functional Status']/items[openEHR-EHR-EVALUATION.clinical_synopsis.v1 and name/value='Clinical impression']")
  private ClinicalImpressionEvaluation clinicalImpression;

  /**
   * Path: International Patient Summary/Advanced Directives/Advance care directive
   * Description: A framework to communicate the preferences of an individual for future medical treatment and care.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Advanced Directives']/items[openEHR-EHR-EVALUATION.advance_care_directive.v1]")
  private AdvanceCareDirectiveEvaluation advanceCareDirective;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment
   * Description: Decision/s about limitation of future treatment, determined by a senior clinician.
   * Comment: In many countries this is known as the NFR (Not for resuscitation), DNR (Do not resuscitate), DNAR (Do not attempt resuscitation) or DNACPR (Do not attempt cardiopulmonary resuscitation) decision.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Advanced Directives']/items[openEHR-EHR-EVALUATION.limitation_of_treatment.v0]")
  private LimitationOfTreatmentEvaluation limitationOfTreatment;

  /**
   * Path: International Patient Summary/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: International Patient Summary/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setMedicationStatement(MedicationStatementAction medicationStatement) {
     this.medicationStatement = medicationStatement;
  }

  public MedicationStatementAction getMedicationStatement() {
     return this.medicationStatement ;
  }

  public void setMedicationSummaryExclusionGlobal(
      ExclusionGlobalEvaluation medicationSummaryExclusionGlobal) {
     this.medicationSummaryExclusionGlobal = medicationSummaryExclusionGlobal;
  }

  public ExclusionGlobalEvaluation getMedicationSummaryExclusionGlobal() {
     return this.medicationSummaryExclusionGlobal ;
  }

  public void setMedicationSummaryAbsenceOfInformation(
      AbsenceOfInformationEvaluation medicationSummaryAbsenceOfInformation) {
     this.medicationSummaryAbsenceOfInformation = medicationSummaryAbsenceOfInformation;
  }

  public AbsenceOfInformationEvaluation getMedicationSummaryAbsenceOfInformation() {
     return this.medicationSummaryAbsenceOfInformation ;
  }

  public void setAllergyIntolerance(AllergyIntoleranceEvaluation allergyIntolerance) {
     this.allergyIntolerance = allergyIntolerance;
  }

  public AllergyIntoleranceEvaluation getAllergyIntolerance() {
     return this.allergyIntolerance ;
  }

  public void setAllergiesIntolerancesExclusionGlobal(
      ExclusionGlobalEvaluation2 allergiesIntolerancesExclusionGlobal) {
     this.allergiesIntolerancesExclusionGlobal = allergiesIntolerancesExclusionGlobal;
  }

  public ExclusionGlobalEvaluation2 getAllergiesIntolerancesExclusionGlobal() {
     return this.allergiesIntolerancesExclusionGlobal ;
  }

  public void setAllergiesIntolerancesAbsenceOfInformation(
      AbsenceOfInformationEvaluation2 allergiesIntolerancesAbsenceOfInformation) {
     this.allergiesIntolerancesAbsenceOfInformation = allergiesIntolerancesAbsenceOfInformation;
  }

  public AbsenceOfInformationEvaluation2 getAllergiesIntolerancesAbsenceOfInformation() {
     return this.allergiesIntolerancesAbsenceOfInformation ;
  }

  public void setProblemListProblemDiagnosis(
      ProblemDiagnosisEvaluation problemListProblemDiagnosis) {
     this.problemListProblemDiagnosis = problemListProblemDiagnosis;
  }

  public ProblemDiagnosisEvaluation getProblemListProblemDiagnosis() {
     return this.problemListProblemDiagnosis ;
  }

  public void setProblemListExclusionGlobal(ExclusionGlobalEvaluation3 problemListExclusionGlobal) {
     this.problemListExclusionGlobal = problemListExclusionGlobal;
  }

  public ExclusionGlobalEvaluation3 getProblemListExclusionGlobal() {
     return this.problemListExclusionGlobal ;
  }

  public void setProblemListAbsenceOfInformation(
      AbsenceOfInformationEvaluation3 problemListAbsenceOfInformation) {
     this.problemListAbsenceOfInformation = problemListAbsenceOfInformation;
  }

  public AbsenceOfInformationEvaluation3 getProblemListAbsenceOfInformation() {
     return this.problemListAbsenceOfInformation ;
  }

  public void setImmunizationStatement(ImmunizationStatementAction immunizationStatement) {
     this.immunizationStatement = immunizationStatement;
  }

  public ImmunizationStatementAction getImmunizationStatement() {
     return this.immunizationStatement ;
  }

  public void setImmunizationsAbsenceOfInformation(
      AbsenceOfInformationEvaluation4 immunizationsAbsenceOfInformation) {
     this.immunizationsAbsenceOfInformation = immunizationsAbsenceOfInformation;
  }

  public AbsenceOfInformationEvaluation4 getImmunizationsAbsenceOfInformation() {
     return this.immunizationsAbsenceOfInformation ;
  }

  public void setProcedure(ProcedureAction procedure) {
     this.procedure = procedure;
  }

  public ProcedureAction getProcedure() {
     return this.procedure ;
  }

  public void setHistoryOfProceduresAbsenceOfInformation(
      AbsenceOfInformationEvaluation5 historyOfProceduresAbsenceOfInformation) {
     this.historyOfProceduresAbsenceOfInformation = historyOfProceduresAbsenceOfInformation;
  }

  public AbsenceOfInformationEvaluation5 getHistoryOfProceduresAbsenceOfInformation() {
     return this.historyOfProceduresAbsenceOfInformation ;
  }

  public void setHistoryOfProceduresExclusionGlobal(
      ExclusionGlobalEvaluation4 historyOfProceduresExclusionGlobal) {
     this.historyOfProceduresExclusionGlobal = historyOfProceduresExclusionGlobal;
  }

  public ExclusionGlobalEvaluation4 getHistoryOfProceduresExclusionGlobal() {
     return this.historyOfProceduresExclusionGlobal ;
  }

  public void setDeviceUseStatement(DeviceUseStatementEvaluation deviceUseStatement) {
     this.deviceUseStatement = deviceUseStatement;
  }

  public DeviceUseStatementEvaluation getDeviceUseStatement() {
     return this.deviceUseStatement ;
  }

  public void setLaboratoryTestResult(LaboratoryTestResultObservation laboratoryTestResult) {
     this.laboratoryTestResult = laboratoryTestResult;
  }

  public LaboratoryTestResultObservation getLaboratoryTestResult() {
     return this.laboratoryTestResult ;
  }

  public void setImagingExaminationResult(
      ImagingExaminationResultObservation imagingExaminationResult) {
     this.imagingExaminationResult = imagingExaminationResult;
  }

  public ImagingExaminationResultObservation getImagingExaminationResult() {
     return this.imagingExaminationResult ;
  }

  public void setBodyWeight(BodyWeightObservation bodyWeight) {
     this.bodyWeight = bodyWeight;
  }

  public BodyWeightObservation getBodyWeight() {
     return this.bodyWeight ;
  }

  public void setHeightLength(HeightLengthObservation heightLength) {
     this.heightLength = heightLength;
  }

  public HeightLengthObservation getHeightLength() {
     return this.heightLength ;
  }

  public void setRespiration(RespirationObservation respiration) {
     this.respiration = respiration;
  }

  public RespirationObservation getRespiration() {
     return this.respiration ;
  }

  public void setPulseHeartBeat(PulseHeartBeatObservation pulseHeartBeat) {
     this.pulseHeartBeat = pulseHeartBeat;
  }

  public PulseHeartBeatObservation getPulseHeartBeat() {
     return this.pulseHeartBeat ;
  }

  public void setBodyTemperature(BodyTemperatureObservation bodyTemperature) {
     this.bodyTemperature = bodyTemperature;
  }

  public BodyTemperatureObservation getBodyTemperature() {
     return this.bodyTemperature ;
  }

  public void setHeadCircumference(HeadCircumferenceObservation headCircumference) {
     this.headCircumference = headCircumference;
  }

  public HeadCircumferenceObservation getHeadCircumference() {
     return this.headCircumference ;
  }

  public void setPulseOximetry(PulseOximetryObservation pulseOximetry) {
     this.pulseOximetry = pulseOximetry;
  }

  public PulseOximetryObservation getPulseOximetry() {
     return this.pulseOximetry ;
  }

  public void setBodyMassIndex(BodyMassIndexObservation bodyMassIndex) {
     this.bodyMassIndex = bodyMassIndex;
  }

  public BodyMassIndexObservation getBodyMassIndex() {
     return this.bodyMassIndex ;
  }

  public void setBloodPressure(BloodPressureObservation bloodPressure) {
     this.bloodPressure = bloodPressure;
  }

  public BloodPressureObservation getBloodPressure() {
     return this.bloodPressure ;
  }

  public void setPastHistoryOfIllnessesProblemDiagnosis(
      ProblemDiagnosisEvaluation2 pastHistoryOfIllnessesProblemDiagnosis) {
     this.pastHistoryOfIllnessesProblemDiagnosis = pastHistoryOfIllnessesProblemDiagnosis;
  }

  public ProblemDiagnosisEvaluation2 getPastHistoryOfIllnessesProblemDiagnosis() {
     return this.pastHistoryOfIllnessesProblemDiagnosis ;
  }

  public void setPregnancySummary(PregnancySummaryEvaluation pregnancySummary) {
     this.pregnancySummary = pregnancySummary;
  }

  public PregnancySummaryEvaluation getPregnancySummary() {
     return this.pregnancySummary ;
  }

  public void setEstimatedDateOfDelivery(
      EstimatedDateOfDeliveryEvaluation estimatedDateOfDelivery) {
     this.estimatedDateOfDelivery = estimatedDateOfDelivery;
  }

  public EstimatedDateOfDeliveryEvaluation getEstimatedDateOfDelivery() {
     return this.estimatedDateOfDelivery ;
  }

  public void setExclusionOfPregnancy(ExclusionOfPregnancyObservation exclusionOfPregnancy) {
     this.exclusionOfPregnancy = exclusionOfPregnancy;
  }

  public ExclusionOfPregnancyObservation getExclusionOfPregnancy() {
     return this.exclusionOfPregnancy ;
  }

  public void setTobaccoSmokingSummary(TobaccoSmokingSummaryEvaluation tobaccoSmokingSummary) {
     this.tobaccoSmokingSummary = tobaccoSmokingSummary;
  }

  public TobaccoSmokingSummaryEvaluation getTobaccoSmokingSummary() {
     return this.tobaccoSmokingSummary ;
  }

  public void setAlcoholConsumptionSummary(
      AlcoholConsumptionSummaryEvaluation alcoholConsumptionSummary) {
     this.alcoholConsumptionSummary = alcoholConsumptionSummary;
  }

  public AlcoholConsumptionSummaryEvaluation getAlcoholConsumptionSummary() {
     return this.alcoholConsumptionSummary ;
  }

  public void setCarePlan(CarePlanAction carePlan) {
     this.carePlan = carePlan;
  }

  public CarePlanAction getCarePlan() {
     return this.carePlan ;
  }

  public void setServiceRequest(ServiceRequestInstruction serviceRequest) {
     this.serviceRequest = serviceRequest;
  }

  public ServiceRequestInstruction getServiceRequest() {
     return this.serviceRequest ;
  }

  public void setFunctionalStatusProblemDiagnosis(
      ProblemDiagnosisEvaluation3 functionalStatusProblemDiagnosis) {
     this.functionalStatusProblemDiagnosis = functionalStatusProblemDiagnosis;
  }

  public ProblemDiagnosisEvaluation3 getFunctionalStatusProblemDiagnosis() {
     return this.functionalStatusProblemDiagnosis ;
  }

  public void setClinicalImpression(ClinicalImpressionEvaluation clinicalImpression) {
     this.clinicalImpression = clinicalImpression;
  }

  public ClinicalImpressionEvaluation getClinicalImpression() {
     return this.clinicalImpression ;
  }

  public void setAdvanceCareDirective(AdvanceCareDirectiveEvaluation advanceCareDirective) {
     this.advanceCareDirective = advanceCareDirective;
  }

  public AdvanceCareDirectiveEvaluation getAdvanceCareDirective() {
     return this.advanceCareDirective ;
  }

  public void setLimitationOfTreatment(LimitationOfTreatmentEvaluation limitationOfTreatment) {
     this.limitationOfTreatment = limitationOfTreatment;
  }

  public LimitationOfTreatmentEvaluation getLimitationOfTreatment() {
     return this.limitationOfTreatment ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
