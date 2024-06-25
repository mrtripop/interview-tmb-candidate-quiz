package com.tmb.assignment.models;

public class CustomerDTO {
  private String customerId;

  public CustomerDTO() {}

  public CustomerDTO(String customerId) {
    this.customerId = customerId;
  }

  public String getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
}
