package stacksAndQueues;

public class Queue<T> {
  private Node<T> front;
  private Node<T> back;

  public Node<T> getFront() {
    return this.front;
  }

  public Node<T> getBack() {
    return this.back;
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node<>();
    newNode.value = value;

    if (front == null) {
      this.front = newNode;
      this.back = newNode;
      return;
    }

    this.back.next = newNode;
    this.back = newNode;
  }

  public T dequeue() {
    if (this.front == null) {
      throw new NullPointerException();
    }

    if (this.front == this.back) {
      this.back = null;
    }

    T frontValue = this.front.value;
    this.front = this.front.next;
    return frontValue;
  }

  public T peek() {
    if (this.front == null) {
      throw new NullPointerException();
    }
    return this.front.value;
  }

  @Override
  public String toString() {
    return setToString(this.front) ;
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "null";
    }
    return node.value + " -> " + setToString(node.next);
  }
}
