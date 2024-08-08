package com.j3appdemo.j3_app.controller;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.User;
import com.j3appdemo.j3_app.models.dto.UserDto;


@RestController
@RequestMapping("/api")

public class UserRestController {
    @GetMapping("/details")
        public UserDto details(){
            UserDto userDto = new UserDto();
            User user = new User("Silvia", "Angarita", null);
            userDto.setTitle("Desarrollando spring boot");
            userDto.setUser(user);
            return userDto;
            }
    


    @GetMapping("/list-details")
    public List<User> listdetails(){
        User user = new User("Juan","Perez", null);
        User userA = new User("Camilo","Hernandez", null);
        User userB = new User("Martha","Estupiñan", null);
        List<User> lstUsers = Arrays.asList(user, userA, userB);

        return lstUsers;
    }

 }

