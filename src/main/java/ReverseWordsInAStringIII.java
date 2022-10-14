import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        ReverseWordsInAStringIII r = new ReverseWordsInAStringIII();
        System.out.println(r.reverseWords(s));
    }

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< split.length;i++){
            split[i] = reverseString(split[i]);
        }
        return String.join(" ", split);
    }

    private String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < s.length(); i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}

// https://leetcode.cn/problems/Reverse-Words-In-AString-III