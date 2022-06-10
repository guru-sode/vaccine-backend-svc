package org.vaccine.service.impl;

import org.vaccine.model.User;
import org.vaccine.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<User>();
    }
}
