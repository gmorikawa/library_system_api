package dev.gmorikawa.library.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.UUID;

@Entity
@Table
public class BookCopy {
    
    /**
     * PROPERTIES
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId")
    @JsonBackReference
    /*
     * Temporary solution until find a better one.
     * Problem: This property will not be serialize into JSON to prevent Infinite Recursion.
     */
    private Book book;

    private Boolean available;

    @Column(unique = true)
    private UUID barcode;

    public BookCopy() { }

    public BookCopy(Long id, Book book, Boolean available, UUID barcode) {
        this.id = id;
        this.book = book;
        this.available = available;
        this.barcode = barcode;
    }

    public BookCopy(Book book, Boolean available, UUID barcode) {
        this.book = book;
        this.available = available;
        this.barcode = barcode;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public Boolean getAvailable() { return available; }
    public void setAvailable(Boolean available) { this.available = available; }

    public UUID getBarcode() { return barcode; }
    public void setBarcode(UUID barcode) { this.barcode = barcode; }
}
