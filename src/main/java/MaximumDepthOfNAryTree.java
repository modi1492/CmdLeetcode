import basic.Node;

import java.util.List;

public class MaximumDepthOfNAryTree{
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int ans = 1;
        List<Node> children = root.children;
        if(children.size()!=0){
            int depth = 0;
            for(Node node:children){
                if(maxDepth(node) > depth){
                    depth = maxDepth(node);
                }
            }
            ans += depth;
        }
        return ans;
    }
}