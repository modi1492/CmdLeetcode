import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 442. 数组中重复的数据
 */
public class FindAllDuplicatesInAnArray{
    public static void main(String[] args) {
        FindAllDuplicatesInAnArray f = new FindAllDuplicatesInAnArray();
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(f.findDuplicates(nums));
    }

    /**
     * 4,3,2,7,8,2,3,1
     * 如果出现一次则把相应的数字取反 返回最后为正数的
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                ans.add(index+1);
            }
            nums[index] = -nums[index];
        }
        System.out.println(Arrays.toString(nums));
        return ans;
    }
}
// https://leetcode.cn/problems/Find-All-Duplicates-In-An-Array