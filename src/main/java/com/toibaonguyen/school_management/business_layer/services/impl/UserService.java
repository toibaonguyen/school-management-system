package com.toibaonguyen.school_management.business_layer.services.impl;

import com.toibaonguyen.school_management.business_layer.dtos.requests.UserCreationRequest;
import com.toibaonguyen.school_management.business_layer.dtos.responses.UserCreationResponse;
import com.toibaonguyen.school_management.business_layer.services.IUserService;
import com.toibaonguyen.school_management.persistence_layer.entities.User;
import com.toibaonguyen.school_management.persistence_layer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    public UserCreationResponse createNewUser(UserCreationRequest user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setRole(user.getRole());
        newUser.setDateOfBirth(user.getDateOfBirth());
        return userRepository.save(newUser);
    }
}
