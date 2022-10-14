import java.util.Arrays;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s1 = "hello";
        ReverseVowelsOfAString r = new ReverseVowelsOfAString();
        System.out.println(r.reverseVowels(s1));
        s1 = "leetcode";
        System.out.println(r.reverseVowels(s1));
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }
            // 交换
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u' || c =='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
// https://leetcode.cn/problems/Reverse-Vowels-Of-AString