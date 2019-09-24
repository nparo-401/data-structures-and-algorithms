package stacksAndQueues;

public class Reverse {
  public static <F> Queue<F> reverse(Queue<F> q) {
    Stack<F> s = reversed(q, new Stack<>());
    return reQ(s, q);
  }
  
  private static <F> Stack<F> reversed(Queue<F> q, Stack<F> s) {
    if (q.isEmpty()) {
      return s;
    } else {
      s.push(q.dequeue());
      return reversed(q, s);
    }
  }
  
  private static <F> Queue<F> reQ(Stack<F> s, Queue<F> q) {
    if (s.isEmpty()) {
      return q;
    } else {
      q.enqueue(s.pop());
      return reQ(s, q);
    }
  }
}
