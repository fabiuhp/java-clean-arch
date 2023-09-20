package com.fabiopereira.javacleanarch.application.gateways;

import com.fabiopereira.javacleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
