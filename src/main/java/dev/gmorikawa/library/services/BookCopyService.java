package dev.gmorikawa.library.services;

import dev.gmorikawa.library.models.BookCopy;
import dev.gmorikawa.library.repository.BookCopyRepository;
import dev.gmorikawa.library.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class BookCopyService {
    
    private final BookCopyRepository bookCopyRepository;
    private final BookRepository bookRepository;

    @Autowired
    public BookCopyService(BookCopyRepository bookCopyRepository, BookRepository bookRepository) {
        this.bookCopyRepository = bookCopyRepository;
        this.bookRepository = bookRepository;
    }

    public List<BookCopy> getBookCopies() {
        return bookCopyRepository.findAll();
    }

    public void insertBookCopy(BookCopy newCopy, Long bookId) {
        /*
         * The following line generates a loop between Book and BookCopy.
         * This happens because of the ManyToOne and OneToMany mapping, which is implemented in BookCopy and Book respectively.
         */
        newCopy.setBook(bookRepository.findById(bookId).get());
        newCopy.setBarcode(UUID.randomUUID());
        bookCopyRepository.save(newCopy);
    }

    @Transactional
    public void updateBookCopy(BookCopy modifiedCopy) {
        BookCopy registeredCopy = bookCopyRepository.findById(modifiedCopy.getId()).get();

        registeredCopy.setBook(modifiedCopy.getBook());
        registeredCopy.setAvailable(modifiedCopy.getAvailable());
        registeredCopy.setBarcode(modifiedCopy.getBarcode());
    }

    public void deleteBookCopy(Long bookCopyId) {
        bookCopyRepository.delete(bookCopyRepository.findById(bookCopyId).get());
    }

}
