package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAccessor;

public class MedicationClusterContainment extends Containment {
  public SelectAqlField<MedicationCluster> MEDICATION_CLUSTER = new AqlFieldImp<MedicationCluster>(MedicationCluster.class, "", "MedicationCluster", MedicationCluster.class, this);

  public SelectAqlField<String> NAME_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0132]/value|value", "nameValue", String.class, this);

  public SelectAqlField<NullFlavour> NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0132]/null_flavour|defining_code", "nameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<MedicationFormElement> FORM = new ListAqlFieldImp<MedicationFormElement>(MedicationCluster.class, "/items[at0071]", "form", MedicationFormElement.class, this);

  public SelectAqlField<NullFlavour> CATEGORY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0142]/null_flavour|defining_code", "categoryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> STRENGTH_NUMERATOR_MAGNITUDE = new AqlFieldImp<Double>(MedicationCluster.class, "/items[at0152]/items[at0153]/value|magnitude", "strengthNumeratorMagnitude", Double.class, this);

  public SelectAqlField<String> STRENGTH_NUMERATOR_UNITS = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0152]/items[at0153]/value|units", "strengthNumeratorUnits", String.class, this);

  public SelectAqlField<NullFlavour> STRENGTH_NUMERATOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0152]/items[at0153]/null_flavour|defining_code", "strengthNumeratorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> STRENGTH_NUMERATOR_UNIT_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0152]/items[at0004]/value|value", "strengthNumeratorUnitValue", String.class, this);

  public SelectAqlField<NullFlavour> STRENGTH_NUMERATOR_UNIT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0152]/items[at0004]/null_flavour|defining_code", "strengthNumeratorUnitNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> STRENGTH_DENOMINATOR_MAGNITUDE = new AqlFieldImp<Double>(MedicationCluster.class, "/items[at0152]/items[at0157]/value|magnitude", "strengthDenominatorMagnitude", Double.class, this);

  public SelectAqlField<String> STRENGTH_DENOMINATOR_UNITS = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0152]/items[at0157]/value|units", "strengthDenominatorUnits", String.class, this);

  public SelectAqlField<NullFlavour> STRENGTH_DENOMINATOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0152]/items[at0157]/null_flavour|defining_code", "strengthDenominatorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> STRENGTH_DENOMINATOR_UNIT_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0152]/items[at0005]/value|value", "strengthDenominatorUnitValue", String.class, this);

  public SelectAqlField<NullFlavour> STRENGTH_DENOMINATOR_UNIT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0152]/items[at0005]/null_flavour|defining_code", "strengthDenominatorUnitNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> UNIT_OF_PRESENTATION_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0158]/value|value", "unitOfPresentationValue", String.class, this);

  public SelectAqlField<NullFlavour> UNIT_OF_PRESENTATION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0158]/null_flavour|defining_code", "unitOfPresentationNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> STRENGTH_CONCENTRATION_MAGNITUDE = new AqlFieldImp<Double>(MedicationCluster.class, "/items[at0115]/value|magnitude", "strengthConcentrationMagnitude", Double.class, this);

  public SelectAqlField<String> STRENGTH_CONCENTRATION_UNITS = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0115]/value|units", "strengthConcentrationUnits", String.class, this);

  public SelectAqlField<NullFlavour> STRENGTH_CONCENTRATION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0115]/null_flavour|defining_code", "strengthConcentrationNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> MANUFACTURER_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0151]/value|value", "manufacturerValue", String.class, this);

  public SelectAqlField<NullFlavour> MANUFACTURER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0151]/null_flavour|defining_code", "manufacturerNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<MedicationBatchIdElement> BATCH_ID = new ListAqlFieldImp<MedicationBatchIdElement>(MedicationCluster.class, "/items[at0150]", "batchId", MedicationBatchIdElement.class, this);

  public SelectAqlField<TemporalAccessor> EXPIRY_VALUE = new AqlFieldImp<TemporalAccessor>(MedicationCluster.class, "/items[at0003]/value|value", "expiryValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> EXPIRY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0003]/null_flavour|defining_code", "expiryNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> CONSTITUENT = new ListAqlFieldImp<Cluster>(MedicationCluster.class, "/items[at0138]", "constituent", Cluster.class, this);

  public SelectAqlField<Double> AMOUNT_MAGNITUDE = new AqlFieldImp<Double>(MedicationCluster.class, "/items[at0139]/value|magnitude", "amountMagnitude", Double.class, this);

  public SelectAqlField<String> AMOUNT_UNITS = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0139]/value|units", "amountUnits", String.class, this);

  public SelectAqlField<NullFlavour> AMOUNT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0139]/null_flavour|defining_code", "amountNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> AMOUNT_UNIT_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0008]/value|value", "amountUnitValue", String.class, this);

  public SelectAqlField<NullFlavour> AMOUNT_UNIT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0008]/null_flavour|defining_code", "amountUnitNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> ALTERNATE_AMOUNT_MAGNITUDE = new AqlFieldImp<Double>(MedicationCluster.class, "/items[at0148]/value|magnitude", "alternateAmountMagnitude", Double.class, this);

  public SelectAqlField<String> ALTERNATE_AMOUNT_UNITS = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0148]/value|units", "alternateAmountUnits", String.class, this);

  public SelectAqlField<NullFlavour> ALTERNATE_AMOUNT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0148]/null_flavour|defining_code", "alternateAmountNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> ALTERNATE_AMOUNT_UNIT_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0007]/value|value", "alternateAmountUnitValue", String.class, this);

  public SelectAqlField<NullFlavour> ALTERNATE_AMOUNT_UNIT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0007]/null_flavour|defining_code", "alternateAmountUnitNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> ROLE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0127]/null_flavour|defining_code", "roleNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(MedicationCluster.class, "/items[at0133]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicationCluster.class, "/items[at0133]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_DETAILS = new ListAqlFieldImp<Cluster>(MedicationCluster.class, "/items[at0141]", "structuredDetails", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(MedicationCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<MedicationCategoryChoice> CATEGORY = new AqlFieldImp<MedicationCategoryChoice>(MedicationCluster.class, "/items[at0142]/value", "category", MedicationCategoryChoice.class, this);

  public SelectAqlField<MedicationRoleChoice> ROLE = new AqlFieldImp<MedicationRoleChoice>(MedicationCluster.class, "/items[at0127]/value", "role", MedicationRoleChoice.class, this);

  private MedicationClusterContainment() {
    super("openEHR-EHR-CLUSTER.medication.v1");
  }

  public static MedicationClusterContainment getInstance() {
    return new MedicationClusterContainment();
  }
}
