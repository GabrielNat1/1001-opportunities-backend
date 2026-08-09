package br.com.opportunities.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequestDTO {
    private String name;
    private String email;
    private String phone;
    private String role;
    private String avatarUrl;
}
