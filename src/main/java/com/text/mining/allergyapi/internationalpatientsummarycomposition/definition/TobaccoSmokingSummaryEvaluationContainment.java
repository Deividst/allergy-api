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

public class TobaccoSmokingSummaryEvaluationContainment extends Containment {
  public SelectAqlField<TobaccoSmokingSummaryEvaluation> TOBACCO_SMOKING_SUMMARY_EVALUATION = new AqlFieldImp<TobaccoSmokingSummaryEvaluation>(TobaccoSmokingSummaryEvaluation.class, "", "TobaccoSmokingSummaryEvaluation", TobaccoSmokingSummaryEvaluation.class, this);

  public SelectAqlField<OverallStatusDefiningCode> OVERALL_STATUS_DEFINING_CODE = new AqlFieldImp<OverallStatusDefiningCode>(TobaccoSmokingSummaryEvaluation.class, "/data[at0001]/items[at0089]/value|defining_code", "overallStatusDefiningCode", OverallStatusDefiningCode.class, this);

  public SelectAqlField<NullFlavour> OVERALL_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TobaccoSmokingSummaryEvaluation.class, "/data[at0001]/items[at0089]/null_flavour|defining_code", "overallStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> OVERALL_DETAILS = new ListAqlFieldImp<Cluster>(TobaccoSmokingSummaryEvaluation.class, "/data[at0001]/items[at0086]", "overallDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(TobaccoSmokingSummaryEvaluation.class, "/protocol[at0021]/items[at0073]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(TobaccoSmokingSummaryEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(TobaccoSmokingSummaryEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(TobaccoSmokingSummaryEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private TobaccoSmokingSummaryEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.tobacco_smoking_summary.v1");
  }

  public static TobaccoSmokingSummaryEvaluationContainment getInstance() {
    return new TobaccoSmokingSummaryEvaluationContainment();
  }
}
