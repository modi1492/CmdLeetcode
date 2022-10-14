public class IntegerBreak {
    public static void main(String[] args) {
        IntegerBreak i = new IntegerBreak();
        System.out.println(i.integerBreak(2));
        System.out.println(i.integerBreak(10));
    }

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j) * j));
            }
        }
        return dp[n];
    }
}

// https://leetcode.cn/problems/Integer-Break