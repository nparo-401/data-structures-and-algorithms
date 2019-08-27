package tree;

public class Node<T> {
  private T value;
  private Node<T> left;
  private Node<T> right;
  
  public Node(T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
  
  public Node(T value, Node<T> left, Node<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
  
  public void setLeft(Node<T> node) {
    this.left = node;
  }
  
  public void setRight(Node<T> node) {
    this.right = node;
  }
  
  public void setValue(T value) {
    this.value = value;
  }
  
  public T getValue () {
    return this.value;
  }
  
  public Node<T> getLeft () {
    return this.left;
  }
  
  public Node<T> getRight () {
    return this.right;
  }
}
