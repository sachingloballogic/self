package com.books.Controllers;

import com.books.Entities.Books;
import com.books.Service.BooksService;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class BooksController {
    @Autowired
    private BooksService booksService;

    //@RequestMapping(value = "/books",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/books")
    public List<Books> getBooks() {

        return this.booksService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Books getBook(@PathVariable("id") int id) {
        return booksService.getBooksById(id);
    }

    @PostMapping("/books")
    public Books addBook(@RequestBody Books books) {
        System.out.println("Controller" + books);
        Books b = this.booksService.addBook(books);
        System.out.println("Returning from service");
        return b;
    }

    @DeleteMapping("/books/{bookId}")
    public List<Books> deleteBook(@PathVariable("bookId") int bookId) {
        List<Books> books = this.booksService.deleteBook(bookId);
        return books;
    }
}
