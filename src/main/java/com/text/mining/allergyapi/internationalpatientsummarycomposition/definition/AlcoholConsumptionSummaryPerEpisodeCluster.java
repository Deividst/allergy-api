package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.214046-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class AlcoholConsumptionSummaryPerEpisodeCluster implements LocatableEntity {
  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Per episode/Typical consumption (alcohol units)
   * Description: Estimate of number of alcohol units consumed in the specified time period.
   */
  @Path("/items[at0023]/value|magnitude")
  private Double typicalConsumptionAlcoholUnitsMagnitude;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Per episode/Typical consumption (alcohol units)
   * Description: Estimate of number of alcohol units consumed in the specified time period.
   */
  @Path("/items[at0023]/value|units")
  private String typicalConsumptionAlcoholUnitsUnits;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Tree/Per episode/Typical consumption (alcohol units)/null_flavour
   */
  @Path("/items[at0023]/null_flavour|defining_code")
  private NullFlavour typicalConsumptionAlcoholUnitsNullFlavourDefiningCode;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Per episode/Episode details
   * Description: Additional structured details about the specified episode of alcohol consumption.
   */
  @Path("/items[at0026]")
  private List<Cluster> episodeDetails;

  /**
   * Path: International Patient Summary/Social History/Alcohol consumption summary/Per episode/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setTypicalConsumptionAlcoholUnitsMagnitude(
      Double typicalConsumptionAlcoholUnitsMagnitude) {
     this.typicalConsumptionAlcoholUnitsMagnitude = typicalConsumptionAlcoholUnitsMagnitude;
  }

  public Double getTypicalConsumptionAlcoholUnitsMagnitude() {
     return this.typicalConsumptionAlcoholUnitsMagnitude ;
  }

  public void setTypicalConsumptionAlcoholUnitsUnits(String typicalConsumptionAlcoholUnitsUnits) {
     this.typicalConsumptionAlcoholUnitsUnits = typicalConsumptionAlcoholUnitsUnits;
  }

  public String getTypicalConsumptionAlcoholUnitsUnits() {
     return this.typicalConsumptionAlcoholUnitsUnits ;
  }

  public void setTypicalConsumptionAlcoholUnitsNullFlavourDefiningCode(
      NullFlavour typicalConsumptionAlcoholUnitsNullFlavourDefiningCode) {
     this.typicalConsumptionAlcoholUnitsNullFlavourDefiningCode = typicalConsumptionAlcoholUnitsNullFlavourDefiningCode;
  }

  public NullFlavour getTypicalConsumptionAlcoholUnitsNullFlavourDefiningCode() {
     return this.typicalConsumptionAlcoholUnitsNullFlavourDefiningCode ;
  }

  public void setEpisodeDetails(List<Cluster> episodeDetails) {
     this.episodeDetails = episodeDetails;
  }

  public List<Cluster> getEpisodeDetails() {
     return this.episodeDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
