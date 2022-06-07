package com.registration.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registration.login.model.User;
import com.registration.login.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO registrationDTO);
}