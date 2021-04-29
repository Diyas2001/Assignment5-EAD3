package com.example.librarymanagment.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Issues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "date")
    private Date dueDate;
    @Type(type = "date")
    private Date dateOut;
    @Type(type = "date")
    private Date dateIn;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "librarian_id", nullable = false)
    private Librarians librarians;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id", nullable = false)
    private Requests bookRequests;

    public Issues(Date dueDate, Date dateOut, Date dateIn) {
        this.dueDate = dueDate;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
    }

    @Override
    public String toString() {
        return "BookIssues{" +
                "id=" + id +
                ", dueDate=" + dueDate +
                ", dateOut=" + dateOut +
                ", dateIn=" + dateIn +
                ", librarians=" + librarians +
                ", bookRequests=" + bookRequests +
                '}';
    }
}