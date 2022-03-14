package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.986642-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DeviceUseStatementDeviceDetailsCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details/Device name
   * Description: Identification of the specific device, by name.
   */
  @Path("/items[at0007]/value|value")
  private String deviceNameValue;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Tree/Device details/Device name/null_flavour
   */
  @Path("/items[at0007]/null_flavour|defining_code")
  private NullFlavour deviceNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details/Body site
   * Description: Identification of the body site where the device is fitted/implanted.
   */
  @Path("/items[at0012]/value|value")
  private String bodySiteValue;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Tree/Device details/Body site/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour bodySiteNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details/Structured body site
   * Description: A structured anatomical location of the body site where the device is fitted/implanted.
   */
  @Path("/items[at0013]")
  private List<Cluster> structuredBodySite;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details/Medical device
   * Description: An instrument, apparatus, implant, material or similar, used in the provision of healthcare. In this context, a medical device includes a broad range of devices which act through a variety of physical, mechanical, thermal or similar means but specifically excludes devices which act through medicinal means such as pharmacological, metabolic or immunological methods.  The scope is inclusive of disposable devices as well as durable or persisting devices that require tracking, maintenance activities or regular calibration, recognising that each type of device has specific data recording requirements.
   */
  @Path("/items[openEHR-EHR-CLUSTER.device.v1]")
  private MedicalDeviceCluster medicalDevice;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details/Multimedia
   * Description: Digital image, video or diagram about the device.
   */
  @Path("/items[at0021]")
  private List<Cluster> multimedia;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDeviceNameValue(String deviceNameValue) {
     this.deviceNameValue = deviceNameValue;
  }

  public String getDeviceNameValue() {
     return this.deviceNameValue ;
  }

  public void setDeviceNameNullFlavourDefiningCode(NullFlavour deviceNameNullFlavourDefiningCode) {
     this.deviceNameNullFlavourDefiningCode = deviceNameNullFlavourDefiningCode;
  }

  public NullFlavour getDeviceNameNullFlavourDefiningCode() {
     return this.deviceNameNullFlavourDefiningCode ;
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

  public void setStructuredBodySite(List<Cluster> structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public List<Cluster> getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setMedicalDevice(MedicalDeviceCluster medicalDevice) {
     this.medicalDevice = medicalDevice;
  }

  public MedicalDeviceCluster getMedicalDevice() {
     return this.medicalDevice ;
  }

  public void setMultimedia(List<Cluster> multimedia) {
     this.multimedia = multimedia;
  }

  public List<Cluster> getMultimedia() {
     return this.multimedia ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
