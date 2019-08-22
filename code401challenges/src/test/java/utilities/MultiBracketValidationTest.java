package utilities;

import org.junit.Test;

import static org.junit.Assert.*;
import static utilities.MultiBracketValidation.multiBracketValidation;

public class MultiBracketValidationTest {
  
  @Test
  public void testMultiBracketValidation_OpenAndCloseOneSet() {
    assertTrue(
     "testMultiBracketValidation_OpenAndCloseOneSet should return true",
     multiBracketValidation("{This is a working test}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_OpenAndCloseTwoSet() {
    assertTrue(
     "testMultiBracketValidation_OpenAndCloseTwoSet should return true",
     multiBracketValidation("{This [is] a working test}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_OpenAndCloseThreeSet() {
    assertTrue(
     "testMultiBracketValidation_OpenAndCloseThreeSet should return true",
     multiBracketValidation("{This is a working[()] test}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_OpenAndCloseMultipleSet() {
    assertTrue(
     "testMultiBracketValidation_OpenAndCloseThreeSet should return true",
     multiBracketValidation("{This { is a { a [ very ] () complicated } working[()] test}}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail_OnlyOpenOneSet() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyOpenOneSet should return false",
     multiBracketValidation("This is a failing test{")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail_OnlyOpenTwoSet() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyOpenTwoSet should return false",
     multiBracketValidation("This [ is a failing test{")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail_OnlyOpenThreeSet() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyOpenThreeSet should return false",
     multiBracketValidation("(This [ is a failing test{")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail_OnlyCloseOneSet() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyCloseOneSet should return false",
     multiBracketValidation("This is a failing test}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail_OnlyCloseTwoSet() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyCloseTwoSet should return false",
     multiBracketValidation("This is a ] failing test}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail_OnlyCloseThreeSet() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyCloseThreeSet should return false",
     multiBracketValidation("This ] is a ) failing test}")
    );
  }
  
  @Test
  public void testMultiBracketValidation_ExpectedFail() {
    assertFalse(
     "testMultiBracketValidation_ExpectedFail_OnlyCloseThreeSet should return false",
     multiBracketValidation("{This [ ( ] is a ) ] failing test}")
    );
  }
}