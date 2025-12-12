package com.git.servcie;

import com.git.dto.BookDTO;
import com.git.util.UtilDataBook;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {



    public List<BookDTO> getBook()
    {
        return UtilDataBook.bookDTOList(); // <-- llamada
    }
}
