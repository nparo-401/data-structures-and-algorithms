package utilities;

import stacksAndQueues.Stack;

public class MultiBracketValidation {
  public static boolean multiBracketValidation(String input) {
    Stack<Character> checkStack = new Stack<>();
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(') {
        checkStack.push(chars[i]);
      } else if (chars[i] == '}' || chars[i] == ']' || chars[i] == ')') {
        if (checkStack.isEmpty()) {
          return false;
        } else if (chars[i] == '}' && checkStack.peek() != '{') {
          return false;
        } else if (chars[i] == '}' && checkStack.peek() != '{') {
          return false;
        } else if (chars[i] == '}' && checkStack.peek() != '{') {
          return false;
        } else {
          checkStack.pop();
        }
      }
    }
    return checkStack.isEmpty();
  }
}
