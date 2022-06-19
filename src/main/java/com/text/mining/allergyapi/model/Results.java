package com.text.mining.allergyapi.model;

import com.text.mining.allergyapi.enums.WordType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TB_RESULT")
public class Results implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String wordtext;

    private BigDecimal probability;

    @Enumerated(EnumType.STRING)
    private WordType type;

    private String fileId;

}
