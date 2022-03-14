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
    date = "2021-09-27T22:12:02.101527-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ImagingFindingPresenceElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/Presence?
   * Description: The presence or absence of the finding.
   * Comment: For example '7.3 mmol/l', 'Raised'. The 'Any' data type will need to be constrained to an appropriate data type in a specialisation, a template or at run-time to reflect the actual analyte result. The Quantity data type has reference model attributes that include flags for normal/abnormal, reference ranges and approximations - see https://specifications.openehr.org/releases/RM/latest/data_types.html#_dv_quantity_class for more details.
   */
  @Path("/value|defining_code")
  private PresenceDefiningCode value;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Tree/Imaging finding/Presence?/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/Diagnostic Results/Imaging examination result/Any event/Imaging finding/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(PresenceDefiningCode value) {
     this.value = value;
  }

  public PresenceDefiningCode getValue() {
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
