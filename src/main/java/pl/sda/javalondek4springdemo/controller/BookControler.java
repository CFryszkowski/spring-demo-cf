package pl.sda.javalondek4springdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.javalondek4springdemo.model.Book;
import pl.sda.javalondek4springdemo.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControler {

    private static final Logger logger = LoggerFactory.getLogger(BookControler.class);

    private final BookService bookService;

    public BookControler(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){

        logger.info("getAllBooks()");


        return bookService.findAllBooks();

    }

}