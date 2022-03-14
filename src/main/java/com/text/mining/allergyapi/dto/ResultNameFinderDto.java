package com.text.mining.allergyapi.dto;

import lombok.*;
import opennlp.tools.util.Span;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultNameFinderDto {

    private Span[] spans;
    private double[] spansProbability;

}
