import java.util.HashMap;
import java.util.Map;

public class FirstOnlyOneCharacter {
    public static void main(String[] args) {
        FirstOnlyOneCharacter f = new FirstOnlyOneCharacter();
        String s = "abaccdeff";
        System.out.println(f.firstUniqChar(s));
        System.out.println(f.firstUniqChar(""));
    }

    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }
}

// https://leetcode.cn/problems/First-Only-One-Character