package com.git.controller;


import com.git.dto.BookDTO;
import com.git.dto.CityDTO;
import com.git.servcie.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {
 private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping
    public List<CityDTO> getCity(){
        return cityService.getCity();
    }

    @GetMapping("country")
    public String getCountry(){
        return "Century";
    }

    @GetMapping("zip")
    public String getZip(){
        return "Zip 956";
    }


}
