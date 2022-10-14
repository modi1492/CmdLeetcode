import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("]"));
        char ch1 = '(';
        char ch2 = ')';
//        System.out.println(validParentheses.isPair(ch1, ch2));
//        Deque<Character> stack = new LinkedList<Character>();
//        stack.push('a');
//        stack.push('b');
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.size());
//        stack.pop();
//        System.out.println(stack.size());
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{' || stack.isEmpty()) {
                stack.push(ch);
            } else {
                char top = stack.peek();
                if (isPair(ch, top)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }

    boolean isPair(char ch1, char ch2) {
        if (ch1 == '(' && ch2 == ')' || ch1 == ')' && ch2 == '(') {
            return true;
        }
        if (ch1 == '[' && ch2 == ']' || ch1 == ']' && ch2 == '[') {
            return true;
        }
        return ch1 == '{' && ch2 == '}' || ch1 == '}' && ch2 == '{';
    }
}
// https://leetcode.cn/problems/Valid-Parentheses