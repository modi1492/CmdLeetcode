import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permulations2 {
    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Permulations2 p = new Permulations2();
        int[][] nums = new int[][] {{1, 2, 3}, {0, 1}, {1}};
        for (int[] num : nums) {
            List<List<Integer>> res = p.permute(num);
            System.out.println(res);
            res.clear();
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums, used);
        return res;
    }

    private void backtracking(int[] nums, boolean[] used) {
        if (stack.size() == nums.length) {
            res.add(new ArrayList<>(stack));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            stack.push(nums[i]);
            used[i] = true;
            backtracking(nums, used);
            stack.pop();
            used[i] = false;
        }
    }
}
