package com.fabiopereira.javacleanarch.infrastructure.gateways;

import com.fabiopereira.javacleanarch.domain.entity.User;
import com.fabiopereira.javacleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
