import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class FindAllNumbersDisappearedInAnArray2 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,9};
        FindAllNumbersDisappearedInAnArray2 f = new FindAllNumbersDisappearedInAnArray2();
        System.out.println(f.findDisappearedNumbers(arr));
    }

    public int findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= nums.length;i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }


}
// https://leetcode.cn/problems/Find-All-Numbers-Disappeared-In-An-Array2