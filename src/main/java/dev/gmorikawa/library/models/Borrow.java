package dev.gmorikawa.library.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.time.LocalDate;

@Entity
@Table
public class Borrow {
    
    /**
     * PROPERTIES
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDate issueDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference
    private BookCopy copy;

    /**
     * CONSTRUCTORS
     */
    
    public Borrow() { }

    /**
     * GETTERS AND SETTERS
     */

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public BookCopy getCopy() { return copy; }
    public void setCopy(BookCopy copy) { this.copy = copy; }
}
