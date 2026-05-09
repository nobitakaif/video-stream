package com.video.contentservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(length = 100)
    private String description;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private String director;

    private String cast;

    private int durationInMinutes;

    private String videoKey;

    private String hlsUrl;

    @Enumerated(EnumType.STRING)
    private VideoStatus videoStatus;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime upatedAt;
}
