package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.TestUtil;
import com.greenfoxacademy.rest.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(AppenderController.class)
public class AppenderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogService logService;

    @Test
    public void showAppenda_successful() throws Exception {
        mockMvc.perform(get("/appenda/kuty"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appended", is("kutya")));
    }

    @Test
    public void showAppenda_missingPathVariable() throws Exception {
        mockMvc.perform(get("/appenda/"))
                .andExpect(status().isNotFound());
    }
}