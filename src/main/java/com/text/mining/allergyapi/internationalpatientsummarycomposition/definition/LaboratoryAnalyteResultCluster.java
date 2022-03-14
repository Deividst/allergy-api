package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.laboratory_test_analyte.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.028902-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class LaboratoryAnalyteResultCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte name
   * Description: The name of the analyte result.
   * Comment: The value for this element is normally supplied in a specialisation, in a template or at run-time to reflect the actual analyte. For example: 'Serum sodium', 'Haemoglobin'. Coding with an external terminology is strongly recommended, such as LOINC, NPU, SNOMED CT, or local lab terminologies.
   */
  @Path("/items[at0024]/value|value")
  private String analyteNameValue;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Tree/Laboratory analyte result/Analyte name/null_flavour
   */
  @Path("/items[at0024]/null_flavour|defining_code")
  private NullFlavour analyteNameNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result
   * Description: The value of the analyte result.
   * Comment: For example '7.3 mmol/l', 'Raised'. The 'Any' data type will need to be constrained to an appropriate data type in a specialisation, a template or at run-time to reflect the actual analyte result. The Quantity data type has reference model attributes that include flags for normal/abnormal, reference ranges and approximations - see https://specifications.openehr.org/releases/RM/latest/data_types.html#_dv_quantity_class for more details.
   */
  @Path("/items[at0001]")
  private List<LaboratoryAnalyteResultAnalyteResultElement> analyteResult;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/Analyte result detail
   * Description: Further detail regarding an individual result.
   */
  @Path("/items[at0014]")
  private List<Cluster> analyteResultDetail;

  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Laboratory analyte result/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setAnalyteNameValue(String analyteNameValue) {
     this.analyteNameValue = analyteNameValue;
  }

  public String getAnalyteNameValue() {
     return this.analyteNameValue ;
  }

  public void setAnalyteNameNullFlavourDefiningCode(
      NullFlavour analyteNameNullFlavourDefiningCode) {
     this.analyteNameNullFlavourDefiningCode = analyteNameNullFlavourDefiningCode;
  }

  public NullFlavour getAnalyteNameNullFlavourDefiningCode() {
     return this.analyteNameNullFlavourDefiningCode ;
  }

  public void setAnalyteResult(List<LaboratoryAnalyteResultAnalyteResultElement> analyteResult) {
     this.analyteResult = analyteResult;
  }

  public List<LaboratoryAnalyteResultAnalyteResultElement> getAnalyteResult() {
     return this.analyteResult ;
  }

  public void setAnalyteResultDetail(List<Cluster> analyteResultDetail) {
     this.analyteResultDetail = analyteResultDetail;
  }

  public List<Cluster> getAnalyteResultDetail() {
     return this.analyteResultDetail ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
