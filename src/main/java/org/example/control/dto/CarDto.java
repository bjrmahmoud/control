package org.example.control.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CarDto {
    private String model;
    private String color;
    private String matricule;
    private Float price;
}
