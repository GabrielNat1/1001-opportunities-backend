package br.com.opportunities.repository.jobs;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.jobs.Resume;

public interface ResumeRepository extends JpaRepository<Resume, UUID> {
}