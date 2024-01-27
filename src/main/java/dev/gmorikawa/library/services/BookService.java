package dev.gmorikawa.library.services;

import dev.gmorikawa.library.models.Book;
import dev.gmorikawa.library.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

@Service
public class BookService {
    
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow();
    }

    public void insertBook(Book newBook) {
        bookRepository.save(newBook);
    }

    @Transactional
    public void updateBook(Book modifiedBook) {
        Book registeredBook = bookRepository.findById(modifiedBook.getId()).get();

        registeredBook.setTitle(modifiedBook.getTitle());
        registeredBook.setAuthor(modifiedBook.getAuthor());
        registeredBook.setPublicationDate(modifiedBook.getPublicationDate());
        registeredBook.setPublisher(modifiedBook.getPublisher());
    }

    public void deleteBook(Long bookId) {
        bookRepository.delete(bookRepository.findById(bookId).orElseThrow());
    }
}
