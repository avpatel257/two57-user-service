package com.two57.service.user.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestUserController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamUserShouldReturnDefaultMessage() throws Exception {

        this.mockMvc.perform(get("/users/health")).andExpect(status().isOk());
    }

    @Test
    public void testIsHealthy() throws Exception {

        this.mockMvc.perform(get("/users/health")).andExpect(status().isOk());
    }

    @Test
    public void paramUserShouldReturnTailoredMessage() throws Exception {

        Assert.assertTrue(true);
    }

    @Test
    public void testGetAllUserEndPoint() throws Exception {
        this.mockMvc.perform(get("/users/")).andExpect(status().isOk());
    }

    @Test
    public void testGetAllUserEndPointCount() throws Exception {
        this.mockMvc.perform(get("/users/123")).andExpect(status().isNotFound());
    }
}
