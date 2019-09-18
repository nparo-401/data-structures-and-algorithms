package hashTable;

import org.junit.Test;

import static hashTable.LeftJoin.leftJoin;
import static org.junit.Assert.*;

public class LeftJoinTest {
  
  @Test
  public void testLeftJoin_NoNullsSameAmountInHash() {
    HashTable<String, String> table1 = new HashTable<>(1024);
    HashTable<String, String> table2 = new HashTable<>(1024);
    table1.set("fond", "enamored");
    table1.set("wrath", "anger");
    table2.set("fond", "averse");
    table2.set("wrath", "delight");
  
    String[][] answer = leftJoin(table1, table2);
  
    String [][] expected = new String[2][3];
    expected[0][0] = "fond";
    expected[0][1] = "enamored";
    expected[0][2] = "averse";
    expected[1][0] = "wrath";
    expected[1][1] = "anger";
    expected[1][2] = "delight";
    
    for (int i = 0; i < answer.length; i++) {
      assertEquals(expected[i][0], answer[i][0]);
      assertEquals(expected[i][1], answer[i][1]);
      assertEquals(expected[i][2], answer[i][2]);
    }
    assertArrayEquals(expected, answer);
  }
  
  @Test
  public void testLeftJoin_WithNullsSameAmountInHash() {
    HashTable<String, String> table1 = new HashTable<>(1024);
    HashTable<String, String> table2 = new HashTable<>(1024);
    table1.set("fond", "enamored");
    table1.set("wrath", "anger");
    table1.set("diligent", "employed");
    table2.set("fond", "averse");
    table2.set("wrath", "delight");
    table2.set("flow", "jam");
  
    String[][] answer = leftJoin(table1, table2);
  
    String [][] expected = new String[3][3];
    expected[0][0] = "fond";
    expected[0][1] = "enamored";
    expected[0][2] = "averse";
    expected[1][0] = "wrath";
    expected[1][1] = "anger";
    expected[1][2] = "delight";
    expected[2][0] = "diligent";
    expected[2][1] = "employed";
    expected[2][2] = null;
  
    for (int i = 0; i < answer.length; i++) {
      assertEquals(expected[i][0], answer[i][0]);
      assertEquals(expected[i][1], answer[i][1]);
      assertEquals(expected[i][2], answer[i][2]);
    }
    assertArrayEquals(expected, answer);
  }
  
  @Test
  public void testLeftJoin_WithNullsDiffAmountInHash_LeftGreater() {
    HashTable<String, String> table1 = new HashTable<>(1024);
    HashTable<String, String> table2 = new HashTable<>(1024);
    table1.set("fond", "enamored");
    table1.set("wrath", "anger");
    table1.set("diligent", "employed");
    table2.set("fond", "averse");
    table2.set("wrath", "delight");
  
    String[][] answer = leftJoin(table1, table2);
  
    String [][] expected = new String[3][3];
    expected[0][0] = "fond";
    expected[0][1] = "enamored";
    expected[0][2] = "averse";
    expected[1][0] = "wrath";
    expected[1][1] = "anger";
    expected[1][2] = "delight";
    expected[2][0] = "diligent";
    expected[2][1] = "employed";
    expected[2][2] = null;
  
    for (int i = 0; i < answer.length; i++) {
      assertEquals(expected[i][0], answer[i][0]);
      assertEquals(expected[i][1], answer[i][1]);
      assertEquals(expected[i][2], answer[i][2]);
    }
    assertArrayEquals(expected, answer);
  }
  
  @Test
  public void testLeftJoin_WithNullsDiffAmountInHash_RightGreater() {
    HashTable<String, String> table1 = new HashTable<>(1024);
    HashTable<String, String> table2 = new HashTable<>(1024);
    table1.set("fond", "enamored");
    table1.set("wrath", "anger");
    table2.set("fond", "averse");
    table2.set("wrath", "delight");
    table2.set("diligent", "employed");
    
    String[][] answer = leftJoin(table1, table2);
    
    String [][] expected = new String[2][3];
    expected[0][0] = "fond";
    expected[0][1] = "enamored";
    expected[0][2] = "averse";
    expected[1][0] = "wrath";
    expected[1][1] = "anger";
    expected[1][2] = "delight";
    
    for (int i = 0; i < answer.length; i++) {
      assertEquals(expected[i][0], answer[i][0]);
      assertEquals(expected[i][1], answer[i][1]);
      assertEquals(expected[i][2], answer[i][2]);
    }
    assertArrayEquals(expected, answer);
  }
}