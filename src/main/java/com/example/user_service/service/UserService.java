package com.example.user_service.service;

import com.example.user_service.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    ArrayList<UserDTO> getAllUsers();
    void addUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(String userId, UserDTO userDTO);
}
