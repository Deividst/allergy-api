package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;
import java.net.URI;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.042226-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_URI")
public class MultimediaSourceContentDvUri implements RMEntity, MultimediaSourceContentChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Content/Content
   * Description: Digital representation of the resource.
   */
  @Path("|value")
  private URI contentValue;

  public void setContentValue(URI contentValue) {
     this.contentValue = contentValue;
  }

  public URI getContentValue() {
     return this.contentValue ;
  }
}
