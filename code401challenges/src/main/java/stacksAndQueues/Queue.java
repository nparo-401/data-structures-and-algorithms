package stacksAndQueues;

public class Queue<T> {
  private Node<T> front;
  private Node<T> back;
  private int length = 0;

  public int length() {
    return this.length;
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node<>();
    newNode.value = value;
    this.length++;

    if (front == null) {
      this.front = newNode;
      this.back = newNode;
    } else {
      this.back.next = newNode;
      this.back = newNode;
    }
  }

  public T dequeue() {
    T frontValue = peek();

    if (this.front == this.back) {
      this.back = null;
    }

    this.front = this.front.next;
    this.length--;
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
    return "front -> " + setToString(this.front) ;
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "back";
    }
    return node.value + " -> " + setToString(node.next);
  }
}
