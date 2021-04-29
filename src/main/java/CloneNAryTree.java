import java.util.ArrayList;
import java.util.List;

/**
 *  https://leetcode-cn.com/problems/clone-n-ary-tree/
 */



public class CloneNAryTree{
    class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val,ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    public Node cloneTree(Node root) {
        if(root == null){
            return null;
        }
        Node node = new Node(root.val, new ArrayList<>());
        visit(root, node);
        return node;
    }

    /**
     *  对于sourceNode的每个子节点，克隆，并add到destiNode的子节点列表中
     * @param sourceNode 源Node
     * @param destiNode 目的 Node
     */
    void visit(Node sourceNode, Node destiNode){
        if( sourceNode == null){
            return;
        }
        for(int i = 0; i < sourceNode.children.size();i++){
            Node tmp = new Node(sourceNode.children.get(i).val, new ArrayList<>());
            destiNode.children.add(tmp);
            visit(sourceNode.children.get(i), destiNode.children.get(i));
        }
    }
}