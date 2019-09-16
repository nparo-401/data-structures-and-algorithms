package RepeatedWord;

import hashTable.HashTable;

public class RepeatedWord {
  public static String repeatedWord(String sentence) {
    HashTable<String, String> repeatTable = new HashTable<>(1024);
    String[] sentArr = sentence.split(" ");
    for(String word : sentArr) {
      word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
      if (repeatTable.has(word)) {
        return word;
      } else {
        repeatTable.set(word, word);
      }
    }
    return "No repeated words";
  }
}
