import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PermutationsII {

    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> path = new Stack<>();

    public static void main(String[] args) {
        PermutationsII p = new PermutationsII();
        int[][] nums = new int[][] {{1, 1, 2}, {1, 2, 3}};
        for (int[] num : nums) {
            List<List<Integer>> res = p.permuteUnique(num);
            System.out.println(res);
            res.clear();
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtracking(nums, used);
        return res;
    }

    void backtracking(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                path.push(nums[i]);
                used[i] = true;
                backtracking(nums, used);
                path.pop();
                used[i] = false;
            }
        }
    }
}
