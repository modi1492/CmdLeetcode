public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {}

    public int removeDuplicates(int[] nums) {
        int p = 0, q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}

// https://leetcode.cn/problems/Remove-Duplicates-From-Sorted-Array