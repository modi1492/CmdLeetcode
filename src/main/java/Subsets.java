import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subsets {
    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] nums = new int[] {1, 2, 3};
        System.out.println(s.subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {

        backtracking(nums, 0);
        return res;
    }

    void backtracking(int[] nums, int startIndex) {
        res.add(new ArrayList<>(stack));
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            stack.push(nums[i]);
            backtracking(nums, i + 1);
            stack.pop();
        }
    }
}
