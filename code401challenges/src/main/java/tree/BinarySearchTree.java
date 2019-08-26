package tree;

import java.util.NoSuchElementException;

public class BinarySearchTree extends Tree<Integer> {
  BinarySearchTree() {
    super();
  }
  
  public void add(int value) {
    this.root = add(this.root, value);
  }
  
  private Node<Integer> add(Node<Integer> current, int value) {
    if (current == null) {
      return new Node<>(value);
    }
    
    if (value < current.getValue()) {
      current.setLeft(add(current.getLeft(), value));
    } else if (value > current.getValue()) {
      current.setRight(add(current.getRight(), value));
    } else {
      return current;
    }
    
    return current;
  }
  
  public boolean contains(int value) {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return contains(this.root, value);
  }
  
  private boolean contains(Node<Integer> current, int value) {
    if (current == null) {
      return false;
    }
    if (value == current.getValue()) {
      return true;
    }
    return value < current.getValue() ?
     contains(current.getLeft(), value) :
     contains(current.getRight(), value);
  }
}
