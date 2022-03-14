package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Transition;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-ACTION.medication.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.763281-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class MedicationStatementAction implements EntryEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication item
   * Description: Name of the medication, vaccine or other therapeutic/prescribable item which was the focus of the activity.
   * Comment: For example: 'Atenolol 100mg' or 'Tenormin tablets 100mg'. 
   * It is strongly recommended that the 'Medication item' is coded with a terminology capable of triggering decision support, where possible. The extent of coding may vary from the simple name of the medication item through to structured details about the actual medication pack used. Free text entry should only be used if there is no appropriate terminology available.
   */
  @Path("/description[at0017]/items[at0020]/value|value")
  private String medicationItemValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication item/null_flavour
   */
  @Path("/description[at0017]/items[at0020]/null_flavour|defining_code")
  private NullFlavour medicationItemNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication
   * Description: Details about a medication or component of a medication, including strength, form and details of any specific constituents.
   */
  @Path("/description[at0017]/items[openEHR-EHR-CLUSTER.medication.v1]")
  private MedicationCluster medication;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Dosage
   * Description: The combination of a medication amount and administration timing for a single day, in the context of a medication order or medication management.
   * Comment: For example: '2 tablets at 6pm' or '20mg three times per day'. Please note: this cluster allows multiple occurrences to enable representation of a complete set of dose patterns for a single dose direction.
   */
  @Path("/description[at0017]/items[openEHR-EHR-CLUSTER.dosage.v1]")
  private DosageCluster dosage;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Administration details/Route
   * Description: The route by which the ordered item was, or is to be, administered into the subject's body.
   * Comment: Comment: For example: 'oral', 'intravenous', or 'topical'. Coding of the route with a terminology is preferred, where possible. Multiple potential routes may be specified.
   */
  @Path("/description[at0017]/items[at0140]/items[at0147]/value|value")
  private String routeValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Administration details/Route/null_flavour
   */
  @Path("/description[at0017]/items[at0140]/items[at0147]/null_flavour|defining_code")
  private NullFlavour routeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Administration details/Body site
   * Description: Structured description of the site of administration of the ordered item.
   * Comment: For example: 'left upper arm', 'intravenous catheter right hand'. 
   * Coding of the body site with a terminology is preferred, where possible.
   */
  @Path("/description[at0017]/items[at0140]/items[at0141]/value|value")
  private String bodySiteValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Administration details/Body site/null_flavour
   */
  @Path("/description[at0017]/items[at0140]/items[at0141]/null_flavour|defining_code")
  private NullFlavour bodySiteNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Administration details/Structured body site
   * Description: Structured description of the site of administration of the medication, vaccine or therapeutic good.
   * Comment: For example: "On the medial skin surface of the left forearm, from 10 cm to 20 cm distally from the point of the elbow".
   */
  @Path("/description[at0017]/items[at0140]/items[at0142]")
  private Cluster structuredBodySite;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Administration details/Administration device
   * Description: Details of the medical device used to assist administration of the medication.
   */
  @Path("/description[at0017]/items[at0140]/items[at0144]")
  private List<Cluster> administrationDevice;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Timing - non-daily
   * Description: Structured information about the intended timing pattern for a therapeutic or diagnostic activity occurring over days, weeks, months or years.
   */
  @Path("/description[at0017]/items[openEHR-EHR-CLUSTER.timing_nondaily.v1]")
  private TimingNonDailyCluster timingNonDaily;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Order ID
   * Description: Unique identifier for the medication order.
   * Comment: Comment: This data element allows for multiple occurrences to be defined more explicitly at run-time, if required.
   */
  @Path("/protocol[at0030]/items[at0103]")
  private List<MedicationStatementOrderIdElement> orderId;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0030]/items[at0085]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/ism_transition/Careflow_step
   */
  @Path("/ism_transition/careflow_step|defining_code")
  private CareflowStepDefiningCode careflowStepDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/ism_transition/Current_state
   */
  @Path("/ism_transition/current_state|defining_code")
  private CurrentStateDefiningCode currentStateDefiningCode;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/ism_transition/transition
   */
  @Path("/ism_transition/transition|defining_code")
  private Transition transitionDefiningCode;

  public void setMedicationItemValue(String medicationItemValue) {
     this.medicationItemValue = medicationItemValue;
  }

  public String getMedicationItemValue() {
     return this.medicationItemValue ;
  }

  public void setMedicationItemNullFlavourDefiningCode(
      NullFlavour medicationItemNullFlavourDefiningCode) {
     this.medicationItemNullFlavourDefiningCode = medicationItemNullFlavourDefiningCode;
  }

  public NullFlavour getMedicationItemNullFlavourDefiningCode() {
     return this.medicationItemNullFlavourDefiningCode ;
  }

  public void setMedication(MedicationCluster medication) {
     this.medication = medication;
  }

  public MedicationCluster getMedication() {
     return this.medication ;
  }

  public void setDosage(DosageCluster dosage) {
     this.dosage = dosage;
  }

  public DosageCluster getDosage() {
     return this.dosage ;
  }

  public void setRouteValue(String routeValue) {
     this.routeValue = routeValue;
  }

  public String getRouteValue() {
     return this.routeValue ;
  }

  public void setRouteNullFlavourDefiningCode(NullFlavour routeNullFlavourDefiningCode) {
     this.routeNullFlavourDefiningCode = routeNullFlavourDefiningCode;
  }

  public NullFlavour getRouteNullFlavourDefiningCode() {
     return this.routeNullFlavourDefiningCode ;
  }

  public void setBodySiteValue(String bodySiteValue) {
     this.bodySiteValue = bodySiteValue;
  }

  public String getBodySiteValue() {
     return this.bodySiteValue ;
  }

  public void setBodySiteNullFlavourDefiningCode(NullFlavour bodySiteNullFlavourDefiningCode) {
     this.bodySiteNullFlavourDefiningCode = bodySiteNullFlavourDefiningCode;
  }

  public NullFlavour getBodySiteNullFlavourDefiningCode() {
     return this.bodySiteNullFlavourDefiningCode ;
  }

  public void setStructuredBodySite(Cluster structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public Cluster getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setAdministrationDevice(List<Cluster> administrationDevice) {
     this.administrationDevice = administrationDevice;
  }

  public List<Cluster> getAdministrationDevice() {
     return this.administrationDevice ;
  }

  public void setTimingNonDaily(TimingNonDailyCluster timingNonDaily) {
     this.timingNonDaily = timingNonDaily;
  }

  public TimingNonDailyCluster getTimingNonDaily() {
     return this.timingNonDaily ;
  }

  public void setOrderId(List<MedicationStatementOrderIdElement> orderId) {
     this.orderId = orderId;
  }

  public List<MedicationStatementOrderIdElement> getOrderId() {
     return this.orderId ;
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

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setCareflowStepDefiningCode(CareflowStepDefiningCode careflowStepDefiningCode) {
     this.careflowStepDefiningCode = careflowStepDefiningCode;
  }

  public CareflowStepDefiningCode getCareflowStepDefiningCode() {
     return this.careflowStepDefiningCode ;
  }

  public void setCurrentStateDefiningCode(CurrentStateDefiningCode currentStateDefiningCode) {
     this.currentStateDefiningCode = currentStateDefiningCode;
  }

  public CurrentStateDefiningCode getCurrentStateDefiningCode() {
     return this.currentStateDefiningCode ;
  }

  public void setTransitionDefiningCode(Transition transitionDefiningCode) {
     this.transitionDefiningCode = transitionDefiningCode;
  }

  public Transition getTransitionDefiningCode() {
     return this.transitionDefiningCode ;
  }
}
