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

public class ImagingExaminationResultObservationContainment extends Containment {
  public SelectAqlField<ImagingExaminationResultObservation> IMAGING_EXAMINATION_RESULT_OBSERVATION = new AqlFieldImp<ImagingExaminationResultObservation>(ImagingExaminationResultObservation.class, "", "ImagingExaminationResultObservation", ImagingExaminationResultObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ImagingExaminationResultObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<String> TECHNIQUE_VALUE = new AqlFieldImp<String>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0049]/value|value", "techniqueValue", String.class, this);

  public SelectAqlField<NullFlavour> TECHNIQUE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0049]/null_flavour|defining_code", "techniqueNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_TECHNIQUE = new ListAqlFieldImp<Cluster>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0041]", "structuredTechnique", Cluster.class, this);

  public SelectAqlField<String> IMAGING_QUALITY_VALUE = new AqlFieldImp<String>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0057]/value|value", "imagingQualityValue", String.class, this);

  public SelectAqlField<NullFlavour> IMAGING_QUALITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0057]/null_flavour|defining_code", "imagingQualityNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> RECEIVING_IMAGING_SERVICE = new ListAqlFieldImp<Cluster>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0026]", "receivingImagingService", Cluster.class, this);

  public ListSelectAqlField<ImagingExaminationResultExaminationRequestDetailsCluster> EXAMINATION_REQUEST_DETAILS = new ListAqlFieldImp<ImagingExaminationResultExaminationRequestDetailsCluster>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0027]", "examinationRequestDetails", ImagingExaminationResultExaminationRequestDetailsCluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ImagingExaminationResultObservation.class, "/protocol[at0025]/items[at0046]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ImagingExaminationResultObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ImagingExaminationResultObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ImagingExaminationResultObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<ImagingExaminationResultAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<ImagingExaminationResultAnyEventChoice>(ImagingExaminationResultObservation.class, "/data[at0001]/events[at0002]", "anyEvent", ImagingExaminationResultAnyEventChoice.class, this);

  private ImagingExaminationResultObservationContainment() {
    super("openEHR-EHR-OBSERVATION.imaging_exam_result.v0");
  }

  public static ImagingExaminationResultObservationContainment getInstance() {
    return new ImagingExaminationResultObservationContainment();
  }
}
