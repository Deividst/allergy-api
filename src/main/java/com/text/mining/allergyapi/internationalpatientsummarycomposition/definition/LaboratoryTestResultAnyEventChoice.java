package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.053204-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface LaboratoryTestResultAnyEventChoice {
  String getTestNameValue();

  void setTestNameValue(String testNameValue);

  SpecimenCluster getSpecimen();

  void setSpecimen(SpecimenCluster specimen);

  NullFlavour getInterpretationNullFlavourDefiningCode();

  void setInterpretationNullFlavourDefiningCode(NullFlavour interpretationNullFlavourDefiningCode);

  MultimediaSourceCluster getMultimediaSource();

  void setMultimediaSource(MultimediaSourceCluster multimediaSource);

  List<Cluster> getStructuredConfoundingFactors();

  void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getInterpretationValue();

  void setInterpretationValue(String interpretationValue);

  LaboratoryAnalyteResultCluster getLaboratoryAnalyteResult();

  void setLaboratoryAnalyteResult(LaboratoryAnalyteResultCluster laboratoryAnalyteResult);

  NullFlavour getDiagnosticServiceCategoryNullFlavourDefiningCode();

  void setDiagnosticServiceCategoryNullFlavourDefiningCode(
      NullFlavour diagnosticServiceCategoryNullFlavourDefiningCode);

  String getDiagnosticServiceCategoryValue();

  void setDiagnosticServiceCategoryValue(String diagnosticServiceCategoryValue);

  NullFlavour getTestNameNullFlavourDefiningCode();

  void setTestNameNullFlavourDefiningCode(NullFlavour testNameNullFlavourDefiningCode);

  List<Cluster> getStructuredTestDiagnosis();

  void setStructuredTestDiagnosis(List<Cluster> structuredTestDiagnosis);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
