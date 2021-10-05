import java.util.HashMap;
import java.util.Map;

public class CheckPermutationLcci {
    public static void main(String[] args) {
        CheckPermutationLcci c = new CheckPermutationLcci();
        System.out.println(c.CheckPermutation("abc", "bca"));
        System.out.println(c.CheckPermutation("abc", "bad"));
    }

    public boolean CheckPermutation(String s1, String s2) {
        Map<Character, Integer> map1 = getCharacterCountMap(s1);
        Map<Character, Integer> map2 = getCharacterCountMap(s2);
        if (map1.keySet().size() != map2.keySet().size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!entry.getValue().equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> getCharacterCountMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        return map;
    }
}
