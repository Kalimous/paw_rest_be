package com.can.pawrest.entity;

import com.can.pawrest.role.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "\"users\"")
public class User {

    public User() {
//        this.id = UUID.randomUUID().toString();
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
    private Role role;

    @Column(name = "create_at")
    private LocalDateTime createdAt;
    private String phone_number;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}