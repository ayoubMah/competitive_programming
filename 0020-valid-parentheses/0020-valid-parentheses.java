import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        char openParen = '(';
        char openBracket = '{';
        char openSquare = '[';
        char closeParen = ')';
        char closeBracket = '}';
        char closeSquare = ']';

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == openParen || currentChar == openBracket || currentChar == openSquare) {
            stack.push(currentChar);
            } else if (currentChar == closeParen) {
                if (!stack.empty() && stack.peek() == openParen) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (currentChar == closeSquare) {
                if (!stack.empty() && stack.peek() == openSquare) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (currentChar == closeBracket) {
                if (!stack.empty() && stack.peek() == openBracket) {
                    stack.pop();
                } else {
                    return false;
                }
            }
    }

    return stack.empty();
    
    }
}