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

public class EstimatedDateOfDeliveryEvaluationContainment extends Containment {
  public SelectAqlField<EstimatedDateOfDeliveryEvaluation> ESTIMATED_DATE_OF_DELIVERY_EVALUATION = new AqlFieldImp<EstimatedDateOfDeliveryEvaluation>(EstimatedDateOfDeliveryEvaluation.class, "", "EstimatedDateOfDeliveryEvaluation", EstimatedDateOfDeliveryEvaluation.class, this);

  public SelectAqlField<TemporalAccessor> BY_DATE_OF_CONCEPTION_VALUE = new AqlFieldImp<TemporalAccessor>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0003]/value|value", "byDateOfConceptionValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> BY_DATE_OF_CONCEPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0003]/null_flavour|defining_code", "byDateOfConceptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> BY_CYCLE_VALUE = new AqlFieldImp<TemporalAccessor>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0004]/value|value", "byCycleValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> BY_CYCLE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0004]/null_flavour|defining_code", "byCycleNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> ESTIMATED_DATE_BY_ULTRASOUND_VALUE = new AqlFieldImp<TemporalAccessor>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0006]/items[at0008]/value|value", "estimatedDateByUltrasoundValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> ESTIMATED_DATE_BY_ULTRASOUND_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0006]/items[at0008]/null_flavour|defining_code", "estimatedDateByUltrasoundNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<EstimatedDateOfDeliveryAgreedEddCluster> AGREED_EDD = new ListAqlFieldImp<EstimatedDateOfDeliveryAgreedEddCluster>(EstimatedDateOfDeliveryEvaluation.class, "/data[at0002]/items[at0009]", "agreedEdd", EstimatedDateOfDeliveryAgreedEddCluster.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(EstimatedDateOfDeliveryEvaluation.class, "/protocol[at0001]/items[at0013]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(EstimatedDateOfDeliveryEvaluation.class, "/protocol[at0001]/items[at0013]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(EstimatedDateOfDeliveryEvaluation.class, "/protocol[at0001]/items[at0012]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(EstimatedDateOfDeliveryEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(EstimatedDateOfDeliveryEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(EstimatedDateOfDeliveryEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private EstimatedDateOfDeliveryEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.estimated_date_delivery.v0");
  }

  public static EstimatedDateOfDeliveryEvaluationContainment getInstance() {
    return new EstimatedDateOfDeliveryEvaluationContainment();
  }
}
