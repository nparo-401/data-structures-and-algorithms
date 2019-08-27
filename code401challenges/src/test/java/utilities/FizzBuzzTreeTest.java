package utilities;

import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static utilities.FizzBuzzTree.fizzBuzzTree;

public class FizzBuzzTreeTest {
  @Test (expected = NoSuchElementException.class)
  public void testFizzBuzzTree_EmptyTree () {
    Tree<Object> tree = new Tree<>();
    System.out.println(fizzBuzzTree(tree).inOrder());
  }
  
  @Test
  public void testFizzBuzzTree_IsSameTree() {
    Tree<Object> tree = new Tree<>();
    Node<Object> item6 = new Node<>(30);
    Node<Object> item5 = new Node<>(27);
    Node<Object> item4 = new Node<>(2);
    Node<Object> item3 = new Node<>(12);
    Node<Object> item2 = new Node<>(15, item5, item6);
    Node<Object> item1 = new Node<>(3, item3, item4);
    Node<Object> root = new Node<>(20, item1, item2);
    tree.setRoot(root);
    
    assertEquals(
     "testFizzBuzzTree_IsSameTree should return:",
     tree,
     fizzBuzzTree(tree)
    );
  }
  
  @Test
  public void testFizzBuzzTree_NonEmptyTree () {
    Tree<Object> tree = new Tree<>();
    Node<Object> item6 = new Node<>(30);
    Node<Object> item5 = new Node<>(27);
    Node<Object> item4 = new Node<>(2);
    Node<Object> item3 = new Node<>(12);
    Node<Object> item2 = new Node<>(15, item5, item6);
    Node<Object> item1 = new Node<>(3, item3, item4);
    Node<Object> root = new Node<>(20, item1, item2);
    tree.setRoot(root);
    
    List<Object> testList = new ArrayList<>();
    testList.add("Fizz");
    testList.add("Fizz");
    testList.add(2);
    testList.add("Buzz");
    testList.add("Fizz");
    testList.add("FizzBuzz");
    testList.add("FizzBuzz");
    
    assertEquals(
     "testFizzBuzzTree_NonEmptyTree should return:",
     testList,
     fizzBuzzTree(tree).inOrder()
    );
  }
}