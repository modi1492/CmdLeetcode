import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        r.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{-1};
        r.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length -1 - k);
        reverse(nums, nums.length-k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    void reverse(int[] nums, int i, int j) {
        if (i >= j) {
            return;
        }
        while (i < j) {
            int tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp;
            i++;
            j--;
        }
    }
}

// https://leetcode.cn/problems/Rotate-Array