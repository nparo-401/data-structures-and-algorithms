package tree;

import java.util.NoSuchElementException;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T> {
  BinarySearchTree() {
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
}
