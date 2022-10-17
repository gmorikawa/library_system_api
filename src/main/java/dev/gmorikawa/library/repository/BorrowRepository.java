package dev.gmorikawa.library.repository;

import dev.gmorikawa.library.models.Borrow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long>{

    @Query("SELECT x FROM Borrow x WHERE x.member.id = :memberId")
    public List<Borrow> getByMember(@Param("memberId") Long memberId);

    @Query("SELECT x FROM Borrow x WHERE x.copy.id = :copyId")
    public List<Borrow> getByBookCopy(@Param("copyId") Long copyId);

}