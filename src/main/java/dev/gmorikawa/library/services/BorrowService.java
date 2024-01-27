package dev.gmorikawa.library.services;

import dev.gmorikawa.library.models.Borrow;
import dev.gmorikawa.library.repository.BorrowRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {

    private final BorrowRepository borrowRepository;

    @Autowired
    public BorrowService(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }

    public List<Borrow> getMemberBorrowList(Long memberId) {
        return borrowRepository.getByMember(memberId);
    }

    public List<Borrow> getBookCopyBorrowList(Long copyId) {
        return borrowRepository.getByBookCopy(copyId);
    }

    public void insertBorrow(Borrow newBorrow) {
        borrowRepository.save(newBorrow);
    }

    public void deleteBorrow(Long borrowId) {
        borrowRepository.delete(borrowRepository.findById(borrowId).get());
    }
}
