package br.com.opportunities.repository.plataform;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.plataform.SupportMaterial;

public interface SupportMaterialRepository extends JpaRepository<SupportMaterial, UUID> {
}