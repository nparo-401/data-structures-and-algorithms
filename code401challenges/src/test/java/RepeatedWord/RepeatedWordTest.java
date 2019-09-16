package RepeatedWord;

import org.junit.Test;

import static RepeatedWord.RepeatedWord.repeatedWord;
import static org.junit.Assert.*;

public class RepeatedWordTest {
  @Test
  public void testRepeatedWord_NoneRepeated() {
    String sentence = "The quick brown fox jumped over thee lazy dog";
    String response = repeatedWord(sentence);
    
    assertEquals(
     "testRepeatedWord_NoneRepeated should return:",
     "No repeated words",
     response
    );
  }
  
  @Test
  public void testRepeatedWord_A() {
    String sentence = "Once upon a time, there was a brave princess who...";
    String response = repeatedWord(sentence);
    
    assertEquals(
     "testRepeatedWord_A should return:",
     "a",
     response
    );
  }
  
  @Test
  public void testRepeatedWord_It() {
    String sentence = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age " +
                       "of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    String response = repeatedWord(sentence);
    assertEquals(
     "testRepeatedWord_A should return:",
     "it",
     response
    );  }
  
  @Test
  public void testRepeatedWord_Summer() {
    String sentence = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know " +
                       "what I was doing in New York...";
    String response = repeatedWord(sentence);
    assertEquals(
     "testRepeatedWord_A should return:",
     "summer",
     response
    );
  }
}