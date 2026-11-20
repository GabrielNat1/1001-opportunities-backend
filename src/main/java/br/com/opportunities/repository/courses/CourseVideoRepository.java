package br.com.opportunities.repository.courses;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.courses.CourseVideo;

public interface CourseVideoRepository extends JpaRepository<CourseVideo, UUID> {
}