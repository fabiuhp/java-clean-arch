package com.fabiopereira.javacleanarch.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fabiopereira.javacleanarch.application.gateways.UserGateway;
import com.fabiopereira.javacleanarch.application.usecases.CreateUserInteractor;
import com.fabiopereira.javacleanarch.infrastructure.controllers.UserDtoMapper;
import com.fabiopereira.javacleanarch.infrastructure.gateways.UserEntityMapper;
import com.fabiopereira.javacleanarch.infrastructure.gateways.UserRepositoryGateway;
import com.fabiopereira.javacleanarch.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDtoMapper userDtoMapper() {
        return new UserDtoMapper();
    }
}
