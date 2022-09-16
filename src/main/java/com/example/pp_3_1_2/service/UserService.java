package com.example.pp_3_1_2.service;

import com.example.pp_3_1_2.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService extends UserDetailsService {

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUserById(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User getUserByUserName(String name);

}
