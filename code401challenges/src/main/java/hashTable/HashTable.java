package hashTable;

import java.util.NoSuchElementException;

public class HashTable<K,V> {
  private Node<K,V>[] map;
  
  public HashTable(int size) {
    this.map = new Node[size];
  }
  
  private int hash(K key) {
    int hashValue = 0;
    char[] letters = key.toString().toCharArray();
    for (char letter : letters) {
      hashValue += letter;
    }
    hashValue = (hashValue * 5999) % map.length;
    return hashValue;
  }
  
  public void set(K key, V value) {
    int hashVal = hash(key);
    
    if (this.map[hashVal] != null) {
      if (!this.map[hashVal].getKey().equals(key)) {
        hashMapDouble(this.map);
        set(key, value);
      } else {
        map[hashVal].setValue(value);
      }
    } else {
      map[hashVal] = new Node<>(key, value);
    }
  }
  
  public V get(K key) {
    int hashKey = hash(key);
    
    if (this.map[hashKey] != null) {
      return map[hashKey].getValue();
    } else {
      throw new NoSuchElementException();
    }
  }

  public boolean has(K key) {
    return map[hash(key)] != null;
  }
  
  private void hashMapDouble(Node<K,V>[] map) {
    this.map = new Node[map.length * 2];
    for (Node<K,V> node : map) {
      if (node != null) {
        set(node.getKey(), node.getValue());
      }
    }
  }
  
  @Override
  public String toString() {
    StringBuilder response = new StringBuilder();
    for (Node<K,V> value : this.map) {
      if (value != null) {
        response.append(value).append("\n");
      }
    }
    return response.toString();
  }
}
