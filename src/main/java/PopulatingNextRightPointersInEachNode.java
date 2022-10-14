import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue.peek());
    }

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node prev = null;
        Node node;
        while (!queue.isEmpty()) {
            int size = queue.size();
            // 遍历队列就相当于遍历树的层
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    prev = queue.poll();
                    node = prev;
                } else {
                    prev.next = queue.poll();
                    node = prev.next;
                    prev = node;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }
}

// https://leetcode.cn/problems/Populating-Next-Right-Pointers-In-Each-Node