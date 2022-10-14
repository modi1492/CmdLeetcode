import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        FindAllNumbersDisappearedInAnArray f = new FindAllNumbersDisappearedInAnArray();
//        System.out.println(f.findDisappearedNumbers(arr));
        System.out.println(f.findDisappearedNumbers2(arr));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int[] count = new int[length];
        for (int num : nums) {
            count[num - 1]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (count[i] == 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    /**
     * 不需要额外空间
     *
     * @param nums 4,3,2,7,8,2,3,1
     * @return
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Find-All-Numbers-Disappeared-In-An-Array