package com.project.booklibrary.entity;

import jakarta.annotation.Nullable;
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
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int authId;

    @Column(nullable = false)
    String authName;

    @Column
    int authAge;
}
