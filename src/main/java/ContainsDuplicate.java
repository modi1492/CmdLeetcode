import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(c.containsDuplicate(nums));
        nums = new int[]{1,2,3,4};
        System.out.println(c.containsDuplicate(nums));
        nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(c.containsDuplicate(nums));

    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}

// https://leetcode.cn/problems/Contains-Duplicate