package br.com.opportunities.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "job_likes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "job_link")
    private String jobLink;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "job_company")
    private String jobCompany;

    @Column(name = "job_location")
    private String jobLocation;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
