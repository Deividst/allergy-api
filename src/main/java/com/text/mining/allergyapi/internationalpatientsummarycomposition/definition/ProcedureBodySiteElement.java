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
    date = "2021-09-27T22:12:01.959070-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ProcedureBodySiteElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Body site
   * Description: Identification of the body site for the procedure.
   * Comment: Occurrences for this data element are unbounded to allow for clinical scenarios such as removing multiple skin lesions in different places, but where all of the other attributes are identical. Use this data element to record simple terms or precoordinated anatomical locations. If the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the 'Procedure detail' SLOT in this archetype. If the anatomical location is included in the 'Procedure name' via precoordinated codes, this data element becomes redundant.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/Tree/Body site/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/History of Procedures/Procedure/feeder_audit
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
