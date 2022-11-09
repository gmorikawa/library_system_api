package dev.gmorikawa.library.controllers;

import dev.gmorikawa.library.models.Book;
import dev.gmorikawa.library.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * List all books
     */
    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("{bookId}")
    public Book getBookById(@PathVariable Long bookId) {
        return bookService.getBookById(bookId);
    }

    /**
     * Register new book into database
     */
    @PostMapping
    public void registerNewBook(@RequestBody Book newBook) {
        bookService.insertBook(newBook);
    }

    /**
     * Delete a book. All database entries related to that book will be deleted as well.
     */
    @DeleteMapping("{bookId}")
    public void deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
    }

    /**
     * Modify the information of a single book
     */
    @PutMapping
    public void modifyBook(@RequestBody Book modifiedBook) {
        bookService.updateBook(modifiedBook);
    }

}
