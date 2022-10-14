/** https://leetcode-cn.com/problems/find-majority-element-lcci/ */
public class FindMajorityElementLcci {
    public static void main(String[] args) {}

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int candidate = -1;
        int count = 0;
        for (int value : nums) {
            if (count == 0) {
                candidate = value;
                count++;
                continue;
            }
            if (value == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count * 2 > nums.length ? candidate : -1;
    }
}

// https://leetcode.cn/problems/Find-Majority-Element-Lcci