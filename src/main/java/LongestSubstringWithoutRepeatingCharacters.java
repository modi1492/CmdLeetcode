import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "pwwkew";
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int ans = 0;
        int right = 0;
        int length = s.length();
        for (int left = 0; left < length; left++) {
            if (left != 0) {
                set.remove(s.charAt(left - 1));
            }
            while (right < length && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}