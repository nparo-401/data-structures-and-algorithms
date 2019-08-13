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

  public void insertBeforeHead(T value) {
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
