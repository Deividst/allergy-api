package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ProblemDiagnosisQualifierClusterContainment extends Containment {
  public SelectAqlField<ProblemDiagnosisQualifierCluster> PROBLEM_DIAGNOSIS_QUALIFIER_CLUSTER = new AqlFieldImp<ProblemDiagnosisQualifierCluster>(ProblemDiagnosisQualifierCluster.class, "", "ProblemDiagnosisQualifierCluster", ProblemDiagnosisQualifierCluster.class, this);

  public SelectAqlField<ActiveInactiveDefiningCode> ACTIVE_INACTIVE_DEFINING_CODE = new AqlFieldImp<ActiveInactiveDefiningCode>(ProblemDiagnosisQualifierCluster.class, "/items[at0003]/value|defining_code", "activeInactiveDefiningCode", ActiveInactiveDefiningCode.class, this);

  public SelectAqlField<NullFlavour> ACTIVE_INACTIVE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster.class, "/items[at0003]/null_flavour|defining_code", "activeInactiveNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<ResolutionPhaseDefiningCode> RESOLUTION_PHASE_DEFINING_CODE = new AqlFieldImp<ResolutionPhaseDefiningCode>(ProblemDiagnosisQualifierCluster.class, "/items[at0083]/value|defining_code", "resolutionPhaseDefiningCode", ResolutionPhaseDefiningCode.class, this);

  public SelectAqlField<NullFlavour> RESOLUTION_PHASE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster.class, "/items[at0083]/null_flavour|defining_code", "resolutionPhaseNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<RemissionStatusDefiningCode> REMISSION_STATUS_DEFINING_CODE = new AqlFieldImp<RemissionStatusDefiningCode>(ProblemDiagnosisQualifierCluster.class, "/items[at0089]/value|defining_code", "remissionStatusDefiningCode", RemissionStatusDefiningCode.class, this);

  public SelectAqlField<NullFlavour> REMISSION_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster.class, "/items[at0089]/null_flavour|defining_code", "remissionStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<OccurrenceDefiningCode> OCCURRENCE_DEFINING_CODE = new AqlFieldImp<OccurrenceDefiningCode>(ProblemDiagnosisQualifierCluster.class, "/items[at0071]/value|defining_code", "occurrenceDefiningCode", OccurrenceDefiningCode.class, this);

  public SelectAqlField<NullFlavour> OCCURRENCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster.class, "/items[at0071]/null_flavour|defining_code", "occurrenceNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisQualifierCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ProblemDiagnosisQualifierClusterContainment() {
    super("openEHR-EHR-CLUSTER.problem_qualifier.v1");
  }

  public static ProblemDiagnosisQualifierClusterContainment getInstance() {
    return new ProblemDiagnosisQualifierClusterContainment();
  }
}
