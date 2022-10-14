import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        SquaresOfASortedArray s = new SquaresOfASortedArray();
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(s.sortedSquares(nums)));
    }

    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (nums.length == 1) {
            return new int[]{nums[0] * nums[0]};
        }
        // 先找到绝对值最小的数字的索引
        int minAbsIndex = 0;
        int minAbs = Math.abs(nums[0]);
        int i = 0;
        while (i < nums.length) {
            if (Math.abs(nums[i]) <= minAbs) {
                minAbsIndex = i;
                minAbs = Math.abs(nums[i]);
            }
            i++;
        }
        int first = 0, second = 0;
        if (minAbsIndex + 1 < nums.length) {
            first = minAbsIndex;
            second = minAbsIndex + 1;
        } else {
            first = minAbsIndex - 1;
            second = minAbsIndex;
        }

        int[] ans = new int[nums.length];
        int index = 0; // 返回值数组索引
        while (first >= 0 && second < nums.length) {
            if (nums[first] * nums[first] < nums[second] * nums[second]) {
                ans[index++] = nums[first] * nums[first];
                first--;
            } else {
                ans[index++] = nums[second] * nums[second];
                second++;
            }
        }
        while (first >= 0) {
            ans[index++] = nums[first] * nums[first];
            first--;
        }
        while (second < nums.length) {
            ans[index++] = nums[second] * nums[second];
            second++;
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Squares-Of-ASorted-Array