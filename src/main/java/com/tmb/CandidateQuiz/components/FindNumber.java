package com.tmb.CandidateQuiz.components;

import java.util.List;

public class FindNumber {

  List<Integer> listNumber;

  public FindNumber(List<Integer> listNumber) {
    this.listNumber = listNumber;
  }

  public Integer findNine() {
    int index = listNumber.indexOf(9);
    return listNumber.get(index);
  }
}
