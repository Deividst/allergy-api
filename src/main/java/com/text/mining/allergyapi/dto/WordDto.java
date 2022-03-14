package com.text.mining.allergyapi.dto;

import com.text.mining.allergyapi.enums.WordType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WordDto {

    private String wordtext;
    private double probability;
    private WordType type;

}
