import java.util.Arrays;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        int num = 2147483486;
        int expect = 1585_13467;
        System.out.println(Integer.MAX_VALUE);
        NextGreaterElementIII n = new NextGreaterElementIII();
        System.out.println(n.nextGreaterElement(num));
    }

    public int nextGreaterElement(int n) {
        char[] nums = ("" + n).toCharArray();
        int i = nums.length - 2;
        // 寻找第一个非逆序的数字 not_reverse
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int start = i;
        // 从最后一个开始 寻找第一个大于not_reverse的数字
        i = nums.length - 1;
        while (i >= 0 && nums[i] <= nums[start]) {
            i--;
        }
        int stop = i;
        swap(nums, start, stop);
        reverse(nums, start + 1);
        try {
            return Integer.parseInt(new String(nums));
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * 反转字符数组
     *
     * @param nums
     * @param start
     */
    void reverse(char[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    /**
     * 交换字符数组中的两个字符
     *
     * @param nums
     * @param i
     * @param j
     */
    void swap(char[] nums, int i, int j) {
        char tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

// https://leetcode.cn/problems/Next-Greater-Element-III