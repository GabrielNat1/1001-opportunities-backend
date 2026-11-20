package br.com.opportunities.repository.plataform;

import br.com.opportunities.model.plataform.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuditLogRepository extends JpaRepository<AuditLog, UUID> {
}
