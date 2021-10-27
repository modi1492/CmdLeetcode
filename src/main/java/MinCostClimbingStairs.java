public class MinCostClimbingStairs {
    public static void main(String[] args) {
        MinCostClimbingStairs m = new MinCostClimbingStairs();
        int[] cost = new int[] {10, 15, 20};
        System.out.println(m.minCostClimbingStairs(cost));
        cost = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(m.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len]; // dp[i] 到达第i个阶梯的最小花费
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }
        return Math.min(dp[len - 1], dp[len - 2]);
    }
}
