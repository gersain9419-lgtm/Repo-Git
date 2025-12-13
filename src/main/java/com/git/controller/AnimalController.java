package com.git.controller;


import com.git.dto.AnimalDTO;
import com.git.servcie.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {


    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<AnimalDTO> getAnimal(){
        return animalService.getAnimal();
    }

    @GetMapping("animal")
    public String getAnimals(){
        return "Steven Perez Cortes";
    }

    @GetMapping("size")
    public String getSize(){
        return "Not pages";
    }

}
