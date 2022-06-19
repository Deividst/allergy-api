package com.text.mining.allergyapi.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDataDto implements Serializable {

    private String text;

}
