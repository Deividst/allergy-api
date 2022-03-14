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

public class ProblemDiagnosisEvaluation3Containment extends Containment {
  public SelectAqlField<ProblemDiagnosisEvaluation3> PROBLEM_DIAGNOSIS_EVALUATION3 = new AqlFieldImp<ProblemDiagnosisEvaluation3>(ProblemDiagnosisEvaluation3.class, "", "ProblemDiagnosisEvaluation3", ProblemDiagnosisEvaluation3.class, this);

  public SelectAqlField<String> PROBLEM_DIAGNOSIS_NAME_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0002]/value|value", "problemDiagnosisNameValue", String.class, this);

  public SelectAqlField<NullFlavour> PROBLEM_DIAGNOSIS_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "problemDiagnosisNameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ProblemDiagnosisBodySiteElement> BODY_SITE = new ListAqlFieldImp<ProblemDiagnosisBodySiteElement>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0012]", "bodySite", ProblemDiagnosisBodySiteElement.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_BODY_SITE = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0039]", "structuredBodySite", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_OF_ONSET_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0077]/value|value", "dateTimeOfOnsetValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_OF_ONSET_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0077]/null_flavour|defining_code", "dateTimeOfOnsetNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> SEVERITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0005]/null_flavour|defining_code", "severityNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_DETAILS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0043]", "specificDetails", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> DATE_OF_ABATEMENT_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0030]/value|value", "dateOfAbatementValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_OF_ABATEMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0030]/null_flavour|defining_code", "dateOfAbatementNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierCluster> PROBLEM_DIAGNOSIS_QUALIFIER = new AqlFieldImp<ProblemDiagnosisQualifierCluster>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.problem_qualifier.v1]", "problemDiagnosisQualifier", ProblemDiagnosisQualifierCluster.class, this);

  public SelectAqlField<NullFlavour> DIAGNOSTIC_CERTAINTY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0073]/null_flavour|defining_code", "diagnosticCertaintyNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation3.class, "/protocol[at0032]/items[at0070]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation3.class, "/protocol[at0032]/items[at0070]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation3.class, "/protocol[at0032]/items[at0071]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProblemDiagnosisEvaluation3.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProblemDiagnosisEvaluation3.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisEvaluation3.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ProblemDiagnosisDiagnosticCertaintyChoice> DIAGNOSTIC_CERTAINTY = new AqlFieldImp<ProblemDiagnosisDiagnosticCertaintyChoice>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0073]/value", "diagnosticCertainty", ProblemDiagnosisDiagnosticCertaintyChoice.class, this);

  public SelectAqlField<ProblemDiagnosisSeverityChoice> SEVERITY = new AqlFieldImp<ProblemDiagnosisSeverityChoice>(ProblemDiagnosisEvaluation3.class, "/data[at0001]/items[at0005]/value", "severity", ProblemDiagnosisSeverityChoice.class, this);

  private ProblemDiagnosisEvaluation3Containment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static ProblemDiagnosisEvaluation3Containment getInstance() {
    return new ProblemDiagnosisEvaluation3Containment();
  }
}
