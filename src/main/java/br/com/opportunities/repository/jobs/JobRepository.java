package br.com.opportunities.repository.jobs;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.jobs.Job;

public interface JobRepository extends JpaRepository<Job, UUID> {
}