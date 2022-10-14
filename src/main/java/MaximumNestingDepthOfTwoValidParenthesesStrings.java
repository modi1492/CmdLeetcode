import java.util.Stack;

public class MaximumNestingDepthOfTwoValidParenthesesStrings {
    public static void main(String[] args) {
        MaximumNestingDepthOfTwoValidParenthesesStrings m = new MaximumNestingDepthOfTwoValidParenthesesStrings();
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(m.maxDepth(s));
        s = "(1)+((2))+(((3)))";
        System.out.println(m.maxDepth(s));
    }

    public int maxDepth(String s) {
        if (s == null) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                if (stack.size() > ans) {
                    ans = stack.size();
                }
            }
            if (s.charAt(i) == ')') {
                stack.pop();
            }

        }
        return ans;
    }
}
// https://leetcode.cn/problems/Maximum-Nesting-Depth-Of-Two-Valid-Parentheses-Strings