package com.can.pawrest.entity;

import com.can.pawrest.role.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
public class User {

    public User() {
        isDeleted = false;
        createdAt = LocalDateTime.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    private String phoneNumber;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @PrePersist
    public void prePersist() {
        if (this.role == null) {
            this.role = Role.USER;
        }

        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }
}