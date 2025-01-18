package com.can.pawrest.controller;

import com.can.pawrest.ResponseEntity.Response;
import com.can.pawrest.dto.joinDto;
import com.can.pawrest.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("")
    public HashMap<String, Object> createUser(@Valid @RequestBody joinDto joinDto, BindingResult result) {
        if (result.hasErrors()) {
            // 오류 메시지를 목록으로 반환
            List<String> errorMessages = result.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .toList();

            return Response.error("Validation Error", errorMessages);
        }




        return Response.success("Success Create User");
    }

}
