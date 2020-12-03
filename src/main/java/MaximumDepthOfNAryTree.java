import basic.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNAryTree {
    public static void main(String[] args) {
        MaximumDepthOfNAryTree m = new MaximumDepthOfNAryTree();
        Node n1 = new Node(1);
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.children.add(n3);
        n1.children.add(n2);
        n1.children.add(n4);
        n3.children.add(n5);
        n3.children.add(n6);
        System.out.println(m.maxDepth(n1));
    }
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node poll = queue.poll();
                for (Node node : poll.children) {
                    queue.offer(node);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}