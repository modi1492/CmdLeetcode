import java.util.*;

public class IncreasingSubsequences {
    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> path = new Stack<>();

    public static void main(String[] args) {
        IncreasingSubsequences i = new IncreasingSubsequences();
        int[] nums = new int[] {4, 6, 7, 7};
        System.out.println(i.findSubsequences(nums));
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    void backtracking(int[] nums, int startIndex) {
        if (path.size() > 1) {
            res.add(new ArrayList<>(path));
        }
        Set<Integer> set = new HashSet<>(); // 用于本层去重复
        for (int i = startIndex; i < nums.length; i++) {
            if ((!path.isEmpty() && nums[i] < path.peek()) || set.contains(nums[i])) {
                continue;
            }
            path.push(nums[i]);
            set.add(nums[i]);
            backtracking(nums, i + 1);
            path.pop();
        }
    }
}

// https://leetcode.cn/problems/Increasing-Subsequences