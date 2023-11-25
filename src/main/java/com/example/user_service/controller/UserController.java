package com.example.user_service.controller;

import com.example.user_service.dto.UserDTO;
import com.example.user_service.service.UserService;
import com.example.user_service.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseUtil getAllUser() {
        return new ResponseUtil("OK", "Users Successfully Loaded", userService.getAllUsers());
    }

    @PostMapping
    public ResponseUtil addUser(@ModelAttribute UserDTO userDTO) {
        System.out.println(userDTO);
        userService.addUser(userDTO);
        return new ResponseUtil("OK", "Users Successfully Loaded", userDTO);
    }
}
