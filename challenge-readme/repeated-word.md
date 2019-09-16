## Repeated Word
Create a static method which returns the first word repeated in a sentence.

### Links
* src/main/RepeatedWord
  * [RepeatedWord.java](../code401challenges/src/main/java/RepeatedWord/RepeatedWord.java)
* src/test/RepeatedWord
  * [RepeatedWordTest.java](../code401challenges/src/main/java/RepeatedWord/RepeatedWordTest.java)

### Challenge
Create a  method called `repeatedWord(String sentence)` which takes in a long string of words and returns the first word that is repeated inside the sentence.

### Approach and Efficiency
* Approach:
  * Create a method which takes in a long string, break the sentence apart on every space into a `String[]`
  * Instantiate an empty `HashTable`
  * Iterate over the `String[]` - strip the non-letter characters from the words in the array.
    * Conditional check if the hash table has the current word inside it:
      * if yes, return that word as the answer
      * if no, add the word to the hash table using `set(word, word)` using the word as the key and value.
  * If no duplicates: `return "No repeated words"`
* Method:
  * `public static String repeatedWords(String sentence)`
* Time and Space:
  * `public static String repeatedWords(String sentence)`
    * T: O(n)
    * S: O(n) - create a new `HashTable<K,V>` and a new `String[]`

### Collaboration/Resources
* Travis Cox
* Matt Stuhring
* Jack Kinne
* Melfi Perez
* Renee Messick
* Brandon Hurrington
* [Regex Non-alphanumeric character strip](https://alvinalexander.com/blog/post/java/remove-non-alphanumeric-characters-java-string)
