package com.can.pawrest.entity;

import com.can.pawrest.role.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class User {

    public User() {}

    public User(boolean isDeleted, String createdAt) {
        this.id = UUID.randomUUID().toString();
        this.isDeleted = false;
        this.createdAt = String.valueOf(LocalDateTime.now());
    }

    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    private String username;
    private String password;
    private Role role;

    @Column(name = "create_at")
    private String createdAt;
    private String phone_number;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}