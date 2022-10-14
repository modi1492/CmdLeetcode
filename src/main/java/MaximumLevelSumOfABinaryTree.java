import basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public static void main(String[] args) {
        MaximumLevelSumOfABinaryTree m = new MaximumLevelSumOfABinaryTree();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(7);
        TreeNode t3 = new TreeNode(0);
        TreeNode t4 = new TreeNode(7);
        TreeNode t5 = new TreeNode(-8);
        t1.left = t2; t1.right = t3;
        t2.left = t4; t2.right = t5;
        System.out.println(m.maxLevelSum(t1));
    }

    /**
     * 层序遍历求出最大值 把每层的和放到数组中 遍历数组输出拥有最大值的最小层
     *
     * @param root
     * @return
     */
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxSum = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            // 遍历一层
            int sum = 0;
            while (size > 0) {
                TreeNode poll = queue.poll();
                sum += poll.val;
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
                size--;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            list.add(sum);
        }
        for (Integer item : list) {
            if (item == maxSum) {
                return list.indexOf(item) + 1;
            }
        }
        return -1;
    }
}
// https://leetcode.cn/problems/Maximum-Level-Sum-Of-ABinary-Tree