package com.cunbm.invest.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cunbm.invest.model.User;
import com.cunbm.invest.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
