package tree;

import stacksAndQueues.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T> {
  public BinarySearchTree() {
    super();
  }
  
  public void add(T value) {
    this.root = add(this.root, value);
  }
  
  private Node<T> add(Node<T> current, T value) {
    if (current == null) {
      return new Node<>(value);
    }
    
    if (value.compareTo(current.getValue()) < 0) {
      current.setLeft(add(current.getLeft(), value));
    } else if (value.compareTo(current.getValue()) > 0) {
      current.setRight(add(current.getRight(), value));
    }
    
    return current;
  }
  
  public boolean contains(T value) {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return contains(this.root, value);
  }
  
  private boolean contains(Node<T> current, T value) {
    if (current == null) {
      return false;
    }
    if (value.compareTo(current.getValue()) == 0) {
      return true;
    }
    return value.compareTo(current.getValue()) < 0 ?
     contains(current.getLeft(), value) :
     contains(current.getRight(), value);
  }
  
  public static <V> List<V> getDuplicates(Tree<V> tree) {
    List<V> originals = new ArrayList<>();
    List<V> duplicates = new ArrayList<>();
    Queue<Node<V>> nodeQueue = new Queue<>();
    nodeQueue.enqueue(tree.root);
    
    while (!nodeQueue.isEmpty()) {
      Node<V> current = nodeQueue.dequeue();
      if (current.getLeft() != null) {
        nodeQueue.enqueue(current.getLeft());
      }
      if (current.getRight() != null) {
        nodeQueue.enqueue(current.getRight());
      }
      
      if (originals.contains(current.getValue())) {
        duplicates.add(current.getValue());
      } else {
        originals.add(current.getValue());
      }
    }
    return duplicates;
  }
}
