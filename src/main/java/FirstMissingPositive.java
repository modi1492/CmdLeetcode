import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public static void main(String[] args) {
        FirstMissingPositive f = new FirstMissingPositive();
        int[] nums = new int[] {1, 2, 0};
        System.out.println(f.firstMissingPositive(nums));
        nums = new int[]{3,4,-1,1};
        System.out.println(f.firstMissingPositive(nums));
        nums = new int[]{7,8,9,11,12};
        System.out.println(f.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1 && nums[i] <= len) {
                set.add(nums[i]);
            }
        }
        for (int i = 1; i <= len + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
