import java.util.Arrays;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray f = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] nums = new int[]{5,7,7,8,8,10}; int target = 8;
        System.out.println(Arrays.toString(f.searchRange(nums, target)));
        nums = new int[]{5,7,7,8,8,10}; target = 6;
        System.out.println(Arrays.toString(f.searchRange(nums,target)));
    }

    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length ==0){
            return new int[]{-1,-1};
        }
        int first = -1;
        int last = -1;
        int i = 0;
        int j = nums.length - 1;
        //  寻找第一个出现的位置
        while (i + 1 < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] < target) {
                i = mid;
            } else if (nums[mid] == target) {
                j = mid;
            } else {
                j = mid;
            }
        }
        if (nums[j] == target) {
            first = j;
        }
        if (nums[i] == target) {
            first = i;
        }
        // 寻找最后一次出现的位置
        i = 0;
        j = nums.length - 1;
        while (i + 1 < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] < target) {
                i = mid;
            } else if (nums[mid] == target) {
                i = mid;
            } else {
                j = mid;
            }
        }
        if (nums[i] == target) {
            last = i;
        }
        if (nums[j] == target) {
            last = j;
        }
        return new int[]{first, last};
    }
}
// https://leetcode.cn/problems/Find-First-And-Last-Position-Of-Element-In-Sorted-Array