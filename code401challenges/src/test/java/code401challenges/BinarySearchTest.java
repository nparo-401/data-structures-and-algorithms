package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

  @Test
  public void testBinarySearch() {
    assertEquals("returns the wrong index", 0, BinarySearch.binarySearch(new int[]{1}, 1));
  }
}