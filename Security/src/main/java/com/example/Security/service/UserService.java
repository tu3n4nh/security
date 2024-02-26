package com.example.Security.service;

import com.example.Security.entity.Role;
import com.example.Security.entity.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void adToUser(String username, String rolename);
}
