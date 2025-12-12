package com.git.servcie;

import com.git.dto.BookDTO;
import com.git.dto.CityDTO;
import com.git.util.UtilDataCity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {

    public List<CityDTO> getCity()
    {
        return UtilDataCity.cityDTOList(); // <-- llamada
    }

}
