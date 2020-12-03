import java.util.ArrayList;
import java.util.List;

/**
 * 229. 求众数 II
 */
public class MajorityElementII{
    public static void main(String[] args) {
        MajorityElementII m = new MajorityElementII();
        int[] nums = new int[]{1,1,1,3,3,2,2,2};
        System.out.println(m.majorityElement(nums));
        nums = new int[]{1};
        System.out.println(m.majorityElement(nums));
        nums = new int[]{3,2,3};
        System.out.println(m.majorityElement(nums));
    }

    /** 摩尔投票法 选出最可能的两个数 然后计算两个数出现的次数
     *1,1,1,3,3,2,2,2 -> 1 2
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {
        if(nums ==null || nums.length == 0){
            return new ArrayList<>();
        }
        int candidate1 = nums[0];
        int candidate2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == candidate1){
                count1++;
                continue;
            }
            if(nums[i] == candidate2){
                count2++;
                continue;
            }
            if(count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
                continue;
            }
            if(count2 == 0){
                candidate2 = nums[i];
                count2 = 1;
                continue;
            }
            count1--;
            count2--;
        }

        // 计数
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == candidate1){
                count1++;
                continue;
            }
            if(nums[i] == candidate2){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(count1 > nums.length / 3){
            ans.add(candidate1);
        }
        if(count2 > nums.length / 3){
            ans.add(candidate2);
        }
        return ans;
    }
}