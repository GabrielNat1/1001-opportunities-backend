package br.com.opportunities.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "course_videos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "topic")
    private String topic;

    @Column(name = "title")
    private String title;

    @Column(name = "short_title")
    private String shortTitle;

    @Column(name = "youtube_id")
    private String youtubeId;

    @Column(name = "duration")
    private String duration;

    @Column(name = "author")
    private String author;

    @Column(name = "order_index")
    private Integer orderIndex;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "subject_text")
    private String subjectText;

    @Column(name = "topic_order")
    private Integer topicOrder;
}
