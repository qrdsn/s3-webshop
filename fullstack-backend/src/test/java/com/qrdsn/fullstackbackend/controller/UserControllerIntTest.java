package com.qrdsn.fullstackbackend.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerIntTest {

    @Autowired
    private MockMvc mvc;

/*
    @TestQuinn123
    void createUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/users");
        MvcResult result = mvc.perform(request).andReturn();
    }
*/

    @Test
    void user() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/user/2");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("idk", result.getResponse().getContentAsString());
    }
}
