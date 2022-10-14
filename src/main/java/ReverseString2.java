import java.util.Stack;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 */
public class ReverseString2 {
    public static void main(String[] args) {
        ReverseString2 r = new ReverseString2();
//        System.out.println(r.reverseWords("the sky is blue"));
//        System.out.println(r.reverseWords("  hello world!  "));
//        System.out.println(r.reverseWords("a good   example"));
        System.out.println(r.reverseWords(" "));
    }

    /**
     * 先找到第一个和最后一个不是空格的字符
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s.equals("")) {
            return "";
        }
        int firstNonSpace = 0;
        while (firstNonSpace < s.length() && s.charAt(firstNonSpace) == ' ') {
            firstNonSpace++;
        }
        int lastNonSpace = s.length() - 1;
        while (lastNonSpace > 0 && s.charAt(lastNonSpace) == ' ') {
            lastNonSpace--;
        }
        // 从最后一个不是空格的字符开始像前遍历 如果连续出现空格则跳过
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = lastNonSpace; i >= firstNonSpace; i--) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                continue;
            }
            // 遇到空格说明单词结束
            if (s.charAt(i) == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
                continue;
            }
            // 其他字符
            stack.add(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
// https://leetcode.cn/problems/Reverse-String2