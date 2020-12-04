import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal{
    public static void main(String[] args) {

    }

    /**
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()){
            while (p!=null){
                lst.add(p.val);
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                TreeNode tmp = stack.pop();
                p = tmp.right;
            }
        }
        return lst;
    }
}