package com.fabiopereira.javacleanarch.infrastructure.gateways;

import com.fabiopereira.javacleanarch.application.gateways.UserGateway;
import com.fabiopereira.javacleanarch.domain.entity.User;
import com.fabiopereira.javacleanarch.infrastructure.persistence.UserEntity;
import com.fabiopereira.javacleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway{
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    
    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }


    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        
        return userEntityMapper.toDomainObj(savedObj);
    }
}
