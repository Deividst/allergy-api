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
@Archetype("openEHR-EHR-OBSERVATION.imaging_exam_result.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.064234-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImagingExaminationResultObservation implements EntryEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Technique
   * Description: Narrative description about the technical details and procedure.
   * Comment: For example: outline of technique; non-routine alternative or additional imaging; nature and route of administration of contrast agent, radiopharmaceuticals and/or treatments administered; adverse reactions to contrast media.
   */
  @Path("/protocol[at0025]/items[at0049]/value|value")
  private String techniqueValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Technique/null_flavour
   */
  @Path("/protocol[at0025]/items[at0049]/null_flavour|defining_code")
  private NullFlavour techniqueNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Structured technique
   * Description: Additional structured details of technical details and procedure.
   */
  @Path("/protocol[at0025]/items[at0041]")
  private List<Cluster> structuredTechnique;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Imaging quality
   * Description: Narrative description about the quality of the examination.
   * Comment: For example: the nature of any limitations and their impact on interpretation.
   */
  @Path("/protocol[at0025]/items[at0057]/value|value")
  private String imagingQualityValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Imaging quality/null_flavour
   */
  @Path("/protocol[at0025]/items[at0057]/null_flavour|defining_code")
  private NullFlavour imagingQualityNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Receiving imaging service
   * Description: Demographic details about the receiving imaging service performing the imaging test.
   */
  @Path("/protocol[at0025]/items[at0026]")
  private List<Cluster> receivingImagingService;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details
   * Description: Details concerning a single examination requested. Note: Usually there is one examination request for each result, however in some circumstances multiple examination requests may be represented using a single Imaging examination result archetype.
   */
  @Path("/protocol[at0025]/items[at0027]")
  private List<ImagingExaminationResultExaminationRequestDetailsCluster> examinationRequestDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0025]/items[at0046]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<ImagingExaminationResultAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setTechniqueValue(String techniqueValue) {
     this.techniqueValue = techniqueValue;
  }

  public String getTechniqueValue() {
     return this.techniqueValue ;
  }

  public void setTechniqueNullFlavourDefiningCode(NullFlavour techniqueNullFlavourDefiningCode) {
     this.techniqueNullFlavourDefiningCode = techniqueNullFlavourDefiningCode;
  }

  public NullFlavour getTechniqueNullFlavourDefiningCode() {
     return this.techniqueNullFlavourDefiningCode ;
  }

  public void setStructuredTechnique(List<Cluster> structuredTechnique) {
     this.structuredTechnique = structuredTechnique;
  }

  public List<Cluster> getStructuredTechnique() {
     return this.structuredTechnique ;
  }

  public void setImagingQualityValue(String imagingQualityValue) {
     this.imagingQualityValue = imagingQualityValue;
  }

  public String getImagingQualityValue() {
     return this.imagingQualityValue ;
  }

  public void setImagingQualityNullFlavourDefiningCode(
      NullFlavour imagingQualityNullFlavourDefiningCode) {
     this.imagingQualityNullFlavourDefiningCode = imagingQualityNullFlavourDefiningCode;
  }

  public NullFlavour getImagingQualityNullFlavourDefiningCode() {
     return this.imagingQualityNullFlavourDefiningCode ;
  }

  public void setReceivingImagingService(List<Cluster> receivingImagingService) {
     this.receivingImagingService = receivingImagingService;
  }

  public List<Cluster> getReceivingImagingService() {
     return this.receivingImagingService ;
  }

  public void setExaminationRequestDetails(
      List<ImagingExaminationResultExaminationRequestDetailsCluster> examinationRequestDetails) {
     this.examinationRequestDetails = examinationRequestDetails;
  }

  public List<ImagingExaminationResultExaminationRequestDetailsCluster> getExaminationRequestDetails(
      ) {
     return this.examinationRequestDetails ;
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

  public void setAnyEvent(List<ImagingExaminationResultAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<ImagingExaminationResultAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
