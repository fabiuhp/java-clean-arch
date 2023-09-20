package com.fabiopereira.javacleanarch.infrastructure.controllers;

import com.fabiopereira.javacleanarch.domain.entity.User;

public class UserDtoMapper {
    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.username(), user.email());
    }

    User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
