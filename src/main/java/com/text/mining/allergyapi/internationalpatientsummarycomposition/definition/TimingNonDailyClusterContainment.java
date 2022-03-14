package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAmount;

public class TimingNonDailyClusterContainment extends Containment {
  public SelectAqlField<TimingNonDailyCluster> TIMING_NON_DAILY_CLUSTER = new AqlFieldImp<TimingNonDailyCluster>(TimingNonDailyCluster.class, "", "TimingNonDailyCluster", TimingNonDailyCluster.class, this);

  public SelectAqlField<TemporalAmount> REPETITION_INTERVAL_VALUE = new AqlFieldImp<TemporalAmount>(TimingNonDailyCluster.class, "/items[at0002]/value|value", "repetitionIntervalValue", TemporalAmount.class, this);

  public SelectAqlField<NullFlavour> REPETITION_INTERVAL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingNonDailyCluster.class, "/items[at0002]/null_flavour|defining_code", "repetitionIntervalNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> FREQUENCY_MAGNITUDE = new AqlFieldImp<Double>(TimingNonDailyCluster.class, "/items[at0014]/value|magnitude", "frequencyMagnitude", Double.class, this);

  public SelectAqlField<String> FREQUENCY_UNITS = new AqlFieldImp<String>(TimingNonDailyCluster.class, "/items[at0014]/value|units", "frequencyUnits", String.class, this);

  public SelectAqlField<Double> UPPER_MAGNITUDE = new AqlFieldImp<Double>(TimingNonDailyCluster.class, "/items[at0014]/value/upper|magnitude", "upperMagnitude", Double.class, this);

  public SelectAqlField<String> UPPER_UNITS = new AqlFieldImp<String>(TimingNonDailyCluster.class, "/items[at0014]/value/upper|units", "upperUnits", String.class, this);

  public SelectAqlField<Double> LOWER_MAGNITUDE = new AqlFieldImp<Double>(TimingNonDailyCluster.class, "/items[at0014]/value/lower|magnitude", "lowerMagnitude", Double.class, this);

  public SelectAqlField<String> LOWER_UNITS = new AqlFieldImp<String>(TimingNonDailyCluster.class, "/items[at0014]/value/lower|units", "lowerUnits", String.class, this);

  public SelectAqlField<Boolean> LOWER_INCLUDED = new AqlFieldImp<Boolean>(TimingNonDailyCluster.class, "/items[at0014]/value/lower_included", "lowerIncluded", Boolean.class, this);

  public SelectAqlField<Boolean> UPPER_INCLUDED = new AqlFieldImp<Boolean>(TimingNonDailyCluster.class, "/items[at0014]/value/upper_included", "upperIncluded", Boolean.class, this);

  public SelectAqlField<NullFlavour> FREQUENCY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingNonDailyCluster.class, "/items[at0014]/null_flavour|defining_code", "frequencyNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<TimingNonDailySpecificDateElement> SPECIFIC_DATE = new ListAqlFieldImp<TimingNonDailySpecificDateElement>(TimingNonDailyCluster.class, "/items[at0001]", "specificDate", TimingNonDailySpecificDateElement.class, this);

  public ListSelectAqlField<TimingNonDailySpecificDayOfWeekElement> SPECIFIC_DAY_OF_WEEK = new ListAqlFieldImp<TimingNonDailySpecificDayOfWeekElement>(TimingNonDailyCluster.class, "/items[at0003]", "specificDayOfWeek", TimingNonDailySpecificDayOfWeekElement.class, this);

  public ListSelectAqlField<TimingNonDailySpecificDayOfMonthElement> SPECIFIC_DAY_OF_MONTH = new ListAqlFieldImp<TimingNonDailySpecificDayOfMonthElement>(TimingNonDailyCluster.class, "/items[at0004]", "specificDayOfMonth", TimingNonDailySpecificDayOfMonthElement.class, this);

  public SelectAqlField<String> TIMING_DESCRIPTION_VALUE = new AqlFieldImp<String>(TimingNonDailyCluster.class, "/items[at0021]/value|value", "timingDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> TIMING_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingNonDailyCluster.class, "/items[at0021]/null_flavour|defining_code", "timingDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<TimingNonDailySpecificEventCluster> SPECIFIC_EVENT = new ListAqlFieldImp<TimingNonDailySpecificEventCluster>(TimingNonDailyCluster.class, "/items[at0006]", "specificEvent", TimingNonDailySpecificEventCluster.class, this);

  public SelectAqlField<TemporalAmount> ON_VALUE = new AqlFieldImp<TemporalAmount>(TimingNonDailyCluster.class, "/items[at0010]/items[at0011]/value|value", "onValue", TemporalAmount.class, this);

  public SelectAqlField<NullFlavour> ON_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingNonDailyCluster.class, "/items[at0010]/items[at0011]/null_flavour|defining_code", "onNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAmount> OFF_VALUE = new AqlFieldImp<TemporalAmount>(TimingNonDailyCluster.class, "/items[at0010]/items[at0012]/value|value", "offValue", TemporalAmount.class, this);

  public SelectAqlField<NullFlavour> OFF_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingNonDailyCluster.class, "/items[at0010]/items[at0012]/null_flavour|defining_code", "offNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Long> REPETITIONS_MAGNITUDE = new AqlFieldImp<Long>(TimingNonDailyCluster.class, "/items[at0010]/items[at0013]/value|magnitude", "repetitionsMagnitude", Long.class, this);

  public SelectAqlField<NullFlavour> REPETITIONS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(TimingNonDailyCluster.class, "/items[at0010]/items[at0013]/null_flavour|defining_code", "repetitionsNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(TimingNonDailyCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private TimingNonDailyClusterContainment() {
    super("openEHR-EHR-CLUSTER.timing_nondaily.v1");
  }

  public static TimingNonDailyClusterContainment getInstance() {
    return new TimingNonDailyClusterContainment();
  }
}
