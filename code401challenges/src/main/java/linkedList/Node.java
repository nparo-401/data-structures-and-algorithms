package linkedList;

public class Node<T> {
  private T value;
  private Node<T> next;
  private Node<T> previous;

  Node(T value, Node<T> next) {
    this.value = value;
    this.next = next;
  }

  Node(T value, Node<T> next, Node<T> previous) {
    this.value = value;
    this.next = next;
    this.previous = previous;
  }

  public T getValue() {
    return this.value;
  }

  void setNext(Node<T> node) {
    this.next = node;
  }

  public Node<T> getNext() {
    return this.next;
  }

  void setPrevious(Node<T> node) {
    this.previous = node;
  }

  public Node<T> getPrevious() {
    return this.previous;
  }

}
