package br.com.opportunities.repository.plataform;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.plataform.MaintenanceMode;

public interface MaintenanceModeRepository extends JpaRepository<MaintenanceMode, UUID> {
}