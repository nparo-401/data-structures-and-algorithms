package hashTable;

public class LeftJoin {
  public static String[][] leftJoin(HashTable<String,String> hashTable1, HashTable<String,String> hashTable2) {
    Node<String,String>[] map = hashTable1.getMap();
    int i = 0;
    int count = mapNotNullLength(map);
    String[][] response = new String[count][3];
    
    for (Node<String,String> node : map) {
      if (node != null) {
        response[i][0] = node.getKey();
        response[i][1] = node.getValue();
        if (hashTable2.has(node.getKey())) {
          String value = hashTable2.get(node.getKey());
          response[i][2] = value;
        } else {
          response[i][2] = null;
        }
        i++;
      }
    }
    return response;
  }
  
  private static int mapNotNullLength (Node<String,String>[] map) {
    int count = 0;
    for(Node<String,String> node : map) {
      if (node != null) {
        count++;
      }
    }
    return count;
  }
}
