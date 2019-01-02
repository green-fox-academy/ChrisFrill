package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.TestUtil;
import com.greenfoxacademy.rest.model.WhatNumbers;
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
@WebMvcTest(ArrayController.class)
public class ArrayControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogService logService;

    @MockBean
    private ResultService resultService;

    @Test
    public void postArrays_sum_successful() throws Exception {
        int[] numbers = {1, 2, 5, 10};
        WhatNumbers whatNumbers = new WhatNumbers("sum", numbers);
        Integer result = resultService.sumAll(whatNumbers.getNumbers());

        when(resultService.sumAll(whatNumbers.getNumbers())).thenReturn(18);

        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.result", is(18)));
    }

}