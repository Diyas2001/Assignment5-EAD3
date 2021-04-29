package com.example.librarymanagment.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Books books;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Students students;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "bookRequests")
    private Issues bookIssues;

    public Requests(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookRequests{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", books=" + books +
                '}';
    }
}
