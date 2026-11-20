package br.com.opportunities.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.user.UserUnlockedFrame;
import br.com.opportunities.model.user.UserUnlockedFrameId;

public interface UserUnlockedFrameRepository
        extends JpaRepository<UserUnlockedFrame, UserUnlockedFrameId> {
}