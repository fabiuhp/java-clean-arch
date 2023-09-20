package com.fabiopereira.javacleanarch.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabiopereira.javacleanarch.application.usecases.CreateUserInteractor;
import com.fabiopereira.javacleanarch.domain.entity.User;

@RestController
@RequestMapping("users")
public class UserController {
    private final CreateUserInteractor createUserInteractor;
    private final UserDtoMapper userDtoMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDtoMapper userDtoMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDtoMapper = userDtoMapper;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest request) {
        User userBusinessObj = userDtoMapper.toUser(request);
        User user = createUserInteractor.createUser(userBusinessObj);

        return userDtoMapper.toResponse(user);
    }
    
}
