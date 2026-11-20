package br.com.opportunities.repository.exams;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.exams.PracticeQuestion;

public interface PracticeQuestionRepository extends JpaRepository<PracticeQuestion, UUID> {
}