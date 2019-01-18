package com.greenfoxacademy.springadvanced.controllers;

import com.greenfoxacademy.springadvanced.services.ApplicationUserService;
import com.greenfoxacademy.springadvanced.services.UserDetailsServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.persistence.EntityManager;
import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;


@RunWith(SpringRunner.class)
@WebMvcTest(ApplicationUserController.class)
@ActiveProfiles("Test")
public class ApplicationUserControllerTest {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    /*@Autowired
    private WebApplicationContext context;*/

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ApplicationUserService applicationUserService;

    @MockBean
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @MockBean
    private UserDetailsServiceImpl userDetailsService;

    @MockBean
    private ApplicationContext applicationContext;

    @MockBean
    private EntityManager entityManager;

    /*@Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }*/

    @Test
    public void showUser_401Error () throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void register_successful () throws Exception {
        mockMvc.perform(post("/users/sign-up")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\n" +
                        "    \"username\" : \"Krisz\",\n" +
                        "    \"password\" : \"pass\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    public void login_401Status () throws Exception {
        mockMvc.perform(post("/login")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\n" +
                        "    \"username\" : \"Krisz\",\n" +
                        "    \"password\" : \"pass\"\n" +
                        "}"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void login_200Status () throws Exception {
        mockMvc.perform(post("/login")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\n" +
                        "    \"username\" : \"Krisz\",\n" +
                        "    \"password\" : \"pass\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }
}