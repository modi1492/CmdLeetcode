import java.util.Collections;

public class MaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray m = new MaximumSubarray();
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(m.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        // dp[i]为以nums[i]结尾的和最大的子数组
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        int res = Integer.MIN_VALUE;
        for (int value : dp) {
            if (value > res) {
                res = value;
            }
        }
        return res;
    }
}
