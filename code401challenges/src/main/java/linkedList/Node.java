package linkedList;

public class Node<T> {
  private T data;
  private Node<T> next;
  private Node<T> previous;

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public Node(T data, Node<T> next, Node<T> previous) {
    this.data = data;
    this.next = next;
    this.previous = previous;
  }

  public T getValue() {
    return this.data;
  }

  public void setNext(Node<T> node) {
    this.next = node;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public void setPrevious(Node<T> node) {
    this.previous = node;
  }

  public Node<T> getPrevious() {
    return this.previous;
  }

}
