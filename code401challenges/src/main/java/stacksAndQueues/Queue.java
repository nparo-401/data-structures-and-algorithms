package stacksAndQueues;

import java.util.NoSuchElementException;

public class Queue<T> {
  private Node<T> front;
  private Node<T> back;
  private int length = 0;

  public int length() {
    return this.length;
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node<>(value);
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
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return this.front.value;
    }
  }

  public boolean isEmpty() {
    return this.front == null;
  }

  @Override
  public String toString() {
    return "front -> " + setToString(this.front) ;
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "back";
    } else {
      return node.value + " -> " + setToString(node.next);
    }
  }
}
