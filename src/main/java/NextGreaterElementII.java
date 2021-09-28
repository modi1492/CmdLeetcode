import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        NextGreaterElementII n = new NextGreaterElementII();
        int[] nums = {100, 1, 11, 1, 120, 111, 123, 1, -1, -100};
        System.out.println(Arrays.toString(n.nextGreaterElements(nums)));
    }

    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        int count = 2 * nums.length - 1;
        for (int i = 0; i < count; i++) {
            int index = i % nums.length;
            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                res[stack.pop()] = nums[index];
            }
            stack.push(index);
        }
        return res;
    }
}
