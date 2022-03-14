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
@Archetype("openEHR-EHR-ACTION.procedure.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.958072-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ProcedureAction implements EntryEntity {
  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Procedure name
   * Description: Identification of the procedure by name.
   * Comment: Coding of the specific procedure with a terminology is preferred, where possible.
   */
  @Path("/description[at0001]/items[at0002]/value|value")
  private String procedureNameValue;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Tree/Procedure name/null_flavour
   */
  @Path("/description[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour procedureNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Body site
   * Description: Identification of the body site for the procedure.
   * Comment: Occurrences for this data element are unbounded to allow for clinical scenarios such as removing multiple skin lesions in different places, but where all of the other attributes are identical. Use this data element to record simple terms or precoordinated anatomical locations. If the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the 'Procedure detail' SLOT in this archetype. If the anatomical location is included in the 'Procedure name' via precoordinated codes, this data element becomes redundant.
   */
  @Path("/description[at0001]/items[at0063]")
  private List<ProcedureBodySiteElement> bodySite;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Procedure detail
   * Description: Structured information about the procedure.
   * Comment: Use to capture detailed, structured information about anatomical location, method & technique, equipment used, devices implanted, results, findings etc.
   */
  @Path("/description[at0001]/items[at0003]")
  private List<Cluster> procedureDetail;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Multimedia
   * Description: Mulitimedia representation of a performed procedure.
   */
  @Path("/description[at0001]/items[at0062]")
  private List<Cluster> multimedia;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Requestor
   * Description: Details about the healthcare provider or organisation requesting the service.
   */
  @Path("/protocol[at0053]/items[at0055]")
  private Cluster requestor;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Receiver
   * Description: Details about the healthcare provider or organisation receiving the request for service.
   */
  @Path("/protocol[at0053]/items[at0057]")
  private List<Cluster> receiver;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0053]/items[at0064]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/ism_transition/Careflow_step
   */
  @Path("/ism_transition/careflow_step|defining_code")
  private CareflowStepDefiningCode3 careflowStepDefiningCode;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/ism_transition/Current_state
   */
  @Path("/ism_transition/current_state|defining_code")
  private CurrentStateDefiningCode3 currentStateDefiningCode;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/ism_transition/transition
   */
  @Path("/ism_transition/transition|defining_code")
  private Transition transitionDefiningCode;

  public void setProcedureNameValue(String procedureNameValue) {
     this.procedureNameValue = procedureNameValue;
  }

  public String getProcedureNameValue() {
     return this.procedureNameValue ;
  }

  public void setProcedureNameNullFlavourDefiningCode(
      NullFlavour procedureNameNullFlavourDefiningCode) {
     this.procedureNameNullFlavourDefiningCode = procedureNameNullFlavourDefiningCode;
  }

  public NullFlavour getProcedureNameNullFlavourDefiningCode() {
     return this.procedureNameNullFlavourDefiningCode ;
  }

  public void setBodySite(List<ProcedureBodySiteElement> bodySite) {
     this.bodySite = bodySite;
  }

  public List<ProcedureBodySiteElement> getBodySite() {
     return this.bodySite ;
  }

  public void setProcedureDetail(List<Cluster> procedureDetail) {
     this.procedureDetail = procedureDetail;
  }

  public List<Cluster> getProcedureDetail() {
     return this.procedureDetail ;
  }

  public void setMultimedia(List<Cluster> multimedia) {
     this.multimedia = multimedia;
  }

  public List<Cluster> getMultimedia() {
     return this.multimedia ;
  }

  public void setRequestor(Cluster requestor) {
     this.requestor = requestor;
  }

  public Cluster getRequestor() {
     return this.requestor ;
  }

  public void setReceiver(List<Cluster> receiver) {
     this.receiver = receiver;
  }

  public List<Cluster> getReceiver() {
     return this.receiver ;
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

  public void setCareflowStepDefiningCode(CareflowStepDefiningCode3 careflowStepDefiningCode) {
     this.careflowStepDefiningCode = careflowStepDefiningCode;
  }

  public CareflowStepDefiningCode3 getCareflowStepDefiningCode() {
     return this.careflowStepDefiningCode ;
  }

  public void setCurrentStateDefiningCode(CurrentStateDefiningCode3 currentStateDefiningCode) {
     this.currentStateDefiningCode = currentStateDefiningCode;
  }

  public CurrentStateDefiningCode3 getCurrentStateDefiningCode() {
     return this.currentStateDefiningCode ;
  }

  public void setTransitionDefiningCode(Transition transitionDefiningCode) {
     this.transitionDefiningCode = transitionDefiningCode;
  }

  public Transition getTransitionDefiningCode() {
     return this.transitionDefiningCode ;
  }
}
