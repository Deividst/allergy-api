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

public class DeviceUseStatementEvaluationContainment extends Containment {
  public SelectAqlField<DeviceUseStatementEvaluation> DEVICE_USE_STATEMENT_EVALUATION = new AqlFieldImp<DeviceUseStatementEvaluation>(DeviceUseStatementEvaluation.class, "", "DeviceUseStatementEvaluation", DeviceUseStatementEvaluation.class, this);

  public ListSelectAqlField<DeviceUseStatementDeviceDetailsCluster> DEVICE_DETAILS = new ListAqlFieldImp<DeviceUseStatementDeviceDetailsCluster>(DeviceUseStatementEvaluation.class, "/data[at0001]/items[at0022]", "deviceDetails", DeviceUseStatementDeviceDetailsCluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(DeviceUseStatementEvaluation.class, "/protocol[at0016]/items[at0018]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DeviceUseStatementEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DeviceUseStatementEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DeviceUseStatementEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private DeviceUseStatementEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.device_summary.v0");
  }

  public static DeviceUseStatementEvaluationContainment getInstance() {
    return new DeviceUseStatementEvaluationContainment();
  }
}
