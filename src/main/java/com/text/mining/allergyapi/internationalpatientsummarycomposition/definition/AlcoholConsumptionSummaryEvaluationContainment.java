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

public class AlcoholConsumptionSummaryEvaluationContainment extends Containment {
  public SelectAqlField<AlcoholConsumptionSummaryEvaluation> ALCOHOL_CONSUMPTION_SUMMARY_EVALUATION = new AqlFieldImp<AlcoholConsumptionSummaryEvaluation>(AlcoholConsumptionSummaryEvaluation.class, "", "AlcoholConsumptionSummaryEvaluation", AlcoholConsumptionSummaryEvaluation.class, this);

  public SelectAqlField<OverallStatusDefiningCode2> OVERALL_STATUS_DEFINING_CODE = new AqlFieldImp<OverallStatusDefiningCode2>(AlcoholConsumptionSummaryEvaluation.class, "/data[at0001]/items[at0089]/value|defining_code", "overallStatusDefiningCode", OverallStatusDefiningCode2.class, this);

  public SelectAqlField<NullFlavour> OVERALL_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AlcoholConsumptionSummaryEvaluation.class, "/data[at0001]/items[at0089]/null_flavour|defining_code", "overallStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<AlcoholConsumptionSummaryPerEpisodeCluster> PER_EPISODE = new ListAqlFieldImp<AlcoholConsumptionSummaryPerEpisodeCluster>(AlcoholConsumptionSummaryEvaluation.class, "/data[at0001]/items[at0064]", "perEpisode", AlcoholConsumptionSummaryPerEpisodeCluster.class, this);

  public ListSelectAqlField<Cluster> OVERALL_DETAILS = new ListAqlFieldImp<Cluster>(AlcoholConsumptionSummaryEvaluation.class, "/data[at0001]/items[at0086]", "overallDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(AlcoholConsumptionSummaryEvaluation.class, "/protocol[at0021]/items[at0073]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AlcoholConsumptionSummaryEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AlcoholConsumptionSummaryEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AlcoholConsumptionSummaryEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private AlcoholConsumptionSummaryEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.alcohol_consumption_summary.v1");
  }

  public static AlcoholConsumptionSummaryEvaluationContainment getInstance() {
    return new AlcoholConsumptionSummaryEvaluationContainment();
  }
}
