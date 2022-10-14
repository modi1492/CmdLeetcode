import java.util.Arrays;

public class ReverseStringII {
    public static void main(String[] args) {
        ReverseStringII r = new ReverseStringII();
        //        System.out.println(r.reverseStr("abcdefg", 2));
        System.out.println(r.reverseStr("abcd", 4));
    }

    public String reverseStr(String s, int k) {
        int length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i += 2 * k) {
            if (length - i < k) {
                reverse(chars, i, length - 1);
            } else if (length - i >= k && length - i < 2 * k) {
                reverse(chars, i, i + k - 1);
                break;
            } else {
                reverse(chars, i, i + k - 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }

    void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
    }
}

// https://leetcode.cn/problems/Reverse-String-II