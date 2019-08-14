package linkedList;

public class DoublyLinkedList<T> {
  private Node<T> head;
  private Node<T> tail;

  public DoublyLinkedList() {
    this.head = this.tail = null;
  }

  public void setHead(T value) {
    this.head = new Node<>(value, tail, null);
  }

  public Node getHead() {
    return this.head;
  }

  public void setTail(T value) {
    this.tail = new Node<>(value, null, head);
    this.tail.getPrevious().setNext(this.tail);
  }

  public Node getTail() {
    return this.tail;
  }

  public void prepend(T value) {
    Node<T> temp = this.head;
    Node<T> current = new Node<>(value, temp, null);
    if (this.head.getNext() == null) {
      this.tail = this.head;
    }
    this.head.setPrevious(current);
    this.head = current;
  }

  public void append(T value) {
    Node<T> temp = this.tail;
    this.tail = new Node<>(value, null, temp);
  }

//  TODO: Finish
  public void insertFromBeforeHead(T valueToBeAdded, T valueToInsertBefore) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.getValue().equals(valueToInsertBefore)) {
        current = new Node<>(valueToBeAdded, current, current.getPrevious());
      }
    }
  }

//  TODO: Finish
  public void insertFromAfterHead(T value) {
    Node<T> current = this.head;
  }

  public boolean includesFromHead(T valueToCheck) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.getValue().equals(valueToCheck)) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public boolean includesFromTail(T valueToCheck) {
    Node<T> current = this.tail;
    while (current != null) {
      if (current.getValue().equals(valueToCheck)) {
        return true;
      }
      current = current.getPrevious();
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder response = new StringBuilder();
    Node<T> current = this.head;
    while (current != null) {
      if (current.getNext() != null) {
        response.append(current.getValue()).append(" ");
      } else {
        response.append(current.getValue());
      }
      current = current.getNext();
    }
    return response.toString();
  }
}
