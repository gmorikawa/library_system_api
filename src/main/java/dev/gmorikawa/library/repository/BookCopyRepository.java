package dev.gmorikawa.library.repository;

import dev.gmorikawa.library.models.BookCopy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {
    
    @Query("SELECT x FROM BookCopy x WHERE x.barcode = :barcode")
    Optional<BookCopy> findByBarcode(@Param("barcode") UUID barcode);
    
}
