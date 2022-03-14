package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvIdentifier;
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

@Entity
@Archetype("openEHR-EHR-ACTION.care_plan.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.217120-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class CarePlanAction implements EntryEntity {
  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Care Plan Name
   * Description: Name of care plan.
   */
  @Path("/description[at0019]/items[at0002]/value|value")
  private String carePlanNameValue;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Tree/Care Plan Name/null_flavour
   */
  @Path("/description[at0019]/items[at0002]/null_flavour|defining_code")
  private NullFlavour carePlanNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Description
   * Description: Description of activity performed/enacted against the plan.
   */
  @Path("/description[at0019]/items[at0021]/value|value")
  private String descriptionValue;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Tree/Description/null_flavour
   */
  @Path("/description[at0019]/items[at0021]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Reason
   * Description: Reason for activity  being performed /enacted against the plan.
   */
  @Path("/description[at0019]/items[at0025]/value|value")
  private String reasonValue;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Tree/Reason/null_flavour
   */
  @Path("/description[at0019]/items[at0025]/null_flavour|defining_code")
  private NullFlavour reasonNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Care Plan ID
   * Description: Identification of care plan.
   */
  @Path("/protocol[at0015]/items[at0016]/value")
  private DvIdentifier carePlanId;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Tree/Care Plan ID/null_flavour
   */
  @Path("/protocol[at0015]/items[at0016]/null_flavour|defining_code")
  private NullFlavour carePlanIdNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Expiry Date
   * Description: Anticipated date beyond which the care plan can be deemed 'expired'.
   */
  @Path("/protocol[at0015]/items[at0017]/value|value")
  private TemporalAccessor expiryDateValue;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/Tree/Expiry Date/null_flavour
   */
  @Path("/protocol[at0015]/items[at0017]/null_flavour|defining_code")
  private NullFlavour expiryDateNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/ism_transition/Careflow_step
   */
  @Path("/ism_transition/careflow_step|defining_code")
  private CareflowStepDefiningCode4 careflowStepDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/ism_transition/Current_state
   */
  @Path("/ism_transition/current_state|defining_code")
  private CurrentStateDefiningCode4 currentStateDefiningCode;

  /**
   * Path: International Patient Summary/Plan of Care/Care Plan/ism_transition/transition
   */
  @Path("/ism_transition/transition|defining_code")
  private Transition transitionDefiningCode;

  public void setCarePlanNameValue(String carePlanNameValue) {
     this.carePlanNameValue = carePlanNameValue;
  }

  public String getCarePlanNameValue() {
     return this.carePlanNameValue ;
  }

  public void setCarePlanNameNullFlavourDefiningCode(
      NullFlavour carePlanNameNullFlavourDefiningCode) {
     this.carePlanNameNullFlavourDefiningCode = carePlanNameNullFlavourDefiningCode;
  }

  public NullFlavour getCarePlanNameNullFlavourDefiningCode() {
     return this.carePlanNameNullFlavourDefiningCode ;
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

  public void setReasonValue(String reasonValue) {
     this.reasonValue = reasonValue;
  }

  public String getReasonValue() {
     return this.reasonValue ;
  }

  public void setReasonNullFlavourDefiningCode(NullFlavour reasonNullFlavourDefiningCode) {
     this.reasonNullFlavourDefiningCode = reasonNullFlavourDefiningCode;
  }

  public NullFlavour getReasonNullFlavourDefiningCode() {
     return this.reasonNullFlavourDefiningCode ;
  }

  public void setCarePlanId(DvIdentifier carePlanId) {
     this.carePlanId = carePlanId;
  }

  public DvIdentifier getCarePlanId() {
     return this.carePlanId ;
  }

  public void setCarePlanIdNullFlavourDefiningCode(NullFlavour carePlanIdNullFlavourDefiningCode) {
     this.carePlanIdNullFlavourDefiningCode = carePlanIdNullFlavourDefiningCode;
  }

  public NullFlavour getCarePlanIdNullFlavourDefiningCode() {
     return this.carePlanIdNullFlavourDefiningCode ;
  }

  public void setExpiryDateValue(TemporalAccessor expiryDateValue) {
     this.expiryDateValue = expiryDateValue;
  }

  public TemporalAccessor getExpiryDateValue() {
     return this.expiryDateValue ;
  }

  public void setExpiryDateNullFlavourDefiningCode(NullFlavour expiryDateNullFlavourDefiningCode) {
     this.expiryDateNullFlavourDefiningCode = expiryDateNullFlavourDefiningCode;
  }

  public NullFlavour getExpiryDateNullFlavourDefiningCode() {
     return this.expiryDateNullFlavourDefiningCode ;
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

  public void setCareflowStepDefiningCode(CareflowStepDefiningCode4 careflowStepDefiningCode) {
     this.careflowStepDefiningCode = careflowStepDefiningCode;
  }

  public CareflowStepDefiningCode4 getCareflowStepDefiningCode() {
     return this.careflowStepDefiningCode ;
  }

  public void setCurrentStateDefiningCode(CurrentStateDefiningCode4 currentStateDefiningCode) {
     this.currentStateDefiningCode = currentStateDefiningCode;
  }

  public CurrentStateDefiningCode4 getCurrentStateDefiningCode() {
     return this.currentStateDefiningCode ;
  }

  public void setTransitionDefiningCode(Transition transitionDefiningCode) {
     this.transitionDefiningCode = transitionDefiningCode;
  }

  public Transition getTransitionDefiningCode() {
     return this.transitionDefiningCode ;
  }
}
