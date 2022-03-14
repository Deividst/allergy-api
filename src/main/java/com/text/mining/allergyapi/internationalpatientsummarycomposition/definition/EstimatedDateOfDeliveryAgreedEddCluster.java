package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.202325-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class EstimatedDateOfDeliveryAgreedEddCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Agreed EDD/Agreed date
   * Description: The EDD which is to be used as the basis for clinical decision-making.
   */
  @Path("/items[at0010]/value|value")
  private TemporalAccessor agreedDateValue;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Item tree/Agreed EDD/Agreed date/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour agreedDateNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Pregnancy/Estimated date of delivery/Agreed EDD/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setAgreedDateValue(TemporalAccessor agreedDateValue) {
     this.agreedDateValue = agreedDateValue;
  }

  public TemporalAccessor getAgreedDateValue() {
     return this.agreedDateValue ;
  }

  public void setAgreedDateNullFlavourDefiningCode(NullFlavour agreedDateNullFlavourDefiningCode) {
     this.agreedDateNullFlavourDefiningCode = agreedDateNullFlavourDefiningCode;
  }

  public NullFlavour getAgreedDateNullFlavourDefiningCode() {
     return this.agreedDateNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
