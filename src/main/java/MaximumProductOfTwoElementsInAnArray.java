public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 4, 5};
        MaximumProductOfTwoElementsInAnArray m = new MaximumProductOfTwoElementsInAnArray();
        System.out.println(m.maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int largest = 1;
        int secondLarget = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= largest) {
                secondLarget = largest;
                largest = nums[i];
                continue;
            }
            if (nums[i] >= secondLarget) {
                secondLarget = nums[i];
            }
        }
        return (largest - 1) * (secondLarget - 1);
    }
}
// https://leetcode.cn/problems/Maximum-Product-Of-Two-Elements-In-An-Array