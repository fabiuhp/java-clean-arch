package com.fabiopereira.javacleanarch.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {

}
