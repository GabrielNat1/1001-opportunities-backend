package br.com.opportunities.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "user_video_progress")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVideoProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private UUID userId;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "progress")
    private Double progress;

    @Column(name = "time_watched")
    private Integer timeWatched;

    @Column(name = "watched")
    private Boolean watched;

    @Column(name = "last_watched")
    private LocalDateTime lastWatched;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        if (this.progress == null) this.progress = 0.0;
        if (this.timeWatched == null) this.timeWatched = 0;
        if (this.watched == null) this.watched = false;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
