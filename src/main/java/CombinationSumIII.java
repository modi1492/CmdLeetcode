import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSumIII {

    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> path = new Stack<>();

    public static void main(String[] args) {
        CombinationSumIII c = new CombinationSumIII();
        List<List<Integer>> res = c.combinationSum3(3, 7);
        System.out.println(res);
        res.clear();
        res = c.combinationSum3(3, 9);
        System.out.println(res);
        //        Stack<Integer> stack = new Stack<>();
        //        stack.push(1);
        //        stack.push(2);
        //        System.out.println(c.sumStack(stack));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 0,1);
        return res;
    }

    /**
     *
     * @param k 数字的数量
     * @param n 和
     * @param sum
     * @param firstIndex
     */
    void backtracking(int k, int n, int sum, int firstIndex) {
        if (path.size() == k) {
            if(sum > n){
                return;
            }
            if (sum == n) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = firstIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.push(i);
            sum += i;
            backtracking(k, n, sum,i + 1);
            path.pop();
            sum -= i;
        }
    }

}
