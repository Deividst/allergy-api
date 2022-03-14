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

public class ExclusionGlobalEvaluationContainment extends Containment {
  public SelectAqlField<ExclusionGlobalEvaluation> EXCLUSION_GLOBAL_EVALUATION = new AqlFieldImp<ExclusionGlobalEvaluation>(ExclusionGlobalEvaluation.class, "", "ExclusionGlobalEvaluation", ExclusionGlobalEvaluation.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_MEDICATION_USE_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfMedicationUseValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_MEDICATION_USE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfMedicationUseNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ExclusionGlobalEvaluation.class, "/protocol[at0008]/items[at0010]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ExclusionGlobalEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ExclusionGlobalEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExclusionGlobalEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ExclusionGlobalEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.exclusion_global.v1");
  }

  public static ExclusionGlobalEvaluationContainment getInstance() {
    return new ExclusionGlobalEvaluationContainment();
  }
}
