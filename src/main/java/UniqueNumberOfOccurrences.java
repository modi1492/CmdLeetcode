import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        arr = new int[]{1, 2};
        UniqueNumberOfOccurrences u = new UniqueNumberOfOccurrences();
        u.uniqueOccurrences(arr);
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.values().size();
    }
}