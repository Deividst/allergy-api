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

public class ServiceRequestInstructionContainment extends Containment {
  public SelectAqlField<ServiceRequestInstruction> SERVICE_REQUEST_INSTRUCTION = new AqlFieldImp<ServiceRequestInstruction>(ServiceRequestInstruction.class, "", "ServiceRequestInstruction", ServiceRequestInstruction.class, this);

  public ListSelectAqlField<ServiceRequestCurrentActivityActivity> CURRENT_ACTIVITY = new ListAqlFieldImp<ServiceRequestCurrentActivityActivity>(ServiceRequestInstruction.class, "/activities[at0001]", "currentActivity", ServiceRequestCurrentActivityActivity.class, this);

  public SelectAqlField<NullFlavour> REQUESTER_ORDER_IDENTIFIER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0010]/null_flavour|defining_code", "requesterOrderIdentifierNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> REQUESTER = new AqlFieldImp<Cluster>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0141]", "requester", Cluster.class, this);

  public SelectAqlField<NullFlavour> RECEIVER_ORDER_IDENTIFIER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0011]/null_flavour|defining_code", "receiverOrderIdentifierNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> RECEIVER = new AqlFieldImp<Cluster>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0142]", "receiver", Cluster.class, this);

  public SelectAqlField<String> REQUEST_STATUS_VALUE = new AqlFieldImp<String>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0127]/value|value", "requestStatusValue", String.class, this);

  public SelectAqlField<NullFlavour> REQUEST_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0127]/null_flavour|defining_code", "requestStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> DISTRIBUTION_LIST = new ListAqlFieldImp<Cluster>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0128]", "distributionList", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0112]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ServiceRequestInstruction.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<String> NARRATIVE_VALUE = new AqlFieldImp<String>(ServiceRequestInstruction.class, "/narrative|value", "narrativeValue", String.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ServiceRequestInstruction.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ServiceRequestInstruction.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<TemporalAccessor> EXPIRY_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(ServiceRequestInstruction.class, "/expiry_time|value", "expiryTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<ServiceRequestReceiverOrderIdentifierChoice> RECEIVER_ORDER_IDENTIFIER = new AqlFieldImp<ServiceRequestReceiverOrderIdentifierChoice>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0011]/value", "receiverOrderIdentifier", ServiceRequestReceiverOrderIdentifierChoice.class, this);

  public SelectAqlField<ServiceRequestRequesterOrderIdentifierChoice> REQUESTER_ORDER_IDENTIFIER = new AqlFieldImp<ServiceRequestRequesterOrderIdentifierChoice>(ServiceRequestInstruction.class, "/protocol[at0008]/items[at0010]/value", "requesterOrderIdentifier", ServiceRequestRequesterOrderIdentifierChoice.class, this);

  private ServiceRequestInstructionContainment() {
    super("openEHR-EHR-INSTRUCTION.service_request.v1");
  }

  public static ServiceRequestInstructionContainment getInstance() {
    return new ServiceRequestInstructionContainment();
  }
}
