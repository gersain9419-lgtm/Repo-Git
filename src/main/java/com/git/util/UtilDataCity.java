package com.git.util;

import com.git.dto.BookDTO;
import com.git.dto.CityDTO;

import java.util.List;

public class UtilDataCity {




    public static List<CityDTO> cityDTOList () {
        return List.of(
                new CityDTO("Amaxac", "TLaxcala", 25, "Tlaxcala", 90620, "Venustiano caranza #44"),
                new CityDTO("Tlalpan", "CDMX", 31, "CDMX", 52054, "16 de septiembre #95"),
                new CityDTO("Coyoacan", "CDMX", 04, "CDMX", 52089, "Francisoc I Madero #1523"),
                new CityDTO("Santa Ana", "TLaxcala", 16, "Tlaxcala", 90300, "Texcalas # 44"),
                new CityDTO("Contreras", "CDMX", 20, "CDMC", 52011, "Barranca de l muerto #123")
        );
    }


}
