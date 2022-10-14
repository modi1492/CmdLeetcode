import java.util.Arrays;

public class TwoSumLessThanK {
    public static void main(String[] args) {
        TwoSumLessThanK t = new TwoSumLessThanK();
        int[] nums = new int[]{34, 23, 1, 24, 75, 33, 54, 8};
        int k = 60;
        System.out.println(t.twoSumLessThanK(nums, k));
    }

    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            if (nums[i] + nums[j] >= k) {
                j--;
            } else {
                max = Math.max(max, nums[i] + nums[j]);
                i++;
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;

    }
}
// https://leetcode.cn/problems/Two-Sum-Less-Than-K