package TreeIntersection;

import org.junit.Before;
import org.junit.Test;
import tree.BinarySearchTree;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

import static TreeIntersection.TreeIntersection.treeIntersection;
import static org.junit.Assert.*;

public class TreeIntersectionTest {
  private Tree<Integer> tree1;
  private Tree<Integer> tree2;
  private BinarySearchTree<Integer> bst1;
  private BinarySearchTree<Integer> bst2;
  
  @Before
  public void setUp() {
    tree1 = new Tree<>();
    tree2 = new Tree<>();
    bst1 = new BinarySearchTree<>();
    bst2 = new BinarySearchTree<>();
  }
  
//  Tree
  @Test
  public void testTreeIntersection_treeOneEmptyTree() {
    Node<Integer> item1 = new Node<>(3, null, null);
    Node<Integer> root1 = new Node<>(20, item1, null);
    tree1.setRoot(root1);
    
    ArrayList<Integer> test = treeIntersection(tree1, tree2);
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals("testTreeIntersection_treeOneEmptyTree", expected, test);
  }
  @Test
  public void testTreeIntersection_treeNoDuplicateValues() {
    Node<Integer> item6 = new Node<>(30);
    Node<Integer> item5 = new Node<>(27);
    Node<Integer> item4 = new Node<>(2);
    Node<Integer> item3 = new Node<>(11, item6, null);
    Node<Integer> item2 = new Node<>(15, item5, null);
    Node<Integer> item1 = new Node<>(3, item3, item4);
    Node<Integer> root1 = new Node<>(20, item1, item2);
    tree1.setRoot(root1);
  
    Node<Integer> item12 = new Node<>(31);
    Node<Integer> item11 = new Node<>(29);
    Node<Integer> item10 = new Node<>(1);
    Node<Integer> item9 = new Node<>(10, item12, null);
    Node<Integer> item8 = new Node<>(16, item11, null);
    Node<Integer> item7 = new Node<>(4, item9, item10);
    Node<Integer> root2 = new Node<>(19, item7, item8);
    tree2.setRoot(root2);
    
    ArrayList<Integer> test = treeIntersection(tree1, tree2);
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals("testTreeIntersection_NoDuplicateValues should return:", expected, test);
  }
  
  @Test
  public void testTreeIntersection_treeOneDuplicateValue() {
    Node<Integer> item6 = new Node<>(30);
    Node<Integer> item5 = new Node<>(27);
    Node<Integer> item4 = new Node<>(2);
    Node<Integer> item3 = new Node<>(11, item6, null);
    Node<Integer> item2 = new Node<>(15, item5, null);
    Node<Integer> item1 = new Node<>(3, item3, item4);
    Node<Integer> root1 = new Node<>(20, item1, item2);
    tree1.setRoot(root1);
  
    Node<Integer> item12 = new Node<>(31);
    Node<Integer> item11 = new Node<>(30);
    Node<Integer> item10 = new Node<>(1);
    Node<Integer> item9 = new Node<>(10, item12, null);
    Node<Integer> item8 = new Node<>(16, item11, null);
    Node<Integer> item7 = new Node<>(4, item9, item10);
    Node<Integer> root2 = new Node<>(19, item7, item8);
    tree2.setRoot(root2);
  
    ArrayList<Integer> test = treeIntersection(tree1, tree2);
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(30);
    assertEquals("testTreeIntersection_OneDuplicateValue should return:", expected, test);
  }
  
  @Test
  public void testTreeIntersection_treeMultipleDuplicateValues() {
    Node<Integer> item6 = new Node<>(30);
    Node<Integer> item5 = new Node<>(27);
    Node<Integer> item4 = new Node<>(1);
    Node<Integer> item3 = new Node<>(11, item6, null);
    Node<Integer> item2 = new Node<>(16, item5, null);
    Node<Integer> item1 = new Node<>(3, item3, item4);
    Node<Integer> root1 = new Node<>(20, item1, item2);
    tree1.setRoot(root1);
  
    Node<Integer> item12 = new Node<>(31);
    Node<Integer> item11 = new Node<>(30);
    Node<Integer> item10 = new Node<>(1);
    Node<Integer> item9 = new Node<>(10, item12, null);
    Node<Integer> item8 = new Node<>(16, item11, null);
    Node<Integer> item7 = new Node<>(4, item9, item10);
    Node<Integer> root2 = new Node<>(19, item7, item8);
    tree2.setRoot(root2);
  
    ArrayList<Integer> test = treeIntersection(tree1, tree2);
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(30);
    expected.add(1);
    expected.add(16);
    assertEquals("testTreeIntersection_OneDuplicateValue should return:", expected, test);
  }
  
//  Binary Search Tree
  @Test
  public void testTreeIntersection_bstOneEmptyTree() {
    bst1.add(10);
    bst1.add(8);
    
    ArrayList<Integer> test = treeIntersection(bst1, bst2);
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals("testTreeIntersection_bstOneEmptyTree", expected, test);
  }
  
  @Test
  public void testTreeIntersection_bstNoDupVal() {
    bst1.add(150);
    bst1.add(101);
    bst1.add(250);
    bst1.add(75);
    bst1.add(161);
    
    bst2.add(42);
    bst2.add(100);
    bst2.add(600);
    bst2.add(15);
    bst2.add(160);

    ArrayList<Integer> test = treeIntersection(bst1, bst2);
    ArrayList<Integer> expected = new ArrayList<>();
    
    assertEquals("testTreeIntersection_bstNoDupVal should return", expected, test);
  }
  
  @Test
  public void testTreeIntersection_bstOneDupVal() {
    bst1.add(150);
    bst1.add(100);
    bst1.add(250);
    bst1.add(75);
  
    bst2.add(42);
    bst2.add(100);
    bst2.add(600);
    bst2.add(15);
    
    ArrayList<Integer> test = treeIntersection(bst1, bst2);
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(100);
    
    assertEquals("testTreeIntersection_bstOneDupVal should return:", expected, test);
  }
  
  @Test
  public void testTreeIntersection_bstMultipleDupVal() {
    bst1.add(150);
    bst1.add(100);
    bst1.add(250);
    bst1.add(75);
    bst1.add(160);
    bst1.add(125);
    bst1.add(175);
    bst1.add(200);
    bst1.add(350);
    bst1.add(300);
    bst1.add(500);
  
    bst2.add(42);
    bst2.add(100);
    bst2.add(600);
    bst2.add(15);
    bst2.add(160);
    bst2.add(200);
    bst2.add(350);
    bst2.add(125);
    bst2.add(175);
    bst2.add(4);
    bst2.add(500);
    ArrayList<Integer> test = treeIntersection(bst1, bst2);
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(100);
    expected.add(125);
    expected.add(160);
    expected.add(175);
    expected.add(200);
    expected.add(350);
    expected.add(500);
    
    assertEquals("testTreeIntersection_bstMultipleDupVal should return:", expected, test);
  }
}