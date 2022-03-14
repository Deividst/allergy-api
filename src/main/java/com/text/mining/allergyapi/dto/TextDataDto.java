package com.text.mining.allergyapi.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextDataDto implements Serializable {

    private String text;
    private String token;
    private String url;

}
