package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ImagingFindingClusterContainment extends Containment {
  public SelectAqlField<ImagingFindingCluster> IMAGING_FINDING_CLUSTER = new AqlFieldImp<ImagingFindingCluster>(ImagingFindingCluster.class, "", "ImagingFindingCluster", ImagingFindingCluster.class, this);

  public SelectAqlField<String> FINDING_NAME_VALUE = new AqlFieldImp<String>(ImagingFindingCluster.class, "/items[at0024]/value|value", "findingNameValue", String.class, this);

  public SelectAqlField<NullFlavour> FINDING_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImagingFindingCluster.class, "/items[at0024]/null_flavour|defining_code", "findingNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> ANATOMICAL_LOCATION_VALUE = new AqlFieldImp<String>(ImagingFindingCluster.class, "/items[at0033]/value|value", "anatomicalLocationValue", String.class, this);

  public SelectAqlField<NullFlavour> ANATOMICAL_LOCATION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImagingFindingCluster.class, "/items[at0033]/null_flavour|defining_code", "anatomicalLocationNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_ANATOMICAL_LOCATION = new ListAqlFieldImp<Cluster>(ImagingFindingCluster.class, "/items[at0034]", "structuredAnatomicalLocation", Cluster.class, this);

  public ListSelectAqlField<ImagingFindingPresenceElement> PRESENCE = new ListAqlFieldImp<ImagingFindingPresenceElement>(ImagingFindingCluster.class, "/items[at0001]", "presence", ImagingFindingPresenceElement.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(ImagingFindingCluster.class, "/items[at0028]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImagingFindingCluster.class, "/items[at0028]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_DETAIL = new ListAqlFieldImp<Cluster>(ImagingFindingCluster.class, "/items[at0014]", "structuredDetail", Cluster.class, this);

  public SelectAqlField<NullFlavour> COMPARISON_TO_PREVIOUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ImagingFindingCluster.class, "/items[at0029]/null_flavour|defining_code", "comparisonToPreviousNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ImagingFindingCommentElement> COMMENT = new ListAqlFieldImp<ImagingFindingCommentElement>(ImagingFindingCluster.class, "/items[at0003]", "comment", ImagingFindingCommentElement.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ImagingFindingCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ImagingFindingComparisonToPreviousChoice> COMPARISON_TO_PREVIOUS = new AqlFieldImp<ImagingFindingComparisonToPreviousChoice>(ImagingFindingCluster.class, "/items[at0029]/value", "comparisonToPrevious", ImagingFindingComparisonToPreviousChoice.class, this);

  private ImagingFindingClusterContainment() {
    super("openEHR-EHR-CLUSTER.imaging_finding.v0");
  }

  public static ImagingFindingClusterContainment getInstance() {
    return new ImagingFindingClusterContainment();
  }
}
