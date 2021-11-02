package com.moataz.userdependencies.services;

import com.moataz.userdependencies.entities.Role;
import com.moataz.userdependencies.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
