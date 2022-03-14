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
    date = "2021-09-27T22:12:02.262199-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ServiceRequestIntentElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Intent
   * Description: Description of the intent for the request.
   * Comment: For example: a referral to a specialist may have the intent of the specialist taking over responsibility for care of the patient, or it may be to provide a second opinion on treatment options. Coding of the 'Intent' with a coding system is desirable, if available. This data element allows multiple occurrences to enable the user to record a multiple responses, if required.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/Tree/Intent/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/Plan of Care/Service request/Current Activity/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
