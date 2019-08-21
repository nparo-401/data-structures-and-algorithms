package linkedList;

public class LinkedList<T> {
  private Node<T> head;

  public LinkedList() {
    this.head = null;
  }
  
  public boolean isEmpty() {
    return this.head == null;
  }

  public void setHead(T value) {
    this.head = new Node<>(value, null);
  }

  public Node<T> getHead() {
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
    if (this.head == null) {
      return;
    }
    Node<T> current = this.head;
    if (current.getValue().equals(value)) {
      prepend(newValue);
      return;
    }
    while (current != null) {
      if (current.getNext() == null) {
        return;
      } else if (current.getNext().getValue().equals(value)) {
        break;
      }
      current = current.getNext();
    }
    if (current == null) {
      return;
    }
    Node<T> newNode = new Node<>(newValue, current.getNext());
    current.setNext(newNode);
  }

  public void insertAfter(T value, T newValue) {
    if (this.head == null) {
      return;
    }
    Node<T> current = this.head;
    while (current != null) {
      if (current.getValue().equals(value)) {
        break;
      }
      current = current.getNext();
    }
    if (current == null) {
      return;
    }
    Node<T> newNode = new Node<>(newValue, current.getNext());
    current.setNext(newNode);
  }

  public String kthFromEnd(int k) {
    int lenCount = 0;
    Node<T> current = this.head;
    while (current != null) {
      lenCount++;
      current = current.getNext();
    }

    current = this.head;
    for (int j = 1; j <= lenCount; j++) {
      if (j == lenCount - k) {
        return current.getValue().toString();
      }
      current = current.getNext();
    }
    throw new IndexOutOfBoundsException();
  }

//  Recursive mergeLists
  public static <F> LinkedList<F> mergeLists(LinkedList<F> list1, LinkedList<F> list2) {
    LinkedList<F> answer = new LinkedList<>();
    answer.head = mergeLists(list1.head, list2.head);
    return answer;
  }

  private static <F> Node<F> mergeLists(Node<F> head1, Node<F> head2) {
    if (head1 == null) {
      return head2;
    } else {
      head1.setNext(mergeLists(head2, head1.getNext()));
      return head1;
    }
  }

//  Iterative mergeLists
  public static <F> LinkedList<F> merge(LinkedList<F> firstList, LinkedList<F> secondList) {
    if (firstList.getHead() == null) {
      return secondList;
    } else if (secondList.getHead() == null) {
      return firstList;
    } else {
      Node<F> currentFirst = firstList.getHead();
      Node<F> currentSecond = secondList.getHead();
      while (currentFirst != null && currentSecond != null) {
        if (currentSecond.getValue() == null) {
          break;
        } else if (currentFirst.getNext() == null && currentSecond.getValue() != null) {
          currentFirst.setNext(currentSecond);
          break;
        } else {
          Node<F> tempFirst = currentFirst.getNext();
          Node<F> tempSecond = currentSecond.getNext();
          currentFirst.setNext(currentSecond);
          currentFirst.getNext().setNext(tempFirst);
          currentFirst = currentFirst.getNext().getNext();
          currentSecond = tempSecond;
        }
      }
      return firstList;
    }
  }

  public LinkedList<T> reverse() {
    Node<T> previous = null;
    Node<T> current = this.head;
    while (current != null) {
      Node<T> temp = current.getNext();
      current.setNext(previous);
      previous = current;
      current = temp;
    }
    this.head = previous;
    return this;
  }

  public static <F> LinkedList<F> reverse(LinkedList<F> linkedList) {
    Node<F> previous = null;
    Node<F> current = linkedList.head;
    while (current != null) {
      Node<F> temp = current.getNext();
      current.setNext(previous);
      previous = current;
      current = temp;
    }
    LinkedList<F> newLinkedList = new LinkedList<>();
    newLinkedList.head = previous;

    return newLinkedList;
  }

  @Override
  public String toString() {
    return setToString(this.head);
  }

  private String setToString(Node<T> node) {
    if (node == null) {
      return "null";
    }
    return node.getValue() + " " + setToString(node.getNext());
  }
}
