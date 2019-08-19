package stacksAndQueues;

public class Node<T> {
  T value;
  Node<T> next;

  Node() {};

  Node(T value) {
    this.value = value;
  }

  Node(T value, Node<T> next) {
    this.value = value;
    this.next = next;
  }

  public String toString() {
    return String.valueOf(this.value);
  }
}
