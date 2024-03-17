package com.project.booklibrary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Book {
    @Id
    int bookId;
    @Column(nullable = false)
    String bookName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="author_id")
    Author author;

}
