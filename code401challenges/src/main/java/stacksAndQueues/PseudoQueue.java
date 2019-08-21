package stacksAndQueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
  private Stack<T> stack1;
  private Stack<T> stack2;

  PseudoQueue() {
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
  }

  public void enqueue(T value) {
    this.stack1.push(value);
  }

  public T dequeue() {
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    } else {
      looper(this.stack1, this.stack2);
      T front = this.stack2.pop();
      looper(this.stack2, this.stack1);
      return front;
    }
  }

  private void looper(Stack<T> stackToPopFrom, Stack<T> stackToPushInto) {
    while (!stackToPopFrom.isEmpty()) {
      stackToPushInto.push(stackToPopFrom.pop());
    }
  }

  public boolean isEmpty() {
    return this.stack1.getTop() == null && this.stack2.getTop() == null;
  }

  @Override
  public String toString() {
    if (this.isEmpty()) {
      return "Queue is empty";
    } else {
      StringBuilder response = new StringBuilder();
      looper(this.stack1, this.stack2);
      response.append("front -> ");
      response.append(setToString(stack2.getTop()));
      looper(this.stack2, this.stack1);
      return response.toString();
    }
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "back";
    } else {
      return node.value + " -> " + setToString(node.next);
    }
  }
}
