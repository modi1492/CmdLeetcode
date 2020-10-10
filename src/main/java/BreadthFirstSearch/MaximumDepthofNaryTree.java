package BreadthFirstSearch;

import basic.Node;
import javafx.util.Pair;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthofNaryTree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children.isEmpty()) {
            return 1;
        } else {
            List<Integer> heights = new LinkedList<Integer>();
            for (Node item : root.children) {
                heights.add(maxDepth(item));
            }
            return Collections.max(heights) + 1;
        }
    }

    public int maxDepth1(Node root) {
        Queue<Pair<Node, Integer>> stack = new LinkedList<Pair<Node, Integer>>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<Node, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                for (Node c : root.children) {
                    stack.add(new Pair(c, current_depth + 1));
                }
            }
        }
        return depth;
    }

}
