import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationLcci {
    public static void main(String[] args) {
        PalindromePermutationLcci p = new PalindromePermutationLcci();
        System.out.println(p.canPermutePalindrome("tactcoa"));
    }

    public boolean canPermutePalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        int odd_count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odd_count++;
            }
        }
        return odd_count <= 1;
    }
}
