package stacksAndQueues;

public class Node<T> {
  T value;
  Node<T> next;

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setNext(Node<T> node) {
    this.next = node;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public String toString() {
    return String.valueOf(this.value);
  }
}
