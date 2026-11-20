package br.com.opportunities.repository.exams;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.exams.QuestionBank;

public interface QuestionBankRepository extends JpaRepository<QuestionBank, UUID> {
}