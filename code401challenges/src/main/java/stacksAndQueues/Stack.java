package stacksAndQueues;

public class Stack<T> {
  private Node<T> top;
  private int length = 0;

  public int length() {
    return this.length;
  }

  public void push(T value) {
    this.top = new Node<>(value, this.top);
    this.length++;
  }

  public T pop() {
    if (top.value == null) {
      throw new NullPointerException();
    }

    Node<T> poppedNode = this.top;
    this.top = poppedNode.next;
    poppedNode.next = null;
    this.length--;
    return poppedNode.value;
  }

  public T peek() {
    if (top.value == null) {
      throw new NullPointerException();
    }

    return top.value;
  }

  public boolean isEmpty() {
    return this.top == null;
  }

  @Override
  public String toString() {
    return "top -> " + setToString(this.top) ;
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "null";
    }

    return node.value + " -> " + setToString(node.next);
  }
}
