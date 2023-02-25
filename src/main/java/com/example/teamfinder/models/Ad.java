package com.example.teamfinder.models;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@Table(name="Projects")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private final String name;
    private final String content;
    private final Date createdAt = new Date();

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private final User user;

}
