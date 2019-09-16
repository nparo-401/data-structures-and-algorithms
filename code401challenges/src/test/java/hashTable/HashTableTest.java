package hashTable;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class HashTableTest {
  
  @Test
  public void testSet_OneValAdded() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("John", "Husband");
    
    assertEquals(
     "testSet_OneValAdded should return:",
     "John : Husband\n",
     test.toString()
    );
  }
  
  @Test
  public void testSet_MultipleValAdded() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("John", "Husband");
    test.set("Phil", "Husband");
    test.set("Amanda", "Friend");
    test.set("Rosie", "Dog");
  
    assertEquals(
     "testSet_MultipleValAdded should return:",
     "Amanda : Friend\n" +
      "Rosie : Dog\n" +
      "John : Husband\n" +
      "Phil : Husband\n",
     test.toString()
    );
  }

  @Test
  public void testGet_ValIncluded() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("Nick", "Tester");
    
    assertEquals(
     "testGet_ValIncluded should return:",
     "Tester",
     test.get("Nick")
    );
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testGet_ValNotIncluded() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("Nick", "Tester");
    test.get("Joe");
  }
  
  @Test
  public void testHas_HasKey() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("Nick", "Tester");
    
    assertTrue(test.has("Nick"));
  }
  
  @Test
  public void testHas_HasKeyMultipleAdded() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("Nick", "Tester");
    test.set("Joe", "Schmoe");
    test.set("Nick", "Repeat");
    test.set("Phil", "Person");
    
    assertTrue(test.has("Nick"));
  }
  
  @Test
  public void testHas_DoesNotHaveKey() {
    HashTable<String, String> test = new HashTable<>(1024);
    test.set("Nick", "Tester");
    test.set("Joe", "Schmoe");
    test.set("Phil", "Person");
    
    assertFalse(test.has("Pope"));
  }
}