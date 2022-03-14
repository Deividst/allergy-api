package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:01.801734-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_CODED_TEXT")
public class MedicationCategoryDvCodedText implements RMEntity, MedicationCategoryChoice {
  /**
   * Path: International Patient Summary/Medication Summary/Medication statement/Medication/Category/Category
   * Description: The category of the medication or medication component, with regard to manufacturing or preparation, and the number of ingredients.
   */
  @Path("|defining_code")
  private CategoryDefiningCode categoryDefiningCode;

  public void setCategoryDefiningCode(CategoryDefiningCode categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public CategoryDefiningCode getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }
}
