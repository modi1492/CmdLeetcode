public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber h = new HouseRobber();
        int[] nums = new int[] {1, 2, 3, 1};
        System.out.println(h.rob(nums));
        nums = new int[] {2, 7, 9, 3, 1};
        System.out.println(h.rob(nums));
    }

    public int rob(int[] nums) {
        // dp[i]偷盗到第i个房屋的时候的最高金额
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], dp[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }

}
