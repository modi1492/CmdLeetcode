import basic.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < 10;i++){
            lst.add(i);
        }
        System.out.println(lst);
        Collections.swap(lst, 0,9);
        System.out.println(lst);
    }

    public static List<Integer> preOrder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> alist = new ArrayList<>();
        TreeNode p = root;
        while(p != null || !stack.empty()){
            while(p != null){
                alist.add(p.val);
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                TreeNode temp = stack.pop();
                p = temp.right;
            }
        }
        return alist;
    }

    public static List<Integer> inOrder1(TreeNode root){
        List<Integer> alist = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p != null || !stack.empty()){
            while(p != null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                TreeNode temp = stack.pop();
                alist.add(temp.val);
                p = temp.right;
            }
        }
        return alist;
    }

    public static ArrayList postOrder1(TreeNode root){
        ArrayList alist = new ArrayList();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)
            return alist;
        TreeNode cur,pre = null;
        stack.push(root);
        while(!stack.empty()){
            cur = stack.peek();
            if((cur.left == null && cur.right == null) || (pre != null && (cur.left == pre || cur.right == pre))){
                TreeNode temp = stack.pop();
                alist.add(temp.val);
                pre = temp;
            }
            else{
                if(cur.right != null)
                    stack.push(cur.right);
                if(cur.left != null)
                    stack.push(cur.left);
            }
        }
        return alist;
    }
}

// https://leetcode.cn/problems/Test