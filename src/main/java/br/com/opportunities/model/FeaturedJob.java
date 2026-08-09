package br.com.opportunities.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "featured_jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeaturedJob {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "link")
    private String link;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "badge")
    private String badge;

    @Column(name = "order_index")
    private Integer orderIndex;

    @Column(name = "active")
    private Boolean active;
}
