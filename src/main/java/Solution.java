public class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i + 1 < j){
            int mid = i + (j - i) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        if(nums[i] == target){
            return i;
        }
        if(nums[j] == target){
            return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{5};
        System.out.println(s.search(nums, -5));
    }
}

// https://leetcode.cn/problems/Solution