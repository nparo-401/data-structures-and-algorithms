package stacksAndQueues;

public class Stack<T> {
  private Node<T> top;

  void push(T value) {
    Node<T> newNode = new Node<>();
    newNode.value = value;
    newNode.next = this.top;
    top = newNode;
  }

  public T pop() {
    if (top.value == null) {
      throw new NullPointerException();
    }
    Node<T> poppedNode = this.top;
    this.top = poppedNode.next;
    poppedNode.next = null;
    return poppedNode.value;
  }

  public T peek() {
    if (top.value == null) {
      throw new NullPointerException();
    }
    return top.value;
  }

  @Override
  public String toString() {
    return setToString(this.top) ;
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "null";
    }
    return node.value + " -> " + setToString(node.next);
  }
}
