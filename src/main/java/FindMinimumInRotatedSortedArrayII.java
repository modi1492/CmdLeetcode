public class FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArrayII f = new FindMinimumInRotatedSortedArrayII();
        int[] arr = new int[] {3, 3, 1, 3};
                System.out.println(f.findMin(arr));
        arr = new int[] {2, 2, 2, 0, 1};
                System.out.println(f.findMin(arr));
        arr = new int[] {1, 3, 4};
        System.out.println(f.findMin(arr));
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right -= 1;
            }
        }
        return nums[left];
    }
}

// https://leetcode.cn/problems/Find-Minimum-In-Rotated-Sorted-Array-II