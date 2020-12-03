import basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII{
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(0,2);
        System.out.println(lst);
    }

    /**
     * 层序遍历 将每一层插入到列表的第一个位置
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            // 遍历每一层
            List lst = new ArrayList();
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
            ans.add(0,lst);
        }
        return ans;
    }
}