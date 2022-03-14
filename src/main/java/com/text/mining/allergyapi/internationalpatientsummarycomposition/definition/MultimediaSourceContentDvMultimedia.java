package com.text.mining.allergyapi.internationalpatientsummarycomposition.definition;

import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-27T22:12:02.042007-03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("DV_MULTIMEDIA")
public class MultimediaSourceContentDvMultimedia implements RMEntity, MultimediaSourceContentChoice {
  /**
   * Path: International Patient Summary/Diagnostic Results/Laboratory test result/Any event/Multimedia source/Content/Content
   * Description: Digital representation of the resource.
   */
  @Path("")
  private DvMultimedia content;

  public void setContent(DvMultimedia content) {
     this.content = content;
  }

  public DvMultimedia getContent() {
     return this.content ;
  }
}
