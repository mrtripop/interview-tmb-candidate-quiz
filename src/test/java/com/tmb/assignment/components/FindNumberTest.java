package com.tmb.assignment.components;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindNumberTest {

  List<Integer> listNumber;

  private FindNumber findNumber;

  @BeforeEach
  void setup() {
    listNumber = Arrays.asList(18, 0, -3, 66, 28, 9, -70, 120);
    findNumber = new FindNumber(listNumber);
  }

  @Test
  @DisplayName("[SUCCESS] Find number nine in array")
  void success_find_nine_number_in_array() {
    // action
    Integer result = findNumber.findNine();
    // assert
    assertEquals(9, result);
  }
}
