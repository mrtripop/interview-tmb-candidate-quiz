package com.tmb.CandidateQuiz.components;

import java.util.List;

public class CountWords {

  private final String text;

  public CountWords(String text) {
    this.text = text;
  }

  public Integer count(String expectWord) {
    List<String> words = List.of(text.split(" "));
    List<String> expectWords = words.stream().filter(word -> word.equals(expectWord)).toList();
    return expectWords.size();
  }
}
