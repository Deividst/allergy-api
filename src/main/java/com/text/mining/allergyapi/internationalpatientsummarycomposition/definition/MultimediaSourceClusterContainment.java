package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class MultimediaSourceClusterContainment extends Containment {
  public SelectAqlField<MultimediaSourceCluster> MULTIMEDIA_SOURCE_CLUSTER = new AqlFieldImp<MultimediaSourceCluster>(MultimediaSourceCluster.class, "", "MultimediaSourceCluster", MultimediaSourceCluster.class, this);

  public SelectAqlField<String> RESOURCE_NAME_VALUE = new AqlFieldImp<String>(MultimediaSourceCluster.class, "/items[at0002]/value|value", "resourceNameValue", String.class, this);

  public SelectAqlField<NullFlavour> RESOURCE_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MultimediaSourceCluster.class, "/items[at0002]/null_flavour|defining_code", "resourceNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> CONTENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MultimediaSourceCluster.class, "/items[at0001]/null_flavour|defining_code", "contentNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> CREATOR = new ListAqlFieldImp<Cluster>(MultimediaSourceCluster.class, "/items[at0012]", "creator", Cluster.class, this);

  public ListSelectAqlField<Cluster> SOURCE_DEVICE = new ListAqlFieldImp<Cluster>(MultimediaSourceCluster.class, "/items[at0011]", "sourceDevice", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(MultimediaSourceCluster.class, "/items[at0013]", "additionalDetails", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(MultimediaSourceCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<MultimediaSourceContentChoice> CONTENT = new AqlFieldImp<MultimediaSourceContentChoice>(MultimediaSourceCluster.class, "/items[at0001]/value", "content", MultimediaSourceContentChoice.class, this);

  private MultimediaSourceClusterContainment() {
    super("openEHR-EHR-CLUSTER.multimedia_source.v0");
  }

  public static MultimediaSourceClusterContainment getInstance() {
    return new MultimediaSourceClusterContainment();
  }
}
