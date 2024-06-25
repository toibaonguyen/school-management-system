package com.toibaonguyen.school_management.business_layer.services;

import com.toibaonguyen.school_management.business_layer.dtos.requests.UserCreationRequest;
import com.toibaonguyen.school_management.business_layer.dtos.responses.UserCreationResponse;
import com.toibaonguyen.school_management.persistence_layer.entities.User;

public interface IUserService {
    UserCreationResponse createNewUser(UserCreationRequest user);
}
