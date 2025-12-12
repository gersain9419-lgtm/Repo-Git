package com.git.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CityDTO {

    private String city;
    private String country;
    private Integer district;
    private String state;
    private Integer zip;
    private String address;
}
