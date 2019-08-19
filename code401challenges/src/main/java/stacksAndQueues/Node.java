package stacksAndQueues;

public class Node<T> {
  T value;
  Node<T> next;

  public String toString() {
    return String.valueOf(this.value);
  }
}
