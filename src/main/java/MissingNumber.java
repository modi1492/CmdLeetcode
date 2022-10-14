public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(m.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expect = (1 + n) * n / 2;
        int sum = 0;
        for (int item : nums) {
            sum += item;
        }
        return expect - sum;
    }
}

// https://leetcode.cn/problems/Missing-Number