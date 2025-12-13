package com.git.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalDTO {

    private String breed;
    private String gender;
    private Integer age;
    private Integer height;
    private Integer weight;
}
