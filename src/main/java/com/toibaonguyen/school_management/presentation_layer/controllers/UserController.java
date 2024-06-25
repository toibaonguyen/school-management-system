package com.toibaonguyen.school_management.presentation_layer.controllers;

import com.toibaonguyen.school_management.business_layer.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;


}
