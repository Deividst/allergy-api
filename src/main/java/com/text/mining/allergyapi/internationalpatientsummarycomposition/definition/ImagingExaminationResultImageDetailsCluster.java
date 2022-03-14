package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.072681-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImagingExaminationResultImageDetailsCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/Image identifier
   * Description: Unique identifier of this image allocated by the imaging service (often the DICOM image instance UID).
   */
  @Path("/items[at0035]/value")
  private DvIdentifier imageIdentifier;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Image details/Image identifier/null_flavour
   */
  @Path("/items[at0035]/null_flavour|defining_code")
  private NullFlavour imageIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/DICOM series identifier
   * Description: Unique identifier of this series allocated by the imaging service.
   */
  @Path("/items[at0036]/value")
  private DvIdentifier dicomSeriesIdentifier;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Image details/DICOM series identifier/null_flavour
   */
  @Path("/items[at0036]/null_flavour|defining_code")
  private NullFlavour dicomSeriesIdentifierNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/View
   * Description: The name of the imaging view e.g Lateral or Antero-posterior (AP). Coding using a terminology is desirable, where possible.
   */
  @Path("/items[at0037]/value|value")
  private String viewValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Image details/View/null_flavour
   */
  @Path("/items[at0037]/null_flavour|defining_code")
  private NullFlavour viewNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/Position
   * Description: Description of the subject of care's positon when the image was performed.
   */
  @Path("/items[at0038]/value|value")
  private String positionValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Image details/Position/null_flavour
   */
  @Path("/items[at0038]/null_flavour|defining_code")
  private NullFlavour positionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/Image DateTime
   * Description: Specific date/time the imaging examination was performed.
   */
  @Path("/items[at0039]/value|value")
  private TemporalAccessor imageDatetimeValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Image details/Image DateTime/null_flavour
   */
  @Path("/items[at0039]/null_flavour|defining_code")
  private NullFlavour imageDatetimeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/Image
   * Description: An attached or referenced image of a current view.
   */
  @Path("/items[at0040]/value")
  private DvMultimedia image;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Tree/Examination request details/Image details/Image/null_flavour
   */
  @Path("/items[at0040]/null_flavour|defining_code")
  private NullFlavour imageNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Examination request details/Image details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setImageIdentifier(DvIdentifier imageIdentifier) {
     this.imageIdentifier = imageIdentifier;
  }

  public DvIdentifier getImageIdentifier() {
     return this.imageIdentifier ;
  }

  public void setImageIdentifierNullFlavourDefiningCode(
      NullFlavour imageIdentifierNullFlavourDefiningCode) {
     this.imageIdentifierNullFlavourDefiningCode = imageIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getImageIdentifierNullFlavourDefiningCode() {
     return this.imageIdentifierNullFlavourDefiningCode ;
  }

  public void setDicomSeriesIdentifier(DvIdentifier dicomSeriesIdentifier) {
     this.dicomSeriesIdentifier = dicomSeriesIdentifier;
  }

  public DvIdentifier getDicomSeriesIdentifier() {
     return this.dicomSeriesIdentifier ;
  }

  public void setDicomSeriesIdentifierNullFlavourDefiningCode(
      NullFlavour dicomSeriesIdentifierNullFlavourDefiningCode) {
     this.dicomSeriesIdentifierNullFlavourDefiningCode = dicomSeriesIdentifierNullFlavourDefiningCode;
  }

  public NullFlavour getDicomSeriesIdentifierNullFlavourDefiningCode() {
     return this.dicomSeriesIdentifierNullFlavourDefiningCode ;
  }

  public void setViewValue(String viewValue) {
     this.viewValue = viewValue;
  }

  public String getViewValue() {
     return this.viewValue ;
  }

  public void setViewNullFlavourDefiningCode(NullFlavour viewNullFlavourDefiningCode) {
     this.viewNullFlavourDefiningCode = viewNullFlavourDefiningCode;
  }

  public NullFlavour getViewNullFlavourDefiningCode() {
     return this.viewNullFlavourDefiningCode ;
  }

  public void setPositionValue(String positionValue) {
     this.positionValue = positionValue;
  }

  public String getPositionValue() {
     return this.positionValue ;
  }

  public void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode) {
     this.positionNullFlavourDefiningCode = positionNullFlavourDefiningCode;
  }

  public NullFlavour getPositionNullFlavourDefiningCode() {
     return this.positionNullFlavourDefiningCode ;
  }

  public void setImageDatetimeValue(TemporalAccessor imageDatetimeValue) {
     this.imageDatetimeValue = imageDatetimeValue;
  }

  public TemporalAccessor getImageDatetimeValue() {
     return this.imageDatetimeValue ;
  }

  public void setImageDatetimeNullFlavourDefiningCode(
      NullFlavour imageDatetimeNullFlavourDefiningCode) {
     this.imageDatetimeNullFlavourDefiningCode = imageDatetimeNullFlavourDefiningCode;
  }

  public NullFlavour getImageDatetimeNullFlavourDefiningCode() {
     return this.imageDatetimeNullFlavourDefiningCode ;
  }

  public void setImage(DvMultimedia image) {
     this.image = image;
  }

  public DvMultimedia getImage() {
     return this.image ;
  }

  public void setImageNullFlavourDefiningCode(NullFlavour imageNullFlavourDefiningCode) {
     this.imageNullFlavourDefiningCode = imageNullFlavourDefiningCode;
  }

  public NullFlavour getImageNullFlavourDefiningCode() {
     return this.imageNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
