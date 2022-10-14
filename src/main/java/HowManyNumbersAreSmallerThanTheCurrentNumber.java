import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        HowManyNumbersAreSmallerThanTheCurrentNumber h = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        System.out.println(Arrays.toString(h.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[i]) {
                    ans[i]++;
                }
                if (nums[i] < nums[j]) {
                    ans[j]++;
                }
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/How-Many-Numbers-Are-Smaller-Than-The-Current-Number