import basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/find-distance-in-a-binary-tree/ 1740. 找到二叉树中的距离 思路:
 * 1.找到两个元素的最近公共祖先 2.然后层序遍历分别计算祖先和这两个元素的距离 3.求和
 */
public class FindDistanceInABinaryTree {
    public int findDistance(TreeNode root, int p, int q) {
        if (root == null) {
            return 0;
        }
        TreeNode ancestor = findLowestCommonAncestor(root, p, q);
        if (ancestor == null) {
            return 0;
        }
        int distp = distanceOfTwoNode(ancestor, p);
        int distq = distanceOfTwoNode(ancestor, q);
        return distp + distq;
    }

    TreeNode findLowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }
        TreeNode left = findLowestCommonAncestor(root.left, p, q);
        TreeNode right = findLowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    int distanceOfTwoNode(TreeNode node, int p) {
        if(node == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        int ans = 0;
        while (!queue.isEmpty()){
            List<Integer> lst = new ArrayList<>();
            int size = queue.size();
            while (size > 0){
                TreeNode poll = queue.poll();
                lst.add(poll.val);
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
                size--;
            }
            if(lst.contains(p)){
                return ans;
            }
            ans++;
        }
        return 0;
    }
}

// https://leetcode.cn/problems/Find-Distance-In-ABinary-Tree