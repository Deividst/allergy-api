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

public class AllergyIntoleranceEvaluationContainment extends Containment {
  public SelectAqlField<AllergyIntoleranceEvaluation> ALLERGY_INTOLERANCE_EVALUATION = new AqlFieldImp<AllergyIntoleranceEvaluation>(AllergyIntoleranceEvaluation.class, "", "AllergyIntoleranceEvaluation", AllergyIntoleranceEvaluation.class, this);

  public SelectAqlField<String> SUBSTANCE_VALUE = new AqlFieldImp<String>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0002]/value|value", "substanceValue", String.class, this);

  public SelectAqlField<NullFlavour> SUBSTANCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "substanceNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> VERIFICATION_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0063]/null_flavour|defining_code", "verificationStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<CriticalityDefiningCode> CRITICALITY_DEFINING_CODE = new AqlFieldImp<CriticalityDefiningCode>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0101]/value|defining_code", "criticalityDefiningCode", CriticalityDefiningCode.class, this);

  public SelectAqlField<NullFlavour> CRITICALITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0101]/null_flavour|defining_code", "criticalityNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> TYPE_VALUE = new AqlFieldImp<String>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0058]/value|value", "typeValue", String.class, this);

  public SelectAqlField<NullFlavour> TYPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0058]/null_flavour|defining_code", "typeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0006]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0006]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<AllergyIntoleranceReactionCluster> REACTION = new ListAqlFieldImp<AllergyIntoleranceReactionCluster>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0009]", "reaction", AllergyIntoleranceReactionCluster.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(AllergyIntoleranceEvaluation.class, "/protocol[at0042]/items[at0062]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AllergyIntoleranceEvaluation.class, "/protocol[at0042]/items[at0062]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(AllergyIntoleranceEvaluation.class, "/protocol[at0042]/items[at0128]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AllergyIntoleranceEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AllergyIntoleranceEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AllergyIntoleranceEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<AllergyIntoleranceVerificationStatusChoice> VERIFICATION_STATUS = new AqlFieldImp<AllergyIntoleranceVerificationStatusChoice>(AllergyIntoleranceEvaluation.class, "/data[at0001]/items[at0063]/value", "verificationStatus", AllergyIntoleranceVerificationStatusChoice.class, this);

  private AllergyIntoleranceEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.adverse_reaction_risk.v1");
  }

  public static AllergyIntoleranceEvaluationContainment getInstance() {
    return new AllergyIntoleranceEvaluationContainment();
  }
}
