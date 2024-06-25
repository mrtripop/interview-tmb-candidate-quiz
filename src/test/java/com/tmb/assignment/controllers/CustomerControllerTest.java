package com.tmb.assignment.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmb.assignment.models.CustomerDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class CustomerControllerTest {

  private final ObjectMapper mapper = new ObjectMapper();
  @Autowired private MockMvc mockMvc;

  @Test
  @DisplayName("Verify response status is 200 and json body is expect with GET method")
  void verify_status_is_200_and_json_body_is_expect_with_GET_method() throws Exception {
    // action
    this.mockMvc
        .perform(get("/v1/customers/X101"))
        .andExpect(status().isOk())
        .andExpect(content().json("{\"customerId\":\"X101\",\"customerName\":\"NAME TEST\"}"));
  }

  @Test
  @DisplayName("Verify response status is 200 and json body is expect with POST method")
  void verify_status_is_200_and_json_body_is_expect_with_POST_method() throws Exception {
    // arrange
    CustomerDTO customerDTO = new CustomerDTO("X101");
    // action
    this.mockMvc
        .perform(
            post("/v1/getCustomer")
                .content(mapper.writeValueAsBytes(customerDTO))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json("{\"customerId\":\"X101\",\"customerName\":\"NAME TEST\"}"));
  }
}
