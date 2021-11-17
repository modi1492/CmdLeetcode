import java.util.*;

public class CombinationSumII {
    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> path = new Stack<>();

    public static void main(String[] args) {
        CombinationSumII c = new CombinationSumII();
        int[] candidates =
                new int[] {
                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                    1, 1, 1, 1, 1, 1, 1, 1, 1
                };
        System.out.println(c.combinationSum2(candidates, 20));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backtracking(candidates, target, 0, 0, used);
        return new ArrayList<>(res);
    }

    void backtracking(int[] candidates, int target, int sum, int index, boolean[] used) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
            if (i != 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }

            path.push(candidates[i]);
            sum += candidates[i];
            used[i] = true;
            backtracking(candidates, target, sum, i + 1, used);
            path.pop();
            sum -= candidates[i];
            used[i] = false;
        }
    }
}
