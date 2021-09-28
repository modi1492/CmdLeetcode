import java.util.HashMap;
import java.util.Map;

/** https://leetcode-cn.com/problems/is-unique-lcci/ */
public class IsUniquelcci {
    public static void main(String[] args) {
        IsUniquelcci i = new IsUniquelcci();
    }

    public boolean isUnique(String astr) {
        if (astr == null) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < astr.length(); i++) {
            if (!map.containsKey(astr.charAt(i))) {
                map.put(astr.charAt(i), 1);
            } else {
                map.put(astr.charAt(i), map.get(astr.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }
}
