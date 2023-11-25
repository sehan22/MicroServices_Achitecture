package com.example.user_service.service.impl;

import com.example.user_service.dto.UserDTO;
import com.example.user_service.entity.User;
import com.example.user_service.repo.UserRepo;
import com.example.user_service.service.UserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ArrayList<UserDTO> getAllUsers() {
        List<User> users = userRepo.findAll();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>() {
        }.getType());
    }

    @Override
    public void addUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        userRepo.save(user);
    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public void deleteUser(String userId, UserDTO userDTO) {

    }
}
