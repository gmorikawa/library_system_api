package dev.gmorikawa.library.repository;

import dev.gmorikawa.library.models.BookCopy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {
    
    @Query("SELECT x FROM BookCopy x WHERE x.barcode = ?1")
    Optional<BookCopy> findBookCopyByBarcode(UUID barcode);
    
}
