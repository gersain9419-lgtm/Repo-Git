package com.git.util;

import com.git.dto.BookDTO;

import java.util.List;

public class UtilDataBook {


    public static List<BookDTO> bookDTOList() {
        return List.of(
                new BookDTO("The prince","Juana",120,485),
                new BookDTO("The noise","Pedro",130,132),
                new BookDTO("The book","Miguel",560,12256),
                new BookDTO("The choice","Francis",1250,1500)
        );

    }


}
