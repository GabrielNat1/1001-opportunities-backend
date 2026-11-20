package br.com.opportunities.repository.jobs;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.jobs.FeaturedJob;

public interface FeaturedJobRepository extends JpaRepository<FeaturedJob, UUID> {
}