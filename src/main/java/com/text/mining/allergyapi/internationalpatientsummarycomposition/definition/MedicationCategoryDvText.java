package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.804660-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_TEXT")
public class MedicationCategoryDvText implements RMEntity, MedicationCategoryChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Category/Category
   * Description: The category of the medication or medication component, with regard to manufacturing or preparation, and the number of ingredients.
   */
  @Path("|value")
  private String categoryValue;

  public void setCategoryValue(String categoryValue) {
     this.categoryValue = categoryValue;
  }

  public String getCategoryValue() {
     return this.categoryValue ;
  }
}
