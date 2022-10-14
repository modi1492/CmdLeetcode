import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        BackspaceStringCompare b = new BackspaceStringCompare();
        System.out.println(b.backspaceCompare("ab#c", "ad#c"));
        System.out.println(b.backspaceCompare("ab##", "c#d#"));
        System.out.println(b.backspaceCompare("a##c", "#a#c"));
        System.out.println(b.backspaceCompare("a#c", "b"));
    }

    public boolean backspaceCompare(String S, String T) {
        String newS = getString(S);
        String newT = getString(T);
        return newS.equals(newT);
    }

    String getString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
// https://leetcode.cn/problems/Backspace-String-Compare