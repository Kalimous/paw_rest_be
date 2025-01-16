package com.can.pawrest.entity;

import com.can.pawrest.role.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class User {

    public User() {}

    public User(boolean is_deleted, String created_at) {
        this.id = UUID.randomUUID().toString();
        this.is_deleted = false;
        this.created_at = String.valueOf(LocalDateTime.now());
    }

    @Id
    private String id;
    private String userId;
    private String username;
    private String password;
    private Role role;
    private String created_at;
    private String phone_number;
    private boolean is_deleted;
}