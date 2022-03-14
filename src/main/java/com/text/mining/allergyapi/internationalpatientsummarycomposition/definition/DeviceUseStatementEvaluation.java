package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.device_summary.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.982002-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DeviceUseStatementEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Device details
   * Description: Details about each device.
   */
  @Path("/data[at0001]/items[at0022]")
  private List<DeviceUseStatementDeviceDetailsCluster> deviceDetails;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0016]/items[at0018]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Medical Devices/Device use statement/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDeviceDetails(List<DeviceUseStatementDeviceDetailsCluster> deviceDetails) {
     this.deviceDetails = deviceDetails;
  }

  public List<DeviceUseStatementDeviceDetailsCluster> getDeviceDetails() {
     return this.deviceDetails ;
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
}
