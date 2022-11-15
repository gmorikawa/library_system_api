package dev.gmorikawa.library.controllers;

import dev.gmorikawa.library.models.BookCopy;
import dev.gmorikawa.library.services.BookCopyService;

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
@RequestMapping(path = "api/bookcopy")
public class BookCopyController {
    
    private final BookCopyService copyService;

    @Autowired
    public BookCopyController(BookCopyService copyService) {
        this.copyService = copyService;
    }

    @GetMapping
    public List<BookCopy> getBooks() {
        return copyService.getBookCopies();
    }

    @PostMapping("{bookId}")
    public void registerNewBook(@RequestBody BookCopy newCopy, @PathVariable Long bookId) {
        copyService.insertBookCopy(newCopy, bookId);
    }

    @DeleteMapping("{bookCopyId}")
    public void deleteBookCopy(@PathVariable Long bookCopyId) {
        copyService.deleteBookCopy(bookCopyId);
    }

    @PutMapping
    public void modifyBookCopy(@RequestBody BookCopy modifiedCopy) {
        copyService.updateBookCopy(modifiedCopy);
    }

}
