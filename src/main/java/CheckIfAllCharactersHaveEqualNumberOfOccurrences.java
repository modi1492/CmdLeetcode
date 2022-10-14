import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences c = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
        System.out.println(c.areOccurrencesEqual("abacbc"));
        System.out.println(c.areOccurrencesEqual("aaabb"));
    }

    public boolean areOccurrencesEqual(String s) {
        if (s == null) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int count = map.get(s.charAt(i));
                count++;
                map.put(s.charAt(i), count);
            }
        }
        boolean flag = false;
        int val = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!flag) {
                val = entry.getValue();
                flag = true;
            } else {
                if (entry.getValue() != val) {
                    return false;
                }
            }
        }
        return true;
    }
}

// https://leetcode.cn/problems/Check-If-All-Characters-Have-Equal-Number-Of-Occurrences