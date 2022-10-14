import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};        // -4 -1 -1 0 1 2
        System.out.println(threeSum.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int first = 0; first < length; first++) {
            if (first != 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = length - 1;
            for (int second = first + 1; second < length; second++) {
                if (second != first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third && nums[first] + nums[second] + nums[third] > 0) {
                    third--;
                }
                if (second >= third) {
                    break;
                }
                if (nums[first] + nums[second] + nums[third] == 0) {
                    List lst = new ArrayList<Integer>();
                    lst.add(nums[first]);
                    lst.add(nums[second]);
                    lst.add(nums[third]);
                    ans.add(lst);
                }

            }
        }
        return ans;
    }

}



// https://leetcode.cn/problems/Three-Sum