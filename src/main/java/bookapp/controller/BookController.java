package bookapp.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;


@RestController
@EnableWebMvc
public class BookController {

    private static final Book[] books = {
        new Book(1L, "Nemesis", "Isaac Asimov"),
        new Book(2L, "Great Expectations", "Charles Dickens"),
        new Book(3L, "The Chronicles of Narnia", "C.S. Lewis")
    };

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public Book[] books() {
        return books;
    }
}
