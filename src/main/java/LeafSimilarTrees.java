import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        LeafSimilarTrees l = new LeafSimilarTrees();
        System.out.println(l.leafSimilar(t1,t1));
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst1 = getLeafNode(root1);
        List<Integer> lst2 = getLeafNode(root2);
        if (lst1.size() != lst2.size()) {
            return false;
        }
        int len = Math.min(lst1.size(), lst2.size());
        for (int i = 0; i < len; i++) {
            if (!lst1.get(i).equals(lst2.get(i))) {
                return false;
            }
        }
        return true;
    }

    List<Integer> getLeafNode(TreeNode treeNode) {
        List<Integer> lst = new ArrayList<>();
        help(treeNode, lst);
        return lst;
    }

    void help(TreeNode treeNode, List<Integer> lst) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left == null && treeNode.right == null) {
            lst.add(treeNode.val);
        }
        help(treeNode.left, lst);
        help(treeNode.right, lst);
    }
}
