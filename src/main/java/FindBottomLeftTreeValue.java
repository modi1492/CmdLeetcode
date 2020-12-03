import basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeftTreeValue{
    public static void main(String[] args) {
        TreeNode t2 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        t2.left = t1;
        t2.right = t3;
        FindBottomLeftTreeValue f = new FindBottomLeftTreeValue();
        System.out.println(f.findBottomLeftValue(t2));
    }

    /**
     * 分层遍历 每一层的元素放到一个列表中
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<TreeNode> list = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            // 遍历一层 并把下一层加入队列
            list.clear();
            while (size > 0){
                TreeNode poll = queue.poll();
                size--;
                list.add(poll);
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
        }
        return list.get(0).val;
    }
}