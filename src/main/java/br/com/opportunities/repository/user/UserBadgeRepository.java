package br.com.opportunities.repository.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.user.UserBadge;

public interface UserBadgeRepository extends JpaRepository<UserBadge, UUID> {
}