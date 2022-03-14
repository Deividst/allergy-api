package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class SpecimenClusterContainment extends Containment {
  public SelectAqlField<SpecimenCluster> SPECIMEN_CLUSTER = new AqlFieldImp<SpecimenCluster>(SpecimenCluster.class, "", "SpecimenCluster", SpecimenCluster.class, this);

  public SelectAqlField<String> SPECIMEN_TYPE_VALUE = new AqlFieldImp<String>(SpecimenCluster.class, "/items[at0029]/value|value", "specimenTypeValue", String.class, this);

  public SelectAqlField<NullFlavour> SPECIMEN_TYPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(SpecimenCluster.class, "/items[at0029]/null_flavour|defining_code", "specimenTypeNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> PHYSICAL_PROPERTIES = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0027]", "physicalProperties", Cluster.class, this);

  public SelectAqlField<String> METHOD_VALUE = new AqlFieldImp<String>(SpecimenCluster.class, "/items[at0007]/value|value", "methodValue", String.class, this);

  public SelectAqlField<NullFlavour> METHOD_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(SpecimenCluster.class, "/items[at0007]/null_flavour|defining_code", "methodNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> BODY_SITE_VALUE = new AqlFieldImp<String>(SpecimenCluster.class, "/items[at0087]/value|value", "bodySiteValue", String.class, this);

  public SelectAqlField<NullFlavour> BODY_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(SpecimenCluster.class, "/items[at0087]/null_flavour|defining_code", "bodySiteNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_SOURCE_SITE = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0013]", "structuredSourceSite", Cluster.class, this);

  public ListSelectAqlField<Cluster> SPECIMEN_COLLECTOR_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0071]", "specimenCollectorDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_COLLECTION_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0083]", "additionalCollectionDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> CONTAINER_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0085]", "containerDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> PROCESSING_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0068]", "processingDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> TRANSPORT_DETAILS = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0093]", "transportDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> DIGITAL_REPRESENTATION = new ListAqlFieldImp<Cluster>(SpecimenCluster.class, "/items[at0096]", "digitalRepresentation", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SpecimenCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private SpecimenClusterContainment() {
    super("openEHR-EHR-CLUSTER.specimen.v1");
  }

  public static SpecimenClusterContainment getInstance() {
    return new SpecimenClusterContainment();
  }
}
