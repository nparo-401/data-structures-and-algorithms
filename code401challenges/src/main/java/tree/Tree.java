package tree;

import stacksAndQueues.Queue;

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
  
  public static <F> List<F> breadthFirst(Tree<F> tree) {
    if (tree.isEmpty()) {
      throw new NoSuchElementException();
    }
    
    List<F> response = new ArrayList<>();
    Queue<Node<F>> queue = new Queue<>();
    queue.enqueue(tree.getRoot());
    
    while (!queue.isEmpty()) {
      Node<F> current = queue.dequeue();
      response.add(current.getValue());
      if (current.getLeft() != null) {
        queue.enqueue(current.getLeft());
      }
      if (current.getRight() != null) {
        queue.enqueue(current.getRight());
      }
    }
    return response;
  }
  
  private boolean isTypeInteger(T nodeVal) {
    return nodeVal instanceof Integer;
  }
  
  public int findMaximumValue() {
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    } else if (!isTypeInteger(this.getRoot().getValue())) {
      throw new IllegalStateException("The Tree must be cast to the type of 'Integer' to use this method");
    }
    List<T> traversedTree = this.inOrder();
    int maxVal = (int)traversedTree.get(0);
    for (int i = 1; i < traversedTree.size(); i++) {
      if (maxVal < (int)traversedTree.get(i)) {
        maxVal = (int)traversedTree.get(i);
      }
    }
    return maxVal;
  }
}
