package com.git.servcie;

import com.git.dto.AnimalDTO;
import com.git.dto.BookDTO;
import com.git.util.UtilDataAnimal;
import com.git.util.UtilDataBook;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    public List<AnimalDTO> getAnimal()
    {
        return UtilDataAnimal.animalDTOList(); // <-- llamada
    }
}
