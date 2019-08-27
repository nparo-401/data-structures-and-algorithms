package tree;

import java.util.*;

public class Tree<T> {
  Node<T> root;
  
  public Tree() {
    this.root = null;
  }
  
  public void setRoot(Node<T> node) {
    this.root = node;
  }
  
  public Node<T> getRoot() {
    return this.root;
  }
  
  public boolean isEmpty() {
    return this.root == null;
  }
    
  public List<T> preOrder() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return preOrder(this.root, new ArrayList<>());
  }
  
  private List<T> preOrder(Node<T> current, List<T> response) {
    if (current != null) {
      response.add(current.getValue());
      preOrder(current.getLeft(), response);
      preOrder(current.getRight(), response);
    }
    return response;
  }
  
  public List<T> inOrder() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return inOrder(this.root, new ArrayList<>());
  }
  
  private List<T> inOrder(Node<T> current, List<T> response) {
    if (current != null) {
      inOrder(current.getLeft(), response);
      response.add(current.getValue());
      inOrder(current.getRight(), response);
    }
    return response;
  }
  
  public List<T> postOrder() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return postOrder(this.root, new ArrayList<>());
  }
  
  private List<T> postOrder(Node<T> current, List<T> response) {
    if (current != null) {
      postOrder(current.getLeft(), response);
      postOrder(current.getRight(), response);
      response.add(current.getValue());
    }
    return response;
  }
}
