package org.vaccine.service.impl;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.vaccine.model.User;
import org.vaccine.service.UserService;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class UserServiceImplTest {

    @Inject
    UserService userService;

    @Test
    public void get_all_users_success() {
        List<User> users = userService.getAllUsers();
        assertTrue(users.size() == 0);
    }
}
