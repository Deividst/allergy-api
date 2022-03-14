package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-INSTRUCTION.service_request.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.247249-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ServiceRequestInstruction implements EntryEntity {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity
   * Description: Current Activity.
   */
  @Path("/activities[at0001]")
  private List<ServiceRequestCurrentActivityActivity> currentActivity;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Tree/Requester order identifier/null_flavour
   */
  @Path("/protocol[at0008]/items[at0010]/null_flavour|defining_code")
  private NullFlavour requesterOrderIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Requester
   * Description: Details about the clinician or organisation requesting the service.
   */
  @Path("/protocol[at0008]/items[at0141]")
  private Cluster requester;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Tree/Receiver order identifier/null_flavour
   */
  @Path("/protocol[at0008]/items[at0011]/null_flavour|defining_code")
  private NullFlavour receiverOrderIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Receiver
   * Description: Details about the clinician or organisation receiving the request for service.
   */
  @Path("/protocol[at0008]/items[at0142]")
  private Cluster receiver;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Request status
   * Description: The status of the request for service as indicated by the requester.
   * Comment: Status is used to denote whether this is the initial request, or a follow-up request to change or provide supplementary information. Coding with a terminology is preferred, where possible.
   */
  @Path("/protocol[at0008]/items[at0127]/value|value")
  private String requestStatusValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Tree/Request status/null_flavour
   */
  @Path("/protocol[at0008]/items[at0127]/null_flavour|defining_code")
  private NullFlavour requestStatusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Distribution list
   * Description: Details of additional clinicians, organisations or agencies who require copies of any communication.
   */
  @Path("/protocol[at0008]/items[at0128]")
  private List<Cluster> distributionList;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0008]/items[at0112]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/narrative
   */
  @Path("/narrative|value")
  private String narrativeValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/expiry_time
   */
  @Path("/expiry_time|value")
  private TemporalAccessor expiryTimeValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Receiver order identifier
   * Description: The local identifier assigned to the request by the clinician or organisation receiving the request for service.
   */
  @Path("/protocol[at0008]/items[at0011]/value")
  @Choice
  private ServiceRequestReceiverOrderIdentifierChoice receiverOrderIdentifier;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Requester order identifier
   * Description: The local identifier assigned by the requesting clinical system.
   */
  @Path("/protocol[at0008]/items[at0010]/value")
  @Choice
  private ServiceRequestRequesterOrderIdentifierChoice requesterOrderIdentifier;

  public void setCurrentActivity(List<ServiceRequestCurrentActivityActivity> currentActivity) {
     this.currentActivity = currentActivity;
  }

  public List<ServiceRequestCurrentActivityActivity> getCurrentActivity() {
     return this.currentActivity ;
  }

  public void setRequesterOrderIdentifierNullFlavourDefiningCode(
      NullFlavour requesterOrderIdentifierNullFlavourDefiningCode) {
     this.requesterOrderIdentifierNullFlavourDefiningCode = requesterOrderIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getRequesterOrderIdentifierNullFlavourDefiningCode() {
     return this.requesterOrderIdentifierNullFlavourDefiningCode ;
  }

  public void setRequester(Cluster requester) {
     this.requester = requester;
  }

  public Cluster getRequester() {
     return this.requester ;
  }

  public void setReceiverOrderIdentifierNullFlavourDefiningCode(
      NullFlavour receiverOrderIdentifierNullFlavourDefiningCode) {
     this.receiverOrderIdentifierNullFlavourDefiningCode = receiverOrderIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getReceiverOrderIdentifierNullFlavourDefiningCode() {
     return this.receiverOrderIdentifierNullFlavourDefiningCode ;
  }

  public void setReceiver(Cluster receiver) {
     this.receiver = receiver;
  }

  public Cluster getReceiver() {
     return this.receiver ;
  }

  public void setRequestStatusValue(String requestStatusValue) {
     this.requestStatusValue = requestStatusValue;
  }

  public String getRequestStatusValue() {
     return this.requestStatusValue ;
  }

  public void setRequestStatusNullFlavourDefiningCode(
      NullFlavour requestStatusNullFlavourDefiningCode) {
     this.requestStatusNullFlavourDefiningCode = requestStatusNullFlavourDefiningCode;
  }

  public NullFlavour getRequestStatusNullFlavourDefiningCode() {
     return this.requestStatusNullFlavourDefiningCode ;
  }

  public void setDistributionList(List<Cluster> distributionList) {
     this.distributionList = distributionList;
  }

  public List<Cluster> getDistributionList() {
     return this.distributionList ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setNarrativeValue(String narrativeValue) {
     this.narrativeValue = narrativeValue;
  }

  public String getNarrativeValue() {
     return this.narrativeValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setExpiryTimeValue(TemporalAccessor expiryTimeValue) {
     this.expiryTimeValue = expiryTimeValue;
  }

  public TemporalAccessor getExpiryTimeValue() {
     return this.expiryTimeValue ;
  }

  public void setReceiverOrderIdentifier(
      ServiceRequestReceiverOrderIdentifierChoice receiverOrderIdentifier) {
     this.receiverOrderIdentifier = receiverOrderIdentifier;
  }

  public ServiceRequestReceiverOrderIdentifierChoice getReceiverOrderIdentifier() {
     return this.receiverOrderIdentifier ;
  }

  public void setRequesterOrderIdentifier(
      ServiceRequestRequesterOrderIdentifierChoice requesterOrderIdentifier) {
     this.requesterOrderIdentifier = requesterOrderIdentifier;
  }

  public ServiceRequestRequesterOrderIdentifierChoice getRequesterOrderIdentifier() {
     return this.requesterOrderIdentifier ;
  }
}
