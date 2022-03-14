package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.net.URI;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.068343-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImagingExaminationResultExaminationRequestDetailsCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Requester order identifier
   * Description: The local identifier assigned to the order by the order requester. Equivalent to the HL7 Placer Order Identifier.
   */
  @Path("/items[at0028]/value")
  private DvIdentifier requesterOrderIdentifier;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Requester order identifier/null_flavour
   */
  @Path("/items[at0028]/null_flavour|defining_code")
  private NullFlavour requesterOrderIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Examination requested name
   * Description: Identification of imaging examination or procedure requested, where the examination requested differs from the examination actually performed.
   */
  @Path("/items[at0029]")
  private List<ImagingExaminationResultExaminationRequestedNameElement> examinationRequestedName;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Requester
   * Description: Details about the clinician or organisation requesting the imaging examination.
   */
  @Path("/items[at0030]")
  private List<Cluster> requester;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Receiver order identifier
   * Description: The local identifier assigned to the examination order by the order filler, usually by the Radiology Information System (RIS). Usually equivalent to the HL7 Filler Order Number.
   */
  @Path("/items[at0031]/value")
  private DvIdentifier receiverOrderIdentifier;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Receiver order identifier/null_flavour
   */
  @Path("/items[at0031]/null_flavour|defining_code")
  private NullFlavour receiverOrderIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/DICOM study identifier
   * Description: Unique identifier of this study allocated by the imaging service.
   */
  @Path("/items[at0032]/value|value")
  private URI dicomStudyIdentifierValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/DICOM study identifier/null_flavour
   */
  @Path("/items[at0032]/null_flavour|defining_code")
  private NullFlavour dicomStudyIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Report identifier
   * Description: The local identifier given to the imaging examination report.
   */
  @Path("/items[at0033]/value")
  private DvIdentifier reportIdentifier;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Report identifier/null_flavour
   */
  @Path("/items[at0033]/null_flavour|defining_code")
  private NullFlavour reportIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details
   * Description: Images referred to, or provided, to assist clinical understanding of the examination. If attached image is in DICOM format, all the fields below should be populated so the values are available to software that does not process DICOM images.
   */
  @Path("/items[at0034]")
  private List<ImagingExaminationResultImageDetailsCluster> imageDetails;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setRequesterOrderIdentifier(DvIdentifier requesterOrderIdentifier) {
     this.requesterOrderIdentifier = requesterOrderIdentifier;
  }

  public DvIdentifier getRequesterOrderIdentifier() {
     return this.requesterOrderIdentifier ;
  }

  public void setRequesterOrderIdentifierNullFlavourDefiningCode(
      NullFlavour requesterOrderIdentifierNullFlavourDefiningCode) {
     this.requesterOrderIdentifierNullFlavourDefiningCode = requesterOrderIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getRequesterOrderIdentifierNullFlavourDefiningCode() {
     return this.requesterOrderIdentifierNullFlavourDefiningCode ;
  }

  public void setExaminationRequestedName(
      List<ImagingExaminationResultExaminationRequestedNameElement> examinationRequestedName) {
     this.examinationRequestedName = examinationRequestedName;
  }

  public List<ImagingExaminationResultExaminationRequestedNameElement> getExaminationRequestedName(
      ) {
     return this.examinationRequestedName ;
  }

  public void setRequester(List<Cluster> requester) {
     this.requester = requester;
  }

  public List<Cluster> getRequester() {
     return this.requester ;
  }

  public void setReceiverOrderIdentifier(DvIdentifier receiverOrderIdentifier) {
     this.receiverOrderIdentifier = receiverOrderIdentifier;
  }

  public DvIdentifier getReceiverOrderIdentifier() {
     return this.receiverOrderIdentifier ;
  }

  public void setReceiverOrderIdentifierNullFlavourDefiningCode(
      NullFlavour receiverOrderIdentifierNullFlavourDefiningCode) {
     this.receiverOrderIdentifierNullFlavourDefiningCode = receiverOrderIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getReceiverOrderIdentifierNullFlavourDefiningCode() {
     return this.receiverOrderIdentifierNullFlavourDefiningCode ;
  }

  public void setDicomStudyIdentifierValue(URI dicomStudyIdentifierValue) {
     this.dicomStudyIdentifierValue = dicomStudyIdentifierValue;
  }

  public URI getDicomStudyIdentifierValue() {
     return this.dicomStudyIdentifierValue ;
  }

  public void setDicomStudyIdentifierNullFlavourDefiningCode(
      NullFlavour dicomStudyIdentifierNullFlavourDefiningCode) {
     this.dicomStudyIdentifierNullFlavourDefiningCode = dicomStudyIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getDicomStudyIdentifierNullFlavourDefiningCode() {
     return this.dicomStudyIdentifierNullFlavourDefiningCode ;
  }

  public void setReportIdentifier(DvIdentifier reportIdentifier) {
     this.reportIdentifier = reportIdentifier;
  }

  public DvIdentifier getReportIdentifier() {
     return this.reportIdentifier ;
  }

  public void setReportIdentifierNullFlavourDefiningCode(
      NullFlavour reportIdentifierNullFlavourDefiningCode) {
     this.reportIdentifierNullFlavourDefiningCode = reportIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getReportIdentifierNullFlavourDefiningCode() {
     return this.reportIdentifierNullFlavourDefiningCode ;
  }

  public void setImageDetails(List<ImagingExaminationResultImageDetailsCluster> imageDetails) {
     this.imageDetails = imageDetails;
  }

  public List<ImagingExaminationResultImageDetailsCluster> getImageDetails() {
     return this.imageDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
