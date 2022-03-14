package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datastructures.ItemTree;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.120908-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface ImagingExaminationResultAnyEventChoice {
  NullFlavour getConclusionNullFlavourDefiningCode();

  void setConclusionNullFlavourDefiningCode(NullFlavour conclusionNullFlavourDefiningCode);

  NullFlavour getComparisonWithPreviousNullFlavourDefiningCode();

  void setComparisonWithPreviousNullFlavourDefiningCode(
      NullFlavour comparisonWithPreviousNullFlavourDefiningCode);

  MultimediaSourceCluster getMultimediaSource();

  void setMultimediaSource(MultimediaSourceCluster multimediaSource);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getFindingsValue();

  void setFindingsValue(String findingsValue);

  List<ImagingExaminationResultImagingDifferentialDiagnosisElement> getImagingDifferentialDiagnosis(
      );

  void setImagingDifferentialDiagnosis(
      List<ImagingExaminationResultImagingDifferentialDiagnosisElement> imagingDifferentialDiagnosis);

  String getAnatomicalSiteValue();

  void setAnatomicalSiteValue(String anatomicalSiteValue);

  ImagingFindingCluster getImagingFinding();

  void setImagingFinding(ImagingFindingCluster imagingFinding);

  String getTestNameValue();

  void setTestNameValue(String testNameValue);

  NullFlavour getTestNameNullFlavourDefiningCode();

  void setTestNameNullFlavourDefiningCode(NullFlavour testNameNullFlavourDefiningCode);

  OverallResultStatusDefiningCode getOverallResultStatusDefiningCode();

  void setOverallResultStatusDefiningCode(
      OverallResultStatusDefiningCode overallResultStatusDefiningCode);

  NullFlavour getFindingsNullFlavourDefiningCode();

  void setFindingsNullFlavourDefiningCode(NullFlavour findingsNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getAnatomicalSiteNullFlavourDefiningCode();

  void setAnatomicalSiteNullFlavourDefiningCode(NullFlavour anatomicalSiteNullFlavourDefiningCode);

  ItemTree getTree();

  void setTree(ItemTree tree);

  String getComparisonWithPreviousValue();

  void setComparisonWithPreviousValue(String comparisonWithPreviousValue);

  String getConclusionValue();

  void setConclusionValue(String conclusionValue);

  NullFlavour getModalityNullFlavourDefiningCode();

  void setModalityNullFlavourDefiningCode(NullFlavour modalityNullFlavourDefiningCode);

  NullFlavour getOverallResultStatusNullFlavourDefiningCode();

  void setOverallResultStatusNullFlavourDefiningCode(
      NullFlavour overallResultStatusNullFlavourDefiningCode);

  String getModalityValue();

  void setModalityValue(String modalityValue);

  List<Cluster> getStructuredAnatomicalSite();

  void setStructuredAnatomicalSite(List<Cluster> structuredAnatomicalSite);

  List<ImagingExaminationResultImagingDiagnosisElement> getImagingDiagnosis();

  void setImagingDiagnosis(List<ImagingExaminationResultImagingDiagnosisElement> imagingDiagnosis);
}
