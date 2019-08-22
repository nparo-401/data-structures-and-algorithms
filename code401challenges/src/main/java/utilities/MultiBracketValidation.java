package utilities;

import stacksAndQueues.Stack;

public class MultiBracketValidation {
  public static boolean multiBracketValidation(String input) {
    Stack<Character> checkStack = new Stack<>();
    char[] chars = input.toCharArray();
    for (char aChar : chars) {
      if (aChar == '{' || aChar == '[' || aChar == '(') {
        checkStack.push(aChar);
      } else if (aChar == '}' || aChar == ']' || aChar == ')') {
        if (checkStack.isEmpty()) {
          return false;
        } else if (aChar == '}' && checkStack.peek() != '{') {
          return false;
        } else if (aChar == '}' && checkStack.peek() != '{') {
          return false;
        } else if (aChar == '}' && checkStack.peek() != '{') {
          return false;
        } else {
          checkStack.pop();
        }
      }
    }
    return checkStack.isEmpty();
  }
}
