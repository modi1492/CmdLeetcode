import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permulations {
    public static void main(String[] args) {
        Permulations p = new Permulations();
        int[] nums = new int[]{1,2,3};
        System.out.println(p.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int level) {
        // 所有数都填完了
        if (level == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = level; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, level, i);
            // 继续递归填下一个数
            backtrack(n, output, res, level + 1);
            // 撤销操作
            Collections.swap(output, level, i);
        }
    }


}

// https://leetcode.cn/problems/Permulations