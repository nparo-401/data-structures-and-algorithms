package utilities;

import tree.Node;
import tree.Tree;

public class FizzBuzzTree extends Tree<Object> {
  private static void recursion (Node<Object> current) {
    if (current != null) {
      recursion(current.getLeft());
      changer(current);
      recursion(current.getRight());
    }
  }
  
  private static void changer(Node<Object> current) {
    if ((Integer)current.getValue() % 15 == 0) {
      current.setValue("FizzBuzz");
    } else if ((Integer)current.getValue() % 5 == 0) {
      current.setValue("Buzz");
    } else if ((Integer)current.getValue() % 3 == 0) {
      current.setValue("Fizz");
    }
  }
  
  public static Tree<Object> fizzBuzzTree(Tree<Object> tree) {
    recursion(tree.getRoot());
    return tree;
  }
}
