package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class LaboratoryAnalyteResultClusterContainment extends Containment {
  public SelectAqlField<LaboratoryAnalyteResultCluster> LABORATORY_ANALYTE_RESULT_CLUSTER = new AqlFieldImp<LaboratoryAnalyteResultCluster>(LaboratoryAnalyteResultCluster.class, "", "LaboratoryAnalyteResultCluster", LaboratoryAnalyteResultCluster.class, this);

  public SelectAqlField<String> ANALYTE_NAME_VALUE = new AqlFieldImp<String>(LaboratoryAnalyteResultCluster.class, "/items[at0024]/value|value", "analyteNameValue", String.class, this);

  public SelectAqlField<NullFlavour> ANALYTE_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LaboratoryAnalyteResultCluster.class, "/items[at0024]/null_flavour|defining_code", "analyteNameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<LaboratoryAnalyteResultAnalyteResultElement> ANALYTE_RESULT = new ListAqlFieldImp<LaboratoryAnalyteResultAnalyteResultElement>(LaboratoryAnalyteResultCluster.class, "/items[at0001]", "analyteResult", LaboratoryAnalyteResultAnalyteResultElement.class, this);

  public ListSelectAqlField<Cluster> ANALYTE_RESULT_DETAIL = new ListAqlFieldImp<Cluster>(LaboratoryAnalyteResultCluster.class, "/items[at0014]", "analyteResultDetail", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(LaboratoryAnalyteResultCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private LaboratoryAnalyteResultClusterContainment() {
    super("openEHR-EHR-CLUSTER.laboratory_test_analyte.v1");
  }

  public static LaboratoryAnalyteResultClusterContainment getInstance() {
    return new LaboratoryAnalyteResultClusterContainment();
  }
}
