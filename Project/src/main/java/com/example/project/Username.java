package com.example.project;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Username {

    @Id
    private Integer id;
    private String name;
    private String username;
    private BigDecimal mobile;
}
