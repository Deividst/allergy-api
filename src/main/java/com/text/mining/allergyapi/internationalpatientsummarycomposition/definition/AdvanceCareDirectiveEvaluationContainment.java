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

public class AdvanceCareDirectiveEvaluationContainment extends Containment {
  public SelectAqlField<AdvanceCareDirectiveEvaluation> ADVANCE_CARE_DIRECTIVE_EVALUATION = new AqlFieldImp<AdvanceCareDirectiveEvaluation>(AdvanceCareDirectiveEvaluation.class, "", "AdvanceCareDirectiveEvaluation", AdvanceCareDirectiveEvaluation.class, this);

  public SelectAqlField<String> TYPE_OF_DIRECTIVE_VALUE = new AqlFieldImp<String>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0005]/value|value", "typeOfDirectiveValue", String.class, this);

  public SelectAqlField<NullFlavour> TYPE_OF_DIRECTIVE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0005]/null_flavour|defining_code", "typeOfDirectiveNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0004]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0006]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0006]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<AdvanceCareDirectiveConditionElement> CONDITION = new ListAqlFieldImp<AdvanceCareDirectiveConditionElement>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0007]", "condition", AdvanceCareDirectiveConditionElement.class, this);

  public ListSelectAqlField<Cluster> DIRECTIVE_DETAIL = new ListAqlFieldImp<Cluster>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0052]", "directiveDetail", Cluster.class, this);

  public ListSelectAqlField<AdvanceCareDirectiveDirectiveLocationCluster> DIRECTIVE_LOCATION = new ListAqlFieldImp<AdvanceCareDirectiveDirectiveLocationCluster>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0058]", "directiveLocation", AdvanceCareDirectiveDirectiveLocationCluster.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0038]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0038]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> VALID_PERIOD_START_VALUE = new AqlFieldImp<TemporalAccessor>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0053]/value|value", "validPeriodStartValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> VALID_PERIOD_START_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0053]/null_flavour|defining_code", "validPeriodStartNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> VALID_PERIOD_END_VALUE = new AqlFieldImp<TemporalAccessor>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0054]/value|value", "validPeriodEndValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> VALID_PERIOD_END_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0054]/null_flavour|defining_code", "validPeriodEndNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> REVIEW_DUE_DATE_VALUE = new AqlFieldImp<TemporalAccessor>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0056]/value|value", "reviewDueDateValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> REVIEW_DUE_DATE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0056]/null_flavour|defining_code", "reviewDueDateNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0055]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0055]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> WITNESS = new ListAqlFieldImp<Cluster>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0025]", "witness", Cluster.class, this);

  public ListSelectAqlField<AdvanceCareDirectiveMandateElement> MANDATE = new ListAqlFieldImp<AdvanceCareDirectiveMandateElement>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0027]", "mandate", AdvanceCareDirectiveMandateElement.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(AdvanceCareDirectiveEvaluation.class, "/protocol[at0010]/items[at0061]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AdvanceCareDirectiveEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AdvanceCareDirectiveEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AdvanceCareDirectiveEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<AdvanceCareDirectiveStatusChoice> STATUS = new AqlFieldImp<AdvanceCareDirectiveStatusChoice>(AdvanceCareDirectiveEvaluation.class, "/data[at0001]/items[at0004]/value", "status", AdvanceCareDirectiveStatusChoice.class, this);

  private AdvanceCareDirectiveEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.advance_care_directive.v1");
  }

  public static AdvanceCareDirectiveEvaluationContainment getInstance() {
    return new AdvanceCareDirectiveEvaluationContainment();
  }
}
