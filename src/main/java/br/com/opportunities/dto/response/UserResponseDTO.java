package br.com.opportunities.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Builder
public class UserResponseDTO {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private String avatarUrl;
    private OffsetDateTime createdAt;
}
