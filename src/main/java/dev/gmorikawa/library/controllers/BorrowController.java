package dev.gmorikawa.library.controllers;

import dev.gmorikawa.library.models.Borrow;
import dev.gmorikawa.library.services.BorrowService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/borrow")
public class BorrowController {
    
    private final BorrowService borrowService;

    @Autowired
    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @GetMapping("member")
    public List<Borrow> getBorrowsByMember(@RequestParam Long memberId) {
        return borrowService.getMemberBorrowList(memberId);
    }

    @GetMapping("copy")
    public List<Borrow> getBorrowsByCopy(@RequestParam Long copyId) {
        return borrowService.getBookCopyBorrowList(copyId);
    }

    @PostMapping
    public void registerNewBorrow(@RequestBody Borrow newBorrowEntry) {
        borrowService.insertBorrow(newBorrowEntry);
    }

    @DeleteMapping("{borrowId}")
    public void deleteBorrow(@PathVariable Long borrowId) {
        borrowService.deleteBorrow(borrowId);
    }
}
