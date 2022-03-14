package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PregnancySummaryEvaluationContainment extends Containment {
  public SelectAqlField<PregnancySummaryEvaluation> PREGNANCY_SUMMARY_EVALUATION = new AqlFieldImp<PregnancySummaryEvaluation>(PregnancySummaryEvaluation.class, "", "PregnancySummaryEvaluation", PregnancySummaryEvaluation.class, this);

  public SelectAqlField<StatusDefiningCode> STATUS_DEFINING_CODE = new AqlFieldImp<StatusDefiningCode>(PregnancySummaryEvaluation.class, "/data[at0001]/items[at0141]/value|defining_code", "statusDefiningCode", StatusDefiningCode.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PregnancySummaryEvaluation.class, "/data[at0001]/items[at0141]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> PREGNANCY_OUTCOME_VALUE = new AqlFieldImp<String>(PregnancySummaryEvaluation.class, "/data[at0001]/items[at0145]/items[at0094]/value|value", "pregnancyOutcomeValue", String.class, this);

  public SelectAqlField<NullFlavour> PREGNANCY_OUTCOME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PregnancySummaryEvaluation.class, "/data[at0001]/items[at0145]/items[at0094]/null_flavour|defining_code", "pregnancyOutcomeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<ItemTree> TREE = new AqlFieldImp<ItemTree>(PregnancySummaryEvaluation.class, "/protocol[at0081]", "tree", ItemTree.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PregnancySummaryEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PregnancySummaryEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PregnancySummaryEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private PregnancySummaryEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.pregnancy_summary.v0");
  }

  public static PregnancySummaryEvaluationContainment getInstance() {
    return new PregnancySummaryEvaluationContainment();
  }
}
