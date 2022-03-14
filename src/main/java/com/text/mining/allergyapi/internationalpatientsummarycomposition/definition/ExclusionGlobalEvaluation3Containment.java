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

public class ExclusionGlobalEvaluation3Containment extends Containment {
  public SelectAqlField<ExclusionGlobalEvaluation3> EXCLUSION_GLOBAL_EVALUATION3 = new AqlFieldImp<ExclusionGlobalEvaluation3>(ExclusionGlobalEvaluation3.class, "", "ExclusionGlobalEvaluation3", ExclusionGlobalEvaluation3.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_PROBLEMS_DIAGNOSES_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation3.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfProblemsDiagnosesValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_PROBLEMS_DIAGNOSES_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation3.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ExclusionGlobalEvaluation3.class, "/protocol[at0008]/items[at0010]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ExclusionGlobalEvaluation3.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ExclusionGlobalEvaluation3.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExclusionGlobalEvaluation3.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ExclusionGlobalEvaluation3Containment() {
    super("openEHR-EHR-EVALUATION.exclusion_global.v1");
  }

  public static ExclusionGlobalEvaluation3Containment getInstance() {
    return new ExclusionGlobalEvaluation3Containment();
  }
}
