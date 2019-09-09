package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static tree.Tree.breadthFirst;

public class TreeTest {
  
  @Test
  public void testIsEmpty_Empty() {
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    assertTrue("isEmpty_Empty should return true", binarySearchTree.isEmpty());
  }
  
  @Test
  public void testIsEmpty_OneVal() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);

    assertFalse("isEmpty_OneVal should return false", binarySearchTree.isEmpty());
  }

  @Test
  public void testIsEmpty_MultipleOperations() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    assertTrue(binarySearchTree.isEmpty());
    binarySearchTree.add(4);
    assertFalse(binarySearchTree.isEmpty());
    binarySearchTree.add(5);
    assertFalse(binarySearchTree.isEmpty());
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testPreOrder_EmptyTree() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.preOrder();
  }
  
  @Test
  public void testPreOrder_OneRoot() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testPreOrder_OneRoot should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPreOrder_OneRootOneLeft() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(2);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testPreOrder_OneRootOneLeft should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPreOrder_OneRootOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(6);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(6);
    
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testPreOrder_OneRootOneRight should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPreOrder_OneRootOneLeftOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(2);
    testList.add(5);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneLeftOneRight should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPreOrder_OneRootTwoLeftOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(2);
    testList.add(6);
    testList.add(5);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(6);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneLeftOneRight should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPreOrder_OneRootOneLeftTwoRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(2);
    testList.add(3);
    testList.add(5);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(3);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneLeftTwoRight should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPreOrder_OneRootMultipleLeftMultipleRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(2);
    testList.add(1);
    testList.add(3);
    testList.add(6);
    testList.add(5);
    testList.add(20);
    testList.add(12);
    testList.add(29);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(6);
    binarySearchTree.add(5);
    binarySearchTree.add(3);
    binarySearchTree.add(20);
    binarySearchTree.add(12);
    binarySearchTree.add(1);
    binarySearchTree.add(29);
  
    for (int i = 0; i < binarySearchTree.preOrder().size(); i++) {
      assertEquals(
       "testPreOrder_OneRootMultipleLeftMultipleRight should return:",
       testList.get(i),
       binarySearchTree.preOrder().get(i)
      );
    }
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testInOrder_EmptyTree() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.inOrder();
  }
  
  @Test
  public void testInOrder_OneRoot() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
  
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
  
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRoot should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test
  public void testInOrder_OneRootOneLeft() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
  
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneLeft should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test
  public void testInOrder_OneRootOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(6);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(6);
    
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneRight should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test
  public void testInOrder_OneRootOneLeftOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(4);
    testList.add(5);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneLeftOneRight should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test
  public void testInOrder_OneRootTwoLeftOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(4);
    testList.add(5);
    testList.add(6);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(6);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootTwoLeftOneRight should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test
  public void testInOrder_OneRootOneLeftTwoRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(3);
    testList.add(4);
    testList.add(5);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(3);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootOneLeftTwoRight should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test
  public void testInOrder_OneRootMultipleLeftMultipleRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(1);
    testList.add(2);
    testList.add(3);
    testList.add(4);
    testList.add(5);
    testList.add(6);
    testList.add(12);
    testList.add(20);
    testList.add(29);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(6);
    binarySearchTree.add(5);
    binarySearchTree.add(3);
    binarySearchTree.add(20);
    binarySearchTree.add(12);
    binarySearchTree.add(1);
    binarySearchTree.add(29);
    
    for (int i = 0; i < binarySearchTree.inOrder().size(); i++) {
      assertEquals(
       "testInOrder_OneRootMultipleLeftMultipleRight should return:",
       testList.get(i),
       binarySearchTree.inOrder().get(i)
      );
    }
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testPostOrder_EmptyTree() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.postOrder();
  }
  
  @Test
  public void testPostOrder_OneRoot() {
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRoot should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPostOrder_OneRootOneLeft() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRootOneLeft should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPostOrder_OneRootOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(6);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(6);
    
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRootOneRight should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPostOrder_OneRootOneLeftOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(5);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRootOneLeftOneRight should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPostOrder_OneRootTwoLeftOneRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(2);
    testList.add(5);
    testList.add(6);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(6);
    binarySearchTree.add(5);
  
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRootTwoLeftOneRight should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPostOrder_OneRootOneLeftTwoRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(3);
    testList.add(2);
    testList.add(5);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(3);
    binarySearchTree.add(5);
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRootOneLeftTwoRight should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test
  public void testPostOrder_OneRootMultipleLeftMultipleRight() {
    List<Integer> testList = new ArrayList<>();
    testList.add(1);
    testList.add(3);
    testList.add(2);
    testList.add(5);
    testList.add(12);
    testList.add(29);
    testList.add(20);
    testList.add(6);
    testList.add(4);
    
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(4);
    binarySearchTree.add(2);
    binarySearchTree.add(6);
    binarySearchTree.add(5);
    binarySearchTree.add(3);
    binarySearchTree.add(20);
    binarySearchTree.add(12);
    binarySearchTree.add(1);
    binarySearchTree.add(29);
    
    for (int i = 0; i < binarySearchTree.postOrder().size(); i++) {
      assertEquals(
       "testPostOrder_OneRootMultipleLeftMultipleRight should return:",
       testList.get(i),
       binarySearchTree.postOrder().get(i)
      );
    }
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testContains_EmptyTree() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.contains(1);
  }
  
  @Test
  public void testContains_ValueIncluded() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(30);
    binarySearchTree.add(2);
    binarySearchTree.add(99);
    binarySearchTree.add(5);
    binarySearchTree.add(29);
    binarySearchTree.add(50);
    binarySearchTree.add(13);
    
    assertTrue(
     "testContains_ValueIncluded should return true",
     binarySearchTree.contains(29)
    );
  }
  
  @Test
  public void testContains_ValueNotIncluded() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(30);
    binarySearchTree.add(2);
    binarySearchTree.add(99);
    binarySearchTree.add(5);
    binarySearchTree.add(29);
    binarySearchTree.add(50);
    binarySearchTree.add(13);
    
    assertFalse(
     "testContains_ValueNotIncluded should return true",
     binarySearchTree.contains(19)
    );
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testBreadthFirst_EmptyList() {
    Tree<Integer> tree = new Tree<>();
    breadthFirst(tree);
  }
  
  @Test
  public void testBreadthFirst_MultipleLevels() {
    Tree<Integer> tree = new Tree<>();
    Node<Integer> item6 = new Node<>(30);
    Node<Integer> item5 = new Node<>(27);
    Node<Integer> item4 = new Node<>(2);
    Node<Integer> item3 = new Node<>(12, item6, null);
    Node<Integer> item2 = new Node<>(15, item5, null);
    Node<Integer> item1 = new Node<>(3, item3, item4);
    Node<Integer> root = new Node<>(20, item1, item2);
    tree.setRoot(root);
    
    List<Integer> testList = new ArrayList<>();
    testList.add(20);
    testList.add(3);
    testList.add(15);
    testList.add(12);
    testList.add(2);
    testList.add(27);
    testList.add(30);
    
    assertEquals(
     "testBreadthFirst_MultipleLevels should return:",
     testList,
     breadthFirst(tree)
    );
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testFindMaximumValue_EmptyTree() {
    Tree<Integer> tree = new Tree<>();
    tree.findMaximumValue();
  }
  
  @Test
  public void testFindMaximumValue_AllUniqueValues() {
    Tree<Integer> tree = new Tree<>();
    Node<Integer> item6 = new Node<>(30);
    Node<Integer> item5 = new Node<>(27);
    Node<Integer> item4 = new Node<>(2);
    Node<Integer> item3 = new Node<>(12, item6, null);
    Node<Integer> item2 = new Node<>(15, item5, null);
    Node<Integer> item1 = new Node<>(3, item3, item4);
    Node<Integer> root = new Node<>(20, item1, item2);
    tree.setRoot(root);
    
    assertEquals(
     "testFindMaximumValue_AllUniqueValues should return:",
     30,
     tree.findMaximumValue()
    );
  }
  
  @Test
  public void testFindMaximumValue_WithDuplicateValues() {
    Tree<Integer> tree = new Tree<>();
    Node<Integer> item6 = new Node<>(27);
    Node<Integer> item5 = new Node<>(27);
    Node<Integer> item4 = new Node<>(2);
    Node<Integer> item3 = new Node<>(10, item6, null);
    Node<Integer> item2 = new Node<>(15, item5, null);
    Node<Integer> item1 = new Node<>(3, item3, item4);
    Node<Integer> root = new Node<>(20, item1, item2);
    tree.setRoot(root);
  
    System.out.println(tree.getSumOdd(tree.root));
  
    assertEquals(
     "testFindMaximumValue_WithDuplicateValues should return:",
     27,
     tree.findMaximumValue()
    );
  }
  
  @Test (expected = IllegalStateException.class)
  public void testFindMaximumValue_NonIntegerTypeCast() {
    Tree<String> tree = new Tree<>();
    Node<String> root = new Node<>("20");
    tree.setRoot(root);
    tree.findMaximumValue();
  }
}