package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAmount;

public class TimingDailyClusterContainment extends Containment {
  public SelectAqlField<TimingDailyCluster> TIMING_DAILY_CLUSTER = new AqlFieldImp<TimingDailyCluster>(TimingDailyCluster.class, "", "TimingDailyCluster", TimingDailyCluster.class, this);

  public SelectAqlField<Double> FREQUENCY_MAGNITUDE = new AqlFieldImp<Double>(TimingDailyCluster.class, "/items[at0003]/value|magnitude", "frequencyMagnitude", Double.class, this);

  public SelectAqlField<String> FREQUENCY_UNITS = new AqlFieldImp<String>(TimingDailyCluster.class, "/items[at0003]/value|units", "frequencyUnits", String.class, this);

  public SelectAqlField<Double> UPPER_MAGNITUDE = new AqlFieldImp<Double>(TimingDailyCluster.class, "/items[at0003]/value/upper|magnitude", "upperMagnitude", Double.class, this);

  public SelectAqlField<String> UPPER_UNITS = new AqlFieldImp<String>(TimingDailyCluster.class, "/items[at0003]/value/upper|units", "upperUnits", String.class, this);

  public SelectAqlField<Double> LOWER_MAGNITUDE = new AqlFieldImp<Double>(TimingDailyCluster.class, "/items[at0003]/value/lower|magnitude", "lowerMagnitude", Double.class, this);

  public SelectAqlField<String> LOWER_UNITS = new AqlFieldImp<String>(TimingDailyCluster.class, "/items[at0003]/value/lower|units", "lowerUnits", String.class, this);

  public SelectAqlField<Boolean> LOWER_INCLUDED = new AqlFieldImp<Boolean>(TimingDailyCluster.class, "/items[at0003]/value/lower_included", "lowerIncluded", Boolean.class, this);

  public SelectAqlField<Boolean> UPPER_INCLUDED = new AqlFieldImp<Boolean>(TimingDailyCluster.class, "/items[at0003]/value/upper_included", "upperIncluded", Boolean.class, this);

  public SelectAqlField<NullFlavour> FREQUENCY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingDailyCluster.class, "/items[at0003]/null_flavour|defining_code", "frequencyNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAmount> INTERVAL_VALUE = new AqlFieldImp<TemporalAmount>(TimingDailyCluster.class, "/items[at0014]/value|value", "intervalValue", TemporalAmount.class, this);

  public SelectAqlField<NullFlavour> INTERVAL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingDailyCluster.class, "/items[at0014]/null_flavour|defining_code", "intervalNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<TimingDailySpecificTimeElement> SPECIFIC_TIME = new ListAqlFieldImp<TimingDailySpecificTimeElement>(TimingDailyCluster.class, "/items[at0004]", "specificTime", TimingDailySpecificTimeElement.class, this);

  public SelectAqlField<String> TIMING_DESCRIPTION_VALUE = new AqlFieldImp<String>(TimingDailyCluster.class, "/items[at0027]/value|value", "timingDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> TIMING_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingDailyCluster.class, "/items[at0027]/null_flavour|defining_code", "timingDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Boolean> EXACT_TIMING_CRITICAL_VALUE = new AqlFieldImp<Boolean>(TimingDailyCluster.class, "/items[at0023]/value|value", "exactTimingCriticalValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> EXACT_TIMING_CRITICAL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingDailyCluster.class, "/items[at0023]/null_flavour|defining_code", "exactTimingCriticalNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Boolean> AS_REQUIRED_VALUE = new AqlFieldImp<Boolean>(TimingDailyCluster.class, "/items[at0024]/value|value", "asRequiredValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> AS_REQUIRED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingDailyCluster.class, "/items[at0024]/null_flavour|defining_code", "asRequiredNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> AS_REQUIRED_CRITERION_VALUE = new AqlFieldImp<String>(TimingDailyCluster.class, "/items[at0025]/value|value", "asRequiredCriterionValue", String.class, this);

  public SelectAqlField<NullFlavour> AS_REQUIRED_CRITERION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingDailyCluster.class, "/items[at0025]/null_flavour|defining_code", "asRequiredCriterionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<TimingDailySpecificEventCluster> SPECIFIC_EVENT = new ListAqlFieldImp<TimingDailySpecificEventCluster>(TimingDailyCluster.class, "/items[at0039]", "specificEvent", TimingDailySpecificEventCluster.class, this);

  public ListSelectAqlField<TimingDailyOnOffCycleCluster> ON_OFF_CYCLE = new ListAqlFieldImp<TimingDailyOnOffCycleCluster>(TimingDailyCluster.class, "/items[at0035]", "onOffCycle", TimingDailyOnOffCycleCluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(TimingDailyCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private TimingDailyClusterContainment() {
    super("openEHR-EHR-CLUSTER.timing_daily.v1");
  }

  public static TimingDailyClusterContainment getInstance() {
    return new TimingDailyClusterContainment();
  }
}
