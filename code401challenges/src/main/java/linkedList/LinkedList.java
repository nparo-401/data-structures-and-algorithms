package linkedList;

public class LinkedList<T> {
  private Node<T> head;

  public LinkedList() {
    this.head = null;
  }

  public void setHead(T value) {
    this.head = new Node<>(value, null);
  }

  public Node getHead() {
    return this.head;
  }

  public void prepend(T value) {
    Node<T> temp = this.head;
    this.head = new Node<>(value, temp);
  }

  public boolean includes(T valueToCheck) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.getValue().equals(valueToCheck)) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public void append(T value) {
    Node<T> current = this.head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    Node<T> newNode = new Node<>(value, null);
    current.setNext(newNode);
  }

  public void insertBefore(T value, T newValue) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.getValue().equals(value)) {
        prepend(newValue);
        return;
      } else if (current.getNext().getValue().equals(value)) {
        break;
      }
      current = current.getNext();
    }
    assert current != null;
    Node<T> newNode = new Node<>(newValue, current.getNext());
    current.setNext(newNode);
  }

  public void insertAfter(T value, T newValue) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.getValue().equals(value)) {
        break;
      }
      current = current.getNext();
    }
    assert current != null;
    Node<T> newNode = new Node<>(newValue, current.getNext());
    current.setNext(newNode);
  }

  public String toString() {
    return setToString(this.head);
  }

  private String setToString(Node<?> node) {
    if (node == null) {
      return "null";
    }
    return node.getValue() + " " + setToString(node.getNext());
  }
}
