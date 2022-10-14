public class NextPermutation {
    public static void main(String[] args) {
        // 1,5,8,4,7,6,5,3,1   -> 4
        // 1 5 8 5 7 6 4 3 1
        // 1 5 8 5 1 3 4 6 7
        int[] nums = new int[]{1, 5, 8, 4, 7, 6, 5, 3, 1};
        NextPermutation n = new NextPermutation();
        n.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// https://leetcode.cn/problems/Next-Permutation