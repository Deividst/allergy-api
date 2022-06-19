package com.text.mining.allergyapi.dto;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MessageQueueDto implements Serializable {

    private TextDataDto dataDto;
    private List<WordDto> words;

    public MessageQueueDto() {
        this.words = new ArrayList<>();
    }
}
