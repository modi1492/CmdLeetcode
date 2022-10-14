import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public static void main(String[] args) {
        SetMismatch s = new SetMismatch();
        int[] nums = new int[] {1, 2, 2, 4};
        System.out.println(Arrays.toString(s.findErrorNums(nums)));
        nums = new int[] {3, 2, 2};
        System.out.println(Arrays.toString(s.findErrorNums(nums)));
    }

    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int[] res = new int[2];
        for (int i = 1; i <= nums.length; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 2) {
                res[0] = i;
            }
            if (count == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}

// https://leetcode.cn/problems/Set-Mismatch