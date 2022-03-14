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
    date = "2021-09-27T22:12:01.773217-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class MedicationFormElement implements LocatableEntity {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Form
   * Description: The formulation or presentation of the medication or medication component.
   * Comment: For example: 'tablet', 'capsule', 'cream', 'infusion fluid' or 'inhalation powder'. Coding of the form with a terminology is preferred, where possible. Medicines catalogues may differentiate between administrable form 'solution for injection' and product form 'powder for solution for injection'. The recorded form will depend on the exact context of use but administrable form is likely to be used in most instances.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Tree/Medication/Form/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/feeder_audit
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
