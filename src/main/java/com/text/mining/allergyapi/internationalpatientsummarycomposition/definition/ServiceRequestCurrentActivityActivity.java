package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.encapsulated.DvParsable;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.253885-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ServiceRequestCurrentActivityActivity implements LocatableEntity {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service name
   * Description: The name of the single service or activity requested.
   * Comment: Coding of the 'Service name' with a coding system is desirable, if available. For example: 'referral' to an endocrinologist for diabetes management.
   */
  @Path("/description[at0009]/items[at0121]/value|value")
  private String serviceNameValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Service name/null_flavour
   */
  @Path("/description[at0009]/items[at0121]/null_flavour|defining_code")
  private NullFlavour serviceNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service type
   * Description: Category of service requested.
   * Comment: Coding of the 'Service type' with a coding system is desirable, if available. If the 'Service name' was coded, it is possible for this data point to be derived from the code. For example: biochemistry or microbiology laboratory, ultrasound or CT imaging.
   */
  @Path("/description[at0009]/items[at0148]/value|value")
  private String serviceTypeValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Service type/null_flavour
   */
  @Path("/description[at0009]/items[at0148]/null_flavour|defining_code")
  private NullFlavour serviceTypeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Description
   * Description: Narrative description about the service requested.
   * Comment: This data point should be used to describe the named service in more detail, including how it should be delivered, patient concerns and issues that might be encountered in delivering the service.
   */
  @Path("/description[at0009]/items[at0135]/value|value")
  private String descriptionValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Description/null_flavour
   */
  @Path("/description[at0009]/items[at0135]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Reason for request
   * Description: A short phrase describing the reason for the request.
   * Comment: Coding of the 'Reason for request' with a coding system is desirable, if available. This data element allows multiple occurrences to enable the user to record a multiple responses, if required. For example: 'manage diabetes complications'.
   */
  @Path("/description[at0009]/items[at0062]")
  private List<ServiceRequestReasonForRequestElement> reasonForRequest;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Reason description
   * Description: Narrative description about the reason for request.
   * Comment: For example: 'The patient's diabetes has recently become more difficult to stabilise and renal function is deteriorating'.
   */
  @Path("/description[at0009]/items[at0064]/value|value")
  private String reasonDescriptionValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Reason description/null_flavour
   */
  @Path("/description[at0009]/items[at0064]/null_flavour|defining_code")
  private NullFlavour reasonDescriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Clinical indication
   * Description: The clinical reason for the ordered service.
   * Comment: Coding of the clinical indication with a terminology is preferred, where possible. This data element allows multiple occurrences. For example: 'Angina' or 'Type 1 Diabetes mellitus'.
   */
  @Path("/description[at0009]/items[at0152]")
  private List<ServiceRequestClinicalIndicationElement> clinicalIndication;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Intent
   * Description: Description of the intent for the request.
   * Comment: For example: a referral to a specialist may have the intent of the specialist taking over responsibility for care of the patient, or it may be to provide a second opinion on treatment options. Coding of the 'Intent' with a coding system is desirable, if available. This data element allows multiple occurrences to enable the user to record a multiple responses, if required.
   */
  @Path("/description[at0009]/items[at0065]")
  private List<ServiceRequestIntentElement> intent;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Urgency/null_flavour
   */
  @Path("/description[at0009]/items[at0068]/null_flavour|defining_code")
  private NullFlavour urgencyNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service due/upper
   */
  @Path("/description[at0009]/items[at0040]/value/upper|value")
  private TemporalAccessor upperValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service due/lower
   */
  @Path("/description[at0009]/items[at0040]/value/lower|value")
  private TemporalAccessor lowerValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service due/lower_included
   */
  @Path("/description[at0009]/items[at0040]/value/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service due/upper_included
   */
  @Path("/description[at0009]/items[at0040]/value/upper_included")
  private Boolean upperIncluded;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Service due/null_flavour
   */
  @Path("/description[at0009]/items[at0040]/null_flavour|defining_code")
  private NullFlavour serviceDueNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Complex timing
   * Description: Details about a complex service request requiring a sequence of timings.
   * Comment: For example: 'hourly vital signs observations for 4 hours, then 4 hourly for 20 hours' or 'every third Wednesday for 3 visits' or .
   */
  @Path("/description[at0009]/items[at0151]")
  private List<Cluster> complexTiming;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service period start
   * Description: The date/time that marks the beginning of the valid period of time for delivery of this service.
   * Comment: This date/time is the equivalent to the earliest possible date for service delivery. For example: sometimes a certain amount of time must pass before a service can be performed, for example some procedures can only be performed once the patient has stopped taking medications for a specific amount of time.
   */
  @Path("/description[at0009]/items[at0145]/value|value")
  private TemporalAccessor servicePeriodStartValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Service period start/null_flavour
   */
  @Path("/description[at0009]/items[at0145]/null_flavour|defining_code")
  private NullFlavour servicePeriodStartNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service period expiry
   * Description: The date/time that marks the conclusion of the clinically valid period of time for delivery of this service.
   * Comment: This date/time is the equivalent to the latest possible date for service delivery or to the date of expiry for this request. For example: a service may be required to be completed before another event, such as scheduled surgery.
   */
  @Path("/description[at0009]/items[at0144]/value|value")
  private TemporalAccessor servicePeriodExpiryValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Service period expiry/null_flavour
   */
  @Path("/description[at0009]/items[at0144]/null_flavour|defining_code")
  private NullFlavour servicePeriodExpiryNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Indefinite?
   * Description: The valid period for this request is open ended and has no date of expiry.
   * Comment: Record as TRUE to record explicity that the request has no expiry date. For example: commonly required for a referral to a specialist for long-term or lifelong care.
   */
  @Path("/description[at0009]/items[at0147]/value|value")
  private Boolean indefiniteValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Indefinite?/null_flavour
   */
  @Path("/description[at0009]/items[at0147]/null_flavour|defining_code")
  private NullFlavour indefiniteNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Specific details
   * Description: Additional detail about the service requested.
   * Comment: For example: Specimen details for a laboratory test request, or anatomical location for a procedure request.
   */
  @Path("/description[at0009]/items[at0132]")
  private List<Cluster> specificDetails;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Supporting information
   * Description: Digital document, image, video or diagram supplied as additional information to support or inform the request.
   */
  @Path("/description[at0009]/items[at0149]")
  private List<Cluster> supportingInformation;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Supplementary information
   * Description: Supplementary information will be following request.
   * Comment: Record as TRUE if additional information has been identified and will be forwarded when available. For example: pending test results.
   */
  @Path("/description[at0009]/items[at0076]/value|value")
  private Boolean supplementaryInformationValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Supplementary information/null_flavour
   */
  @Path("/description[at0009]/items[at0076]/null_flavour|defining_code")
  private NullFlavour supplementaryInformationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Information description
   * Description: Description of the supplementary information.
   */
  @Path("/description[at0009]/items[at0078]/value|value")
  private String informationDescriptionValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Information description/null_flavour
   */
  @Path("/description[at0009]/items[at0078]/null_flavour|defining_code")
  private NullFlavour informationDescriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Patient requirements
   * Description: Language, transport or other personal requirements to support the patient's attendance or participation in provision of the service.
   */
  @Path("/description[at0009]/items[at0116]")
  private List<Cluster> patientRequirements;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Comment
   * Description: Additional narrative about the service request not captured in other fields.
   */
  @Path("/description[at0009]/items[at0150]/value|value")
  private String commentValue;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Comment/null_flavour
   */
  @Path("/description[at0009]/items[at0150]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/timing
   */
  @Path("/timing")
  private DvParsable timing;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Urgency
   * Description: Urgency of the request for service.
   */
  @Path("/description[at0009]/items[at0068]/value")
  @Choice
  private ServiceRequestUrgencyChoice urgency;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Service due
   * Description: The date/time, or acceptable interval of date/time, for provision of the service.
   */
  @Path("/description[at0009]/items[at0040]/value")
  @Choice
  private ServiceRequestServiceDueChoice serviceDue;

  public void setServiceNameValue(String serviceNameValue) {
     this.serviceNameValue = serviceNameValue;
  }

  public String getServiceNameValue() {
     return this.serviceNameValue ;
  }

  public void setServiceNameNullFlavourDefiningCode(
      NullFlavour serviceNameNullFlavourDefiningCode) {
     this.serviceNameNullFlavourDefiningCode = serviceNameNullFlavourDefiningCode;
  }

  public NullFlavour getServiceNameNullFlavourDefiningCode() {
     return this.serviceNameNullFlavourDefiningCode ;
  }

  public void setServiceTypeValue(String serviceTypeValue) {
     this.serviceTypeValue = serviceTypeValue;
  }

  public String getServiceTypeValue() {
     return this.serviceTypeValue ;
  }

  public void setServiceTypeNullFlavourDefiningCode(
      NullFlavour serviceTypeNullFlavourDefiningCode) {
     this.serviceTypeNullFlavourDefiningCode = serviceTypeNullFlavourDefiningCode;
  }

  public NullFlavour getServiceTypeNullFlavourDefiningCode() {
     return this.serviceTypeNullFlavourDefiningCode ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setReasonForRequest(List<ServiceRequestReasonForRequestElement> reasonForRequest) {
     this.reasonForRequest = reasonForRequest;
  }

  public List<ServiceRequestReasonForRequestElement> getReasonForRequest() {
     return this.reasonForRequest ;
  }

  public void setReasonDescriptionValue(String reasonDescriptionValue) {
     this.reasonDescriptionValue = reasonDescriptionValue;
  }

  public String getReasonDescriptionValue() {
     return this.reasonDescriptionValue ;
  }

  public void setReasonDescriptionNullFlavourDefiningCode(
      NullFlavour reasonDescriptionNullFlavourDefiningCode) {
     this.reasonDescriptionNullFlavourDefiningCode = reasonDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getReasonDescriptionNullFlavourDefiningCode() {
     return this.reasonDescriptionNullFlavourDefiningCode ;
  }

  public void setClinicalIndication(
      List<ServiceRequestClinicalIndicationElement> clinicalIndication) {
     this.clinicalIndication = clinicalIndication;
  }

  public List<ServiceRequestClinicalIndicationElement> getClinicalIndication() {
     return this.clinicalIndication ;
  }

  public void setIntent(List<ServiceRequestIntentElement> intent) {
     this.intent = intent;
  }

  public List<ServiceRequestIntentElement> getIntent() {
     return this.intent ;
  }

  public void setUrgencyNullFlavourDefiningCode(NullFlavour urgencyNullFlavourDefiningCode) {
     this.urgencyNullFlavourDefiningCode = urgencyNullFlavourDefiningCode;
  }

  public NullFlavour getUrgencyNullFlavourDefiningCode() {
     return this.urgencyNullFlavourDefiningCode ;
  }

  public void setUpperValue(TemporalAccessor upperValue) {
     this.upperValue = upperValue;
  }

  public TemporalAccessor getUpperValue() {
     return this.upperValue ;
  }

  public void setLowerValue(TemporalAccessor lowerValue) {
     this.lowerValue = lowerValue;
  }

  public TemporalAccessor getLowerValue() {
     return this.lowerValue ;
  }

  public void setLowerIncluded(Boolean lowerIncluded) {
     this.lowerIncluded = lowerIncluded;
  }

  public Boolean isLowerIncluded() {
     return this.lowerIncluded ;
  }

  public void setUpperIncluded(Boolean upperIncluded) {
     this.upperIncluded = upperIncluded;
  }

  public Boolean isUpperIncluded() {
     return this.upperIncluded ;
  }

  public void setServiceDueNullFlavourDefiningCode(NullFlavour serviceDueNullFlavourDefiningCode) {
     this.serviceDueNullFlavourDefiningCode = serviceDueNullFlavourDefiningCode;
  }

  public NullFlavour getServiceDueNullFlavourDefiningCode() {
     return this.serviceDueNullFlavourDefiningCode ;
  }

  public void setComplexTiming(List<Cluster> complexTiming) {
     this.complexTiming = complexTiming;
  }

  public List<Cluster> getComplexTiming() {
     return this.complexTiming ;
  }

  public void setServicePeriodStartValue(TemporalAccessor servicePeriodStartValue) {
     this.servicePeriodStartValue = servicePeriodStartValue;
  }

  public TemporalAccessor getServicePeriodStartValue() {
     return this.servicePeriodStartValue ;
  }

  public void setServicePeriodStartNullFlavourDefiningCode(
      NullFlavour servicePeriodStartNullFlavourDefiningCode) {
     this.servicePeriodStartNullFlavourDefiningCode = servicePeriodStartNullFlavourDefiningCode;
  }

  public NullFlavour getServicePeriodStartNullFlavourDefiningCode() {
     return this.servicePeriodStartNullFlavourDefiningCode ;
  }

  public void setServicePeriodExpiryValue(TemporalAccessor servicePeriodExpiryValue) {
     this.servicePeriodExpiryValue = servicePeriodExpiryValue;
  }

  public TemporalAccessor getServicePeriodExpiryValue() {
     return this.servicePeriodExpiryValue ;
  }

  public void setServicePeriodExpiryNullFlavourDefiningCode(
      NullFlavour servicePeriodExpiryNullFlavourDefiningCode) {
     this.servicePeriodExpiryNullFlavourDefiningCode = servicePeriodExpiryNullFlavourDefiningCode;
  }

  public NullFlavour getServicePeriodExpiryNullFlavourDefiningCode() {
     return this.servicePeriodExpiryNullFlavourDefiningCode ;
  }

  public void setIndefiniteValue(Boolean indefiniteValue) {
     this.indefiniteValue = indefiniteValue;
  }

  public Boolean isIndefiniteValue() {
     return this.indefiniteValue ;
  }

  public void setIndefiniteNullFlavourDefiningCode(NullFlavour indefiniteNullFlavourDefiningCode) {
     this.indefiniteNullFlavourDefiningCode = indefiniteNullFlavourDefiningCode;
  }

  public NullFlavour getIndefiniteNullFlavourDefiningCode() {
     return this.indefiniteNullFlavourDefiningCode ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setSupportingInformation(List<Cluster> supportingInformation) {
     this.supportingInformation = supportingInformation;
  }

  public List<Cluster> getSupportingInformation() {
     return this.supportingInformation ;
  }

  public void setSupplementaryInformationValue(Boolean supplementaryInformationValue) {
     this.supplementaryInformationValue = supplementaryInformationValue;
  }

  public Boolean isSupplementaryInformationValue() {
     return this.supplementaryInformationValue ;
  }

  public void setSupplementaryInformationNullFlavourDefiningCode(
      NullFlavour supplementaryInformationNullFlavourDefiningCode) {
     this.supplementaryInformationNullFlavourDefiningCode = supplementaryInformationNullFlavourDefiningCode;
  }

  public NullFlavour getSupplementaryInformationNullFlavourDefiningCode() {
     return this.supplementaryInformationNullFlavourDefiningCode ;
  }

  public void setInformationDescriptionValue(String informationDescriptionValue) {
     this.informationDescriptionValue = informationDescriptionValue;
  }

  public String getInformationDescriptionValue() {
     return this.informationDescriptionValue ;
  }

  public void setInformationDescriptionNullFlavourDefiningCode(
      NullFlavour informationDescriptionNullFlavourDefiningCode) {
     this.informationDescriptionNullFlavourDefiningCode = informationDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getInformationDescriptionNullFlavourDefiningCode() {
     return this.informationDescriptionNullFlavourDefiningCode ;
  }

  public void setPatientRequirements(List<Cluster> patientRequirements) {
     this.patientRequirements = patientRequirements;
  }

  public List<Cluster> getPatientRequirements() {
     return this.patientRequirements ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setTiming(DvParsable timing) {
     this.timing = timing;
  }

  public DvParsable getTiming() {
     return this.timing ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setUrgency(ServiceRequestUrgencyChoice urgency) {
     this.urgency = urgency;
  }

  public ServiceRequestUrgencyChoice getUrgency() {
     return this.urgency ;
  }

  public void setServiceDue(ServiceRequestServiceDueChoice serviceDue) {
     this.serviceDue = serviceDue;
  }

  public ServiceRequestServiceDueChoice getServiceDue() {
     return this.serviceDue ;
  }
}
