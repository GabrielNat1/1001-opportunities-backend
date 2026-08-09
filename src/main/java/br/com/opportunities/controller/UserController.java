package br.com.opportunities.controller;

import br.com.opportunities.dto.request.UserCreateRequestDTO;
import br.com.opportunities.dto.response.UserResponseDTO;
import br.com.opportunities.model.User;
import br.com.opportunities.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserResponseDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> UserResponseDTO.builder()
                        .id(user.getId())
                        .name(user.getName())
                        //.email(user.getEmail())
                        .phone(user.getPhone())
                        .role(user.getRole())
                        .avatarUrl(user.getAvatarUrl())
                        //.createdAt(user.getCreatedAt())
                        .build())
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable UUID id) {
        return userRepository.findById(id)
                .map(user -> ResponseEntity.ok(UserResponseDTO.builder()
                        .id(user.getId())
                        .name(user.getName())
                        //.email(user.getEmail())
                        .phone(user.getPhone())
                        .role(user.getRole())
                        .avatarUrl(user.getAvatarUrl())
                        //.createdAt(user.getCreatedAt())
                        .build()))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO create(@RequestBody UserCreateRequestDTO request) {
        User newUser = User.builder()
                .name(request.getName())
                //.email(request.getEmail())
                .phone(request.getPhone())
                .role(request.getRole() != null ? request.getRole() : "user")
                .avatarUrl(request.getAvatarUrl())
                .build();

        User savedUser = userRepository.save(newUser);

        return UserResponseDTO.builder()
                .id(savedUser.getId())
                .name(savedUser.getName())
                //.email(savedUser.getEmail())
                .phone(savedUser.getPhone())
                .role(savedUser.getRole())
                .avatarUrl(savedUser.getAvatarUrl())
                //.createdAt(savedUser.getCreatedAt())
                .build();
    }
}