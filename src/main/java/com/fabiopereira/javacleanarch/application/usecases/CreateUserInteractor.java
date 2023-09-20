package com.fabiopereira.javacleanarch.application.usecases;

import com.fabiopereira.javacleanarch.application.gateways.UserGateway;
import com.fabiopereira.javacleanarch.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    
    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }


    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
