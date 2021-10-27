public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence l = new LongestContinuousIncreasingSubsequence();
        int[] nums = new int[] {1, 3, 5, 4, 7};
        System.out.println(l.findLengthOfLCIS(nums));
        nums = new int[] {2, 2, 2, 2, 2};
        System.out.println(l.findLengthOfLCIS(nums));
    }

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        int ans = 1;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
            }
        }
        return ans;
    }
}
