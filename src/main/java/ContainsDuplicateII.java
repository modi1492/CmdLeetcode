import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        ContainsDuplicateII c = new ContainsDuplicateII();
        int[] nums = new int[] {1, 2, 3, 1};
        int k = 3;
        System.out.println(c.containsNearbyDuplicate(nums, k));
        nums = new int[] {1, 0, 1, 1};
        k = 1;
        System.out.println(c.containsNearbyDuplicate(nums, k));
        nums = new int[] {1, 2, 3, 1, 2, 3};
        k = 2;
        System.out.println(c.containsNearbyDuplicate(nums, k));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}

// https://leetcode.cn/problems/Contains-Duplicate-II