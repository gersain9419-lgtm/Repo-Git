package com.git.controller;


import com.git.dto.BookDTO;
import com.git.servcie.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class bookController {

private final BookService  bookService;

    public bookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping
    public List<BookDTO> getBook(){
        return bookService.getBook();
    }


}
