package com.can.pawrest.controller;

import com.can.pawrest.ResponseEntity.Response;
import com.can.pawrest.dto.joinDto;
import com.can.pawrest.entity.User;
import com.can.pawrest.exception.error.ErrorCode;
import com.can.pawrest.exception.error.UserException;
import com.can.pawrest.role.Role;
import com.can.pawrest.service.HashPasswordService;
import com.can.pawrest.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final HashPasswordService hashPasswordService;

    public UserController(UserService userService, HashPasswordService hashPasswordService) {
        this.userService = userService;
        this.hashPasswordService = hashPasswordService;
    }


    @PostMapping("")
    public HashMap<String, Object> createUser(@Valid @RequestBody joinDto joinDto, BindingResult result) {

        if (result.hasErrors()) {
            // 오류 메시지를 목록으로 반환
            List<String> errorMessages = result.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .toList();

            throw new UserException(ErrorCode.JOIN_VALIDATION_ERROR, errorMessages);
        }

        if ( userService.findByUserId(joinDto.getUserId()).isPresent() ) {
            throw new UserException(ErrorCode.USER_ID_ALREADY_EXISTS);
        }

        if ( userService.findByUsername(joinDto.getUsername()).isPresent() ) {
            throw new UserException(ErrorCode.USERNAME_ALREADY_EXISTS);
        }


        User user = User.builder()
                .userId(joinDto.getUserId())
                .password(hashPasswordService.hashPassword(joinDto.getPassword()))
                .username(joinDto.getUsername())
                .phoneNumber(joinDto.getPhoneNumber())
                .build();


        userService.join(user);
        return Response.success("Success Create User");
    }

}
