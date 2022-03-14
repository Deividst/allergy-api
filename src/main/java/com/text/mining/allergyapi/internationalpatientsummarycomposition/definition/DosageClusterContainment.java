package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class DosageClusterContainment extends Containment {
  public SelectAqlField<DosageCluster> DOSAGE_CLUSTER = new AqlFieldImp<DosageCluster>(DosageCluster.class, "", "DosageCluster", DosageCluster.class, this);

  public SelectAqlField<Double> DOSE_AMOUNT_MAGNITUDE = new AqlFieldImp<Double>(DosageCluster.class, "/items[at0144]/value|magnitude", "doseAmountMagnitude", Double.class, this);

  public SelectAqlField<String> DOSE_AMOUNT_UNITS = new AqlFieldImp<String>(DosageCluster.class, "/items[at0144]/value|units", "doseAmountUnits", String.class, this);

  public SelectAqlField<Double> UPPER_MAGNITUDE = new AqlFieldImp<Double>(DosageCluster.class, "/items[at0144]/value/upper|magnitude", "upperMagnitude", Double.class, this);

  public SelectAqlField<String> UPPER_UNITS = new AqlFieldImp<String>(DosageCluster.class, "/items[at0144]/value/upper|units", "upperUnits", String.class, this);

  public SelectAqlField<Double> LOWER_MAGNITUDE = new AqlFieldImp<Double>(DosageCluster.class, "/items[at0144]/value/lower|magnitude", "lowerMagnitude", Double.class, this);

  public SelectAqlField<String> LOWER_UNITS = new AqlFieldImp<String>(DosageCluster.class, "/items[at0144]/value/lower|units", "lowerUnits", String.class, this);

  public SelectAqlField<Boolean> LOWER_INCLUDED = new AqlFieldImp<Boolean>(DosageCluster.class, "/items[at0144]/value/lower_included", "lowerIncluded", Boolean.class, this);

  public SelectAqlField<Boolean> UPPER_INCLUDED = new AqlFieldImp<Boolean>(DosageCluster.class, "/items[at0144]/value/upper_included", "upperIncluded", Boolean.class, this);

  public SelectAqlField<NullFlavour> DOSE_AMOUNT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DosageCluster.class, "/items[at0144]/null_flavour|defining_code", "doseAmountNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DOSE_UNIT_VALUE = new AqlFieldImp<String>(DosageCluster.class, "/items[at0145]/value|value", "doseUnitValue", String.class, this);

  public SelectAqlField<NullFlavour> DOSE_UNIT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DosageCluster.class, "/items[at0145]/null_flavour|defining_code", "doseUnitNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> DOSE_FORMULA_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DosageCluster.class, "/items[at0135]/null_flavour|defining_code", "doseFormulaNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DOSE_DESCRIPTION_VALUE = new AqlFieldImp<String>(DosageCluster.class, "/items[at0178]/value|value", "doseDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DOSE_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DosageCluster.class, "/items[at0178]/null_flavour|defining_code", "doseDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TimingDailyCluster> TIMING_DAILY = new AqlFieldImp<TimingDailyCluster>(DosageCluster.class, "/items[openEHR-EHR-CLUSTER.timing_daily.v1]", "timingDaily", TimingDailyCluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DosageCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<DosageDoseFormulaChoice> DOSE_FORMULA = new AqlFieldImp<DosageDoseFormulaChoice>(DosageCluster.class, "/items[at0135]/value", "doseFormula", DosageDoseFormulaChoice.class, this);

  private DosageClusterContainment() {
    super("openEHR-EHR-CLUSTER.dosage.v1");
  }

  public static DosageClusterContainment getInstance() {
    return new DosageClusterContainment();
  }
}
