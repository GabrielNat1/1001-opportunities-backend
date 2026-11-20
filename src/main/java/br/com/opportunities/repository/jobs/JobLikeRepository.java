package br.com.opportunities.repository.jobs;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.jobs.JobLike;

public interface JobLikeRepository extends JpaRepository<JobLike, UUID> {
}