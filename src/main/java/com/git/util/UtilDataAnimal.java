package com.git.util;

import com.git.dto.AnimalDTO;
import com.git.dto.BookDTO;

import java.util.List;

public class UtilDataAnimal {


    public static List<AnimalDTO> animalDTOList() {
        return List.of(
                new AnimalDTO("Dog","M",5,185,12),
                new AnimalDTO("Dog","F",3,52,15),
                new AnimalDTO("Cat","M",12,84,5),
                new AnimalDTO("Cat","F",7,77,7),
                new AnimalDTO("Dog","M",1,33,14)
                );

    }
}
