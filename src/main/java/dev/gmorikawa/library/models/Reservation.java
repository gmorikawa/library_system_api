package dev.gmorikawa.library.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class Reservation {

    /**
     * PROPERTIES
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDate issue_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference
    private Book book;

    @Column(nullable = false)
    private Boolean validity;

    /**
     * CONSTRUCTORS
     */

    public Reservation() { }

    /**
     * GETTERS AND SETTERS
     */

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getIssueDate() { return issue_date; }
    public void setIssueDate(LocalDate issue_date) { this.issue_date = issue_date; }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public Boolean getValidity() { return validity; }
    public void setValidity(Boolean validity) { this.validity = validity; }
}
