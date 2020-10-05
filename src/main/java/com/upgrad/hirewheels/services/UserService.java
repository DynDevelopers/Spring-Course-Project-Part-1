package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.User;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public interface UserService {
    public User createUser(User user) throws UserAlreadyExistsException;
    public User getUser(String email, String password) throws Exception;
}
