package com.text.mining.allergyapi.dto;

import com.text.mining.allergyapi.model.MedicalInstitution;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextDataDto implements Serializable {

    private String text;
    private MedicalInstitution institution;

}
