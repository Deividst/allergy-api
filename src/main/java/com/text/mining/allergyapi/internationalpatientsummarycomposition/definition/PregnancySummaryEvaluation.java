package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Archetype("openEHR-EHR-EVALUATION.pregnancy_summary.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.197822-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class PregnancySummaryEvaluation implements EntryEntity {
  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/Status
   * Description: *
   */
  @Path("/data[at0001]/items[at0141]/value|defining_code")
  private StatusDefiningCode statusDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/Tree/Status/null_flavour
   */
  @Path("/data[at0001]/items[at0141]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/Per pregnancy/Pregnancy outcome
   * Description: Outcome of the pregnancy as a whole.
   * Comment: Coding of the Pregnancy Outcome with a terminology is desirable, where possible. If individual fetuses have been identified, record this information using the 'Individual Outcome' data element. This data element is not to be recorded if 'Individual Outcome' is recorded.
   */
  @Path("/data[at0001]/items[at0145]/items[at0094]/value|value")
  private String pregnancyOutcomeValue;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/Tree/Per pregnancy/Pregnancy outcome/null_flavour
   */
  @Path("/data[at0001]/items[at0145]/items[at0094]/null_flavour|defining_code")
  private NullFlavour pregnancyOutcomeNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/Tree
   * Description: @ internal @
   */
  @Path("/protocol[at0081]")
  private ItemTree tree;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: International Patient Summary/Pregnancy/Pregnancy summary/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setStatusDefiningCode(StatusDefiningCode statusDefiningCode) {
     this.statusDefiningCode = statusDefiningCode;
  }

  public StatusDefiningCode getStatusDefiningCode() {
     return this.statusDefiningCode ;
  }

  public void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode) {
     this.statusNullFlavourDefiningCode = statusNullFlavourDefiningCode;
  }

  public NullFlavour getStatusNullFlavourDefiningCode() {
     return this.statusNullFlavourDefiningCode ;
  }

  public void setPregnancyOutcomeValue(String pregnancyOutcomeValue) {
     this.pregnancyOutcomeValue = pregnancyOutcomeValue;
  }

  public String getPregnancyOutcomeValue() {
     return this.pregnancyOutcomeValue ;
  }

  public void setPregnancyOutcomeNullFlavourDefiningCode(
      NullFlavour pregnancyOutcomeNullFlavourDefiningCode) {
     this.pregnancyOutcomeNullFlavourDefiningCode = pregnancyOutcomeNullFlavourDefiningCode;
  }

  public NullFlavour getPregnancyOutcomeNullFlavourDefiningCode() {
     return this.pregnancyOutcomeNullFlavourDefiningCode ;
  }

  public void setTree(ItemTree tree) {
     this.tree = tree;
  }

  public ItemTree getTree() {
     return this.tree ;
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
