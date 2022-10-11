package dev.gmorikawa.library.repository;

import dev.gmorikawa.library.models.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT x FROM Book x WHERE x.title = ?1")
    Optional<Book> findBookByTitle(String title);

}
