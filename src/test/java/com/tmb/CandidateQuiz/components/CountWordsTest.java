package com.tmb.CandidateQuiz.components;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountWordsTest {

  private CountWords countWords;

  @BeforeEach
  void setup() {
    String text = """
            The head of Singapore Airlines has apologised after a flight on Tuesday was hit by "severe extreme turbulence", killing one person and injuring dozens.
            Goh Choon Phong said the airline was "very sorry for the traumatic experience" for those onboard  SQ321 from London to Singapore.
            The  was forced to make an emergency landing in the Thai capital Bangkok.
            Smitivej Hospital, in Bangkok, said 104 people were treated and 58 remain in hospital, 20 of whom are in the intensive care unit.
            There are 15 Britons still being treated in hospital, with six in intensive care, the hospital said.
            A relief  carrying the remaining passengers and crew members arrived in Singapore early on Wednesday.
            The plane, which had 211 passengers and 18 crew members onboard, hit severe turbulence over the Indian Ocean and dropped more than 6,000 feet (1800m) in three minutes.
            """;
    countWords = new CountWords(text);
  }

  @ParameterizedTest
  @CsvSource({
          "flight, 1",
          "for, 2",
          "Zebra, 0",
          "211, 1"
  })
  void count_words_in_the_sentences(String word, Integer expectCount){
    // action
    Integer count = countWords.count(word);
    // assert
    assertEquals(expectCount, count);
  }
}
