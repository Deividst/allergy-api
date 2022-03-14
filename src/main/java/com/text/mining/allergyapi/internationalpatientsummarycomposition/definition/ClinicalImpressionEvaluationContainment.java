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

public class ClinicalImpressionEvaluationContainment extends Containment {
  public SelectAqlField<ClinicalImpressionEvaluation> CLINICAL_IMPRESSION_EVALUATION = new AqlFieldImp<ClinicalImpressionEvaluation>(ClinicalImpressionEvaluation.class, "", "ClinicalImpressionEvaluation", ClinicalImpressionEvaluation.class, this);

  public SelectAqlField<String> IMPRESSION_VALUE = new AqlFieldImp<String>(ClinicalImpressionEvaluation.class, "/data[at0001]/items[at0002]/value|value", "impressionValue", String.class, this);

  public SelectAqlField<NullFlavour> IMPRESSION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ClinicalImpressionEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "impressionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ClinicalImpressionEvaluation.class, "/protocol[at0003]/items[at0004]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ClinicalImpressionEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ClinicalImpressionEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ClinicalImpressionEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ClinicalImpressionEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.clinical_synopsis.v1");
  }

  public static ClinicalImpressionEvaluationContainment getInstance() {
    return new ClinicalImpressionEvaluationContainment();
  }
}
