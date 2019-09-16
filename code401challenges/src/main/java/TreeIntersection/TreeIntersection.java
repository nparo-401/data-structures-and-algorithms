package TreeIntersection;

import tree.BinarySearchTree;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {
  public static <V> ArrayList<V> treeIntersection(Tree<V> tree1, Tree<V> tree2) {
    ArrayList<V> response = new ArrayList<>();
    if (tree1.isEmpty() || tree2.isEmpty()) {
      return response;
    } else {
      List<V> inTree1 = tree1.inOrder();
      List<V> inTree2 = tree2.inOrder();
      for (V val : inTree1) {
        if (inTree2.contains(val)) {
          response.add(val);
        }
      }
      return response;
    }
  }
  
  public static <V extends Comparable<V>> ArrayList<V> treeIntersection(BinarySearchTree<V> bst1,
                                                  BinarySearchTree<V> bst2) {
    ArrayList<V> response = new ArrayList<>();
    if (bst1.isEmpty() || bst2.isEmpty()) {
      return response;
    } else {
      List<V> inTree1 = bst1.inOrder();
      List<V> inTree2 = bst2.inOrder();
      for (V v : inTree1) {
        if (inTree2.contains(v)) {
          response.add(v);
        }
      }
      return response;
    }
  }
}
