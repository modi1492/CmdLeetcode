public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] nums = new int[] {2, 2, 1};
        System.out.println(s.singleNumber(nums));
        nums = new int[] {4, 1, 2, 1, 2};
        System.out.println(s.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

// https://leetcode.cn/problems/Single-Number