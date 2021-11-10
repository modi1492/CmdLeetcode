import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combinations {

    public List<List<Integer>> res = new ArrayList<>();
    public Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Combinations c = new Combinations();
        System.out.println(c.combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return res;
    }

    void backtracking(int n, int k, int firstIndex) {
        if (stack.size() == k) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int i = firstIndex; i <= n - (k - stack.size()) + 1; i++) {
            stack.push(i);
            backtracking(n, k, i + 1);
            stack.pop();
        }
    }
}
