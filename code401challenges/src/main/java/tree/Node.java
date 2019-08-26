package tree;

public class Node<T> {
  private T value;
  private Node<T> left;
  private Node<T> right;
  
  Node(T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
  
  public void setLeft(Node<T> node) {
    this.left = node;
  }
  
  public void setRight(Node<T> node) {
    this.right = node;
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
