package com.greenfoxacademy.frontend.Controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by eggdice on 4/17/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OtherControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doubling5Test() throws Exception {
    mockMvc
            .perform(get("/doubling?input=5")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(10));
  }
  @Test
  public void greeterTest() throws Exception {
    mockMvc
            .perform(get("/greeter?name=Petike&title=student")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Petike, my dear student!"));
  }
  @Test
  public void appenderTest() throws Exception {
    mockMvc
            .perform(get("/appenda/kuty")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void doUntilSumTest() throws Exception {
    mockMvc
            .perform(post("/dountil/sum")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(15));
  }

  @Test
  public void doUntilFactTest() throws Exception {
    mockMvc
            .perform(post("/dountil/factor")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(120));
  }
}
