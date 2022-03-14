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

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.pulse_oximetry.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.165266-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class PulseOximetryObservation implements EntryEntity {
  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Oximetry device
   * Description: Details of the non-invasive oximetry device used.
   */
  @Path("/protocol[at0007]/items[at0018]")
  private Cluster oximetryDevice;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: e.g. Local hospital departmental infomation or additional metadata to align with HL7 or CDISC equivalents.
   */
  @Path("/protocol[at0007]/items[at0059]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Vital Signs/Pulse oximetry/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<PulseOximetryAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setOximetryDevice(Cluster oximetryDevice) {
     this.oximetryDevice = oximetryDevice;
  }

  public Cluster getOximetryDevice() {
     return this.oximetryDevice ;
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

  public void setAnyEvent(List<PulseOximetryAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<PulseOximetryAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
