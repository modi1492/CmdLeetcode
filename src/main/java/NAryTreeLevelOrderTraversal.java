import basic.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NAryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> lst = new ArrayList<>();
            while (size > 0) {
                Node poll = queue.poll();
                lst.add(poll.val);
                for (Node node : poll.children) {
                    queue.offer(node);
                }
                size--;
            }
            ans.add(lst);
        }
        return ans;
    }
}