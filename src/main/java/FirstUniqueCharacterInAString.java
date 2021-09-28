import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();
        System.out.println(f.firstUniqChar("leetcode"));
        System.out.println(f.firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return res;
    }
}
