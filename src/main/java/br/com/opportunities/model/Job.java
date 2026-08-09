package br.com.opportunities.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "company")
    private String company;

    @Column(name = "location")
    private String location;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "salary_min")
    private int salary_min;

    @Column(name = "salary_max")
    private int salary_max;

    @Column(name = "job_type")
    private String job_type;

    @Column(name = "category")
    private String category;

    @Column(name = "skills_required", columnDefinition = "TEXT")
    private String skills_required;

    @Column(name = "remote")
    private Boolean remote;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "link")
    private String link;

    @Column(name = "source")
    private String source;

    @Column(name = "source_id")
    private String sourceId;

    @Column(name = "published_at")
    private Instant publishedAt;

    @Column(name = "valid_until")
    private Instant validUntil;

    @Column(name = "create_at", updatable = false)
    private Instant createdAt;

    @Column(name = "update_at")
    private Instant updatedAt;

    @Column(name = "is_active")
    private Boolean isActive;

    // methods to ensure autofill
    @PrePersist
    protected void onCreate() {
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
        if (this.isActive == null) {
            this.isActive = true;
        }
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = Instant.now();
    }
}
