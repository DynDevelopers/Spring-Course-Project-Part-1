package com.upgrad.hirewheels.services.serviceimpl;

import com.upgrad.hirewheels.dao.UsersDAO;
import com.upgrad.hirewheels.entities.User;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDAO usersDAO;

    @Override
    public User createUser(User user) throws UserAlreadyExistsException {
        if (usersDAO.findUserByEmail(user.getEmail()) != null)
            throw new UserAlreadyExistsException("Email Already Exists.");

        if (usersDAO.findUserByMobileNo(user.getMobileNo()) != null)
            throw new UserAlreadyExistsException("Mobile Number Already Exists.");

        return usersDAO.save(user);
    }

    @Override
    public User getUser(String email, String password) throws Exception {
        User user = usersDAO.findUserByEmail(email);
        if (user == null)
            throw new Exception("User not Registered");

        if (!user.getPassword().equals(password))
            throw new Exception("Unauthorized User");
        return user;
    }
}
