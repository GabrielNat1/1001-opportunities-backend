package br.com.opportunities.repository.plataform;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.plataform.Notification;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}