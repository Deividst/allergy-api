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
    date = "2021-09-27T22:12:01.947815-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImmunizationStatementAction implements EntryEntity {
  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Immunisation item
   * Description: Name of the medication, vaccine or other therapeutic/prescribable item which was the focus of the activity.
   * Comment: For example: 'Atenolol 100mg' or 'Tenormin tablets 100mg'. 
   * It is strongly recommended that the 'Medication item' is coded with a terminology capable of triggering decision support, where possible. The extent of coding may vary from the simple name of the medication item through to structured details about the actual medication pack used. Free text entry should only be used if there is no appropriate terminology available.
   */
  @Path("/description[at0017]/items[at0020 and name/value='Immunisation item']/value|value")
  private String immunisationItemValue;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Tree/Immunisation item/null_flavour
   */
  @Path("/description[at0017]/items[at0020 and name/value='Immunisation item']/null_flavour|defining_code")
  private NullFlavour immunisationItemNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Medication details
   * Description: Structured details about the medication including strength, form and constituent substances.
   * Comment: Use this SLOT where the detailed description of the dispensed, authorised or administered item needs to be explicitly stated. For example: the form, strength, any diluents or mixture of ingredients.
   */
  @Path("/description[at0017]/items[at0104]")
  private Cluster medicationDetails;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Amount
   * Description: Specific details about the amount of the medication item.
   * Comment: CLUSTER.dosage is intended to carry details of medication order changes or dose administrations, whilst CLUSTER.medication_supply_amount is intended for details of dispensing-related activity.
   */
  @Path("/description[at0017]/items[at0131]")
  private Cluster amount;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Administration details/Route
   * Description: The route by which the ordered item was, or is to be, administered into the subject's body.
   * Comment: Comment: For example: 'oral', 'intravenous', or 'topical'. Coding of the route with a terminology is preferred, where possible. Multiple potential routes may be specified.
   */
  @Path("/description[at0017]/items[at0140]/items[at0147]/value|value")
  private String routeValue;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Tree/Administration details/Route/null_flavour
   */
  @Path("/description[at0017]/items[at0140]/items[at0147]/null_flavour|defining_code")
  private NullFlavour routeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Administration details/Target site
   * Description: Structured description of the site of administration of the ordered item.
   * Comment: For example: 'left upper arm', 'intravenous catheter right hand'. 
   * Coding of the body site with a terminology is preferred, where possible.
   */
  @Path("/description[at0017]/items[at0140]/items[at0141 and name/value='Target site']/value|value")
  private String targetSiteValue;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Tree/Administration details/Target site/null_flavour
   */
  @Path("/description[at0017]/items[at0140]/items[at0141 and name/value='Target site']/null_flavour|defining_code")
  private NullFlavour targetSiteNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Administration details/Structured body site
   * Description: Structured description of the site of administration of the medication, vaccine or therapeutic good.
   * Comment: For example: "On the medial skin surface of the left forearm, from 10 cm to 20 cm distally from the point of the elbow".
   */
  @Path("/description[at0017]/items[at0140]/items[at0142]")
  private Cluster structuredBodySite;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Administration details/Administration device
   * Description: Details of the medical device used to assist administration of the medication.
   */
  @Path("/description[at0017]/items[at0140]/items[at0144]")
  private List<Cluster> administrationDevice;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Additional details
   * Description: Further structured details of the action, possibly specific to a pathway step.
   */
  @Path("/description[at0017]/items[at0053]")
  private List<Cluster> additionalDetails;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Sequence number
   * Description: The sequence number specific to the pathway step being recorded.
   */
  @Path("/description[at0017]/items[at0025]/value|magnitude")
  private Long sequenceNumberMagnitude;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Tree/Sequence number/null_flavour
   */
  @Path("/description[at0017]/items[at0025]/null_flavour|defining_code")
  private NullFlavour sequenceNumberNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0030]/items[at0085]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/ism_transition/Careflow_step
   */
  @Path("/ism_transition/careflow_step|defining_code")
  private CareflowStepDefiningCode2 careflowStepDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/ism_transition/Current_state
   */
  @Path("/ism_transition/current_state|defining_code")
  private CurrentStateDefiningCode2 currentStateDefiningCode;

  /**
   * Path: International Patient Summary/Immunizations/Immunization statement/ism_transition/transition
   */
  @Path("/ism_transition/transition|defining_code")
  private Transition transitionDefiningCode;

  public void setImmunisationItemValue(String immunisationItemValue) {
     this.immunisationItemValue = immunisationItemValue;
  }

  public String getImmunisationItemValue() {
     return this.immunisationItemValue ;
  }

  public void setImmunisationItemNullFlavourDefiningCode(
      NullFlavour immunisationItemNullFlavourDefiningCode) {
     this.immunisationItemNullFlavourDefiningCode = immunisationItemNullFlavourDefiningCode;
  }

  public NullFlavour getImmunisationItemNullFlavourDefiningCode() {
     return this.immunisationItemNullFlavourDefiningCode ;
  }

  public void setMedicationDetails(Cluster medicationDetails) {
     this.medicationDetails = medicationDetails;
  }

  public Cluster getMedicationDetails() {
     return this.medicationDetails ;
  }

  public void setAmount(Cluster amount) {
     this.amount = amount;
  }

  public Cluster getAmount() {
     return this.amount ;
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

  public void setTargetSiteValue(String targetSiteValue) {
     this.targetSiteValue = targetSiteValue;
  }

  public String getTargetSiteValue() {
     return this.targetSiteValue ;
  }

  public void setTargetSiteNullFlavourDefiningCode(NullFlavour targetSiteNullFlavourDefiningCode) {
     this.targetSiteNullFlavourDefiningCode = targetSiteNullFlavourDefiningCode;
  }

  public NullFlavour getTargetSiteNullFlavourDefiningCode() {
     return this.targetSiteNullFlavourDefiningCode ;
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

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setSequenceNumberMagnitude(Long sequenceNumberMagnitude) {
     this.sequenceNumberMagnitude = sequenceNumberMagnitude;
  }

  public Long getSequenceNumberMagnitude() {
     return this.sequenceNumberMagnitude ;
  }

  public void setSequenceNumberNullFlavourDefiningCode(
      NullFlavour sequenceNumberNullFlavourDefiningCode) {
     this.sequenceNumberNullFlavourDefiningCode = sequenceNumberNullFlavourDefiningCode;
  }

  public NullFlavour getSequenceNumberNullFlavourDefiningCode() {
     return this.sequenceNumberNullFlavourDefiningCode ;
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

  public void setCareflowStepDefiningCode(CareflowStepDefiningCode2 careflowStepDefiningCode) {
     this.careflowStepDefiningCode = careflowStepDefiningCode;
  }

  public CareflowStepDefiningCode2 getCareflowStepDefiningCode() {
     return this.careflowStepDefiningCode ;
  }

  public void setCurrentStateDefiningCode(CurrentStateDefiningCode2 currentStateDefiningCode) {
     this.currentStateDefiningCode = currentStateDefiningCode;
  }

  public CurrentStateDefiningCode2 getCurrentStateDefiningCode() {
     return this.currentStateDefiningCode ;
  }

  public void setTransitionDefiningCode(Transition transitionDefiningCode) {
     this.transitionDefiningCode = transitionDefiningCode;
  }

  public Transition getTransitionDefiningCode() {
     return this.transitionDefiningCode ;
  }
}
