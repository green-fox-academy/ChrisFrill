package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GreeterController.class)
public class GreeterControllerTest {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogService logService;

    @Test
    public void showGreeting_successful() throws Exception {
        mockMvc.perform(get("/greeter")
                .param("name", "Petike")
                .param("title", "student"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
    }

    @Test
    public void showGreeting__nameIsNull() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON)
                .param("title", "student"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void showGreeting__titleIsNull() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON)
                .param("name", "Petike"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void showGreeting__nameAndTitleIsNull() throws Exception {
        mockMvc.perform(get("/greeter")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
    }
}
