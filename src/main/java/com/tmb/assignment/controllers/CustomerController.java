package com.tmb.assignment.controllers;

import com.tmb.assignment.models.Customer;
import com.tmb.assignment.models.CustomerDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

  @PostMapping("/v1/getCustomer")
  public HttpEntity<Customer> getCustomerById(@RequestBody CustomerDTO customer) {
    Customer existingCustomer = new Customer(customer.getCustomerId(), "NAME TEST");
    return new ResponseEntity<>(existingCustomer, HttpStatus.OK);
  }

  @GetMapping("/v1/customers/{customerId}")
  public HttpEntity<Customer> getCustomerById(@PathVariable String customerId) {
    Customer customer = new Customer(customerId, "NAME TEST");
    return new ResponseEntity<>(customer, HttpStatus.OK);
  }
}
