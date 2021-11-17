import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum{
    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> path = new Stack<>();
    public static void main(String[] args) {
        CombinationSum c = new CombinationSum();
        int[] candidates = new int[]{2,3,6,7};
        List<List<Integer>> res = c.combinationSum(candidates, 7);
        System.out.println(res);
        res.clear();
        candidates = new int[]{2,3,5};
        res = c.combinationSum(candidates, 8);
        System.out.println(res);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, 0, target,0);
        return res;
    }

    private void backtracking(int[] candidate,  int sum, int target, int index){
        if(sum > target){
            return;
        }
        if(sum ==  target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i= index; i < candidate.length; i++){
            path.push(candidate[i]);
            sum += candidate[i];
            backtracking(candidate, sum, target, i);
            path.pop();
            sum -= candidate[i];
        }
    }
}