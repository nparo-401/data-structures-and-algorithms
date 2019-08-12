package linkedList;

public class LinkedList<T> {
  public Node<T> head;

  public LinkedList() {
    this.head = null;
  }

  public void setHead(T item) {
    this.head = new Node<>(item, null);
  }

  public void insert(T item) {
    Node<T> temp = this.head;
    this.head = new Node<>(item, temp);
  }

  public boolean includes(T valueToCheck) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.data.equals(valueToCheck)) return true;
      current = current.next;
    }
    return false;
  }

  public String toString() {
    StringBuilder response = new StringBuilder();
    Node<T> current = this.head;
    while (current != null) {
      if (current.next != null) {
        response.append(current.data).append(" ");
      } else {
        response.append(current.data);
      }
      current = current.next;
    }
    return response.toString();
  }
}
