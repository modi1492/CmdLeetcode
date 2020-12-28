
import java.util.*;
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph{
    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        Node ans = new Node(node.val, new ArrayList<>());
        map.put(node, ans);
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            Node newParent = map.get(poll);
            List<Node> children = poll.neighbors;
            for(Node child: children){
//                queue.offer(child);// 不能放在if外面
                if(!map.containsKey(child)){
                    map.put(child, new Node(child.val, new ArrayList<>()));
                    queue.offer(child);
                }
                Node newChild = map.get(child);
                newParent.neighbors.add(newChild);
            }

        }
        return ans;
    }
}