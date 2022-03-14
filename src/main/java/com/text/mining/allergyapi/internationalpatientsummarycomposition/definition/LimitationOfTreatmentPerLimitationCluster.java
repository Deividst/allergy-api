package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;


import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.329621-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class LimitationOfTreatmentPerLimitationCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Per limitation/Type of limitation
   * Description: Description about
   */
  @Path("/items[at0007]/value|defining_code")
  private TypeOfLimitationDefiningCode typeOfLimitationDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Per limitation/Type of limitation/null_flavour
   */
  @Path("/items[at0007]/null_flavour|defining_code")
  private NullFlavour typeOfLimitationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Per limitation/Decision
   * Description: The decision about whether the identified treatment type is permitted or not.
   */
  @Path("/items[at0017]/value|defining_code")
  private DecisionDefiningCode decisionDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Per limitation/Decision/null_flavour
   */
  @Path("/items[at0017]/null_flavour|defining_code")
  private NullFlavour decisionNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Per limitation/Qualification
   * Description: Description about any criteria, caveats or futher clarification about the limitation.
   * Comment: For example: the types of antibiotics that would be acceptable.
   */
  @Path("/items[at0020]/value|value")
  private String qualificationValue;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Tree/Per limitation/Qualification/null_flavour
   */
  @Path("/items[at0020]/null_flavour|defining_code")
  private NullFlavour qualificationNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Advanced Directives/Limitation of treatment/Per limitation/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setTypeOfLimitationDefiningCode(
      TypeOfLimitationDefiningCode typeOfLimitationDefiningCode) {
     this.typeOfLimitationDefiningCode = typeOfLimitationDefiningCode;
  }

  public TypeOfLimitationDefiningCode getTypeOfLimitationDefiningCode() {
     return this.typeOfLimitationDefiningCode ;
  }

  public void setTypeOfLimitationNullFlavourDefiningCode(
      NullFlavour typeOfLimitationNullFlavourDefiningCode) {
     this.typeOfLimitationNullFlavourDefiningCode = typeOfLimitationNullFlavourDefiningCode;
  }

  public NullFlavour getTypeOfLimitationNullFlavourDefiningCode() {
     return this.typeOfLimitationNullFlavourDefiningCode ;
  }

  public void setDecisionDefiningCode(DecisionDefiningCode decisionDefiningCode) {
     this.decisionDefiningCode = decisionDefiningCode;
  }

  public DecisionDefiningCode getDecisionDefiningCode() {
     return this.decisionDefiningCode ;
  }

  public void setDecisionNullFlavourDefiningCode(NullFlavour decisionNullFlavourDefiningCode) {
     this.decisionNullFlavourDefiningCode = decisionNullFlavourDefiningCode;
  }

  public NullFlavour getDecisionNullFlavourDefiningCode() {
     return this.decisionNullFlavourDefiningCode ;
  }

  public void setQualificationValue(String qualificationValue) {
     this.qualificationValue = qualificationValue;
  }

  public String getQualificationValue() {
     return this.qualificationValue ;
  }

  public void setQualificationNullFlavourDefiningCode(
      NullFlavour qualificationNullFlavourDefiningCode) {
     this.qualificationNullFlavourDefiningCode = qualificationNullFlavourDefiningCode;
  }

  public NullFlavour getQualificationNullFlavourDefiningCode() {
     return this.qualificationNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
