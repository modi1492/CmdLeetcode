import java.util.HashSet;
import java.util.Set;

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(target - num)) {
                return new int[]{target - num, num};
            } else {
                set.add(num);
            }
        }
        return new int[0];
    }
}
