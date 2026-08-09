package br.com.opportunities.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(
        name = "library_books",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_library_books_title", columnNames = {"title"})
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibraryBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category;

    @Column(name = "subject")
    private String subject;

    @Column(name = "year")
    private Integer year;

    @Column(name = "type")
    private String type;

    @Column(name = "level")
    private String level;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "description")
    private String description;

    @Column(name = "pdf_url")
    private String pdfUrl;

    @Column(name = "cover_url")
    private String coverUrl;

    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(name = "tags", columnDefinition = "text[]")
    private String[] tags;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;

    @Column(name = "created_by")
    private UUID createdBy;
}