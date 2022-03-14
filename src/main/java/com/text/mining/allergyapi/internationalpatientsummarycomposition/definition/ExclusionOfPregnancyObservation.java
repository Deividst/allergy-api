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
@Archetype("openEHR-EHR-OBSERVATION.exclusion_pregnancy.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.205032-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ExclusionOfPregnancyObservation implements EntryEntity {
  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0004]/items[at0005]")
  private List<Cluster> extension;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: International Patient Summary/Pregnancy/Exclusion of pregnancy/Any event
   * Description: *
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<ExclusionOfPregnancyAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
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

  public void setAnyEvent(List<ExclusionOfPregnancyAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<ExclusionOfPregnancyAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
