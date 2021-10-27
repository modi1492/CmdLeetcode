import java.util.Arrays;

/** https://leetcode-cn.com/problems/the-masseuse-lcci/ 面试题 17.16. 按摩师 */
public class TheMasseuseLcci {
    public static void main(String[] args) {
        TheMasseuseLcci l = new TheMasseuseLcci();
        int[] nums = new int[] {1, 2, 3, 1};
        System.out.println(l.massage(nums));
        nums = new int[] {2, 7, 9, 3, 1};
        System.out.println(l.massage(nums));
        nums = new int[] {2, 1, 4, 5, 3, 1, 1, 3};
        System.out.println(l.massage(nums));
    }

    public int massage(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
            }
        }
        return ans;
    }
}
