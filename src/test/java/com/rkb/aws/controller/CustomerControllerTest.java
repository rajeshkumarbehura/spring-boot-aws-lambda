package com.rkb.aws.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@ActiveProfiles({"test"})
@TestPropertySource("/test.properties")
class CustomerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Value("${test.data}")
    String testData;

    @Test
    void testGetUser() throws Exception {

        var result = mockMvc.perform(get("/api/v1/customers?1")
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
        System.out.println("Print the API output : " + result.getResponse().getContentAsString());
        System.out.println(testData);

        assert !result.getResponse().getContentAsString().isEmpty();
        assert testData.equals("Test Data");

    }

}