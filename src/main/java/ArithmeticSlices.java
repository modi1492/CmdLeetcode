import java.util.Arrays;

public class ArithmeticSlices {
    public static void main(String[] args) {
        ArithmeticSlices a = new ArithmeticSlices();
        int[] nums = new int[] {1, 2, 3, 4};
        System.out.println(a.numberOfArithmeticSlices(nums));
        nums = new int[] {1};
        System.out.println(a.numberOfArithmeticSlices(nums));
    }

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int res = 0;
        for (int item : dp) {
            res += item;
        }
        return res;
    }
}
