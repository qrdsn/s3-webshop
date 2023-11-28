package com.qrdsn.fullstackbackend.controller;

import com.qrdsn.fullstackbackend.model.User;
import com.qrdsn.fullstackbackend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    public UserControllerTest(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    private final UserRepository userRepository;



    @Test
    void newUser() {
        UserController controller = new UserController(userRepository); //Arrange
        User user = controller.getUserById(); //Act */
        assertEquals("temporaryName", 1 /*user.getName()*/); //Assert
    }

    @Test
    void all() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}
