import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeLength {
    public static void main(String[] args) {
        LongestPalindromeLength l = new LongestPalindromeLength();
        String s = "abccccdd";
        System.out.println(l.longestPalindrome(s));
    }

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int ans = 0;
        int odd = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            if (num % 2 == 0) {
                ans += entry.getValue();
            }
            if (num % 2 == 1 && num > 2) {
                ans += num - 1;
                odd = 1;
            }
            if (num == 1) {
                odd = 1;
            }
        }
        return ans + odd;
    }
}
