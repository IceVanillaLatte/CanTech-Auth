package com.cantech.auth.auth_service.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.cantech.auth.auth_service.deploytest.DeploytestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DeploytestController.class)
public class DeploytestControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHelloWorld() throws Exception {
        mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("Auth Server 입니다."));
    }
}
