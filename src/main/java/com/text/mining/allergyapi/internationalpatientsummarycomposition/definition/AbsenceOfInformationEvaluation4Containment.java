package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAccessor;

public class AbsenceOfInformationEvaluation4Containment extends Containment {
  public SelectAqlField<AbsenceOfInformationEvaluation4> ABSENCE_OF_INFORMATION_EVALUATION4 = new AqlFieldImp<AbsenceOfInformationEvaluation4>(AbsenceOfInformationEvaluation4.class, "", "AbsenceOfInformationEvaluation4", AbsenceOfInformationEvaluation4.class, this);

  public SelectAqlField<String> ABSENCE_STATEMENT_VALUE = new AqlFieldImp<String>(AbsenceOfInformationEvaluation4.class, "/data[at0001]/items[at0002]/value|value", "absenceStatementValue", String.class, this);

  public SelectAqlField<NullFlavour> ABSENCE_STATEMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AbsenceOfInformationEvaluation4.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "absenceStatementNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(AbsenceOfInformationEvaluation4.class, "/protocol[at0003]/items[at0004]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AbsenceOfInformationEvaluation4.class, "/protocol[at0003]/items[at0004]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(AbsenceOfInformationEvaluation4.class, "/protocol[at0003]/items[at0006]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AbsenceOfInformationEvaluation4.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AbsenceOfInformationEvaluation4.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AbsenceOfInformationEvaluation4.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private AbsenceOfInformationEvaluation4Containment() {
    super("openEHR-EHR-EVALUATION.absence.v2");
  }

  public static AbsenceOfInformationEvaluation4Containment getInstance() {
    return new AbsenceOfInformationEvaluation4Containment();
  }
}
