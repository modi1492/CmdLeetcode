public class BinarySearch {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i + 1 < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                j = mid;
            }
            if (nums[mid] < target) {
                i = mid;
            }
        }
        if (nums[i] == target) {
            return i;
        }
        if (nums[j] == target) {
            return j;
        }
        return -1;
    }
}
// https://leetcode.cn/problems/Binary-Search