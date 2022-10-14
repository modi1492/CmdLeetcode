import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheLonelyNodes {
    public static void main(String[] args) {

    }

    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        help(root, lst);
        return lst;
    }

    private void help(TreeNode root, List<Integer> lst) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            lst.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            lst.add(root.right.val);
        }
        help(root.left, lst);
        help(root.right, lst);
    }
}
// https://leetcode.cn/problems/Find-All-The-Lonely-Nodes