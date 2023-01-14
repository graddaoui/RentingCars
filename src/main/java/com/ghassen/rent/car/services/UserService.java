package com.ghassen.rent.car.services;

import com.ghassen.rent.car.entities.Role;
import com.ghassen.rent.car.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
