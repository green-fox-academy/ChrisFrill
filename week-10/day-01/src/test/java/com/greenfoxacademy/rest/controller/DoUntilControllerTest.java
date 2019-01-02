package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.TestUtil;
import com.greenfoxacademy.rest.service.LogService;
import com.greenfoxacademy.rest.service.ResultService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@WebMvcTest(DoUntilController.class)
public class DoUntilControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogService logService;

    @MockBean
    private ResultService resultService;

    @Test
    public void doUntil_sum_successful() throws Exception {
        when(resultService.sumUntil(5)).thenReturn(15);

        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\n" +
                        "  \"until\": 5\n" +
                        "}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.result", is(15)));

        verify(resultService, times(1)).sumUntil(5);
        verifyNoMoreInteractions(resultService);
    }

}