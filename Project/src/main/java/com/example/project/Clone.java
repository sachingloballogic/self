package com.example.project;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Clone {
    private Integer id;
    private String name;
    private String username;
    private BigDecimal mobile;
}
