import basic.TreeNode;

/**
 * 270. 最接近的二叉搜索树值
 */
public class ClosestBinarySearchTreeValue{
    public static void main(String[] args) {

    }

    double diff = Double.MAX_VALUE;


    public int closestValue(TreeNode root, double target) {
        TreeNode node = root;
        int ans = 0;
        while (node != null){
            if(Math.abs(node.val - target) < diff){
                ans = node.val;
                diff = Math.abs(node.val - target);
            }
            if(node.val == target){
                break;
            }
            if(node.val > target){
                node = node.left;
            }else {
                node = node.right;
            }
        }
        return ans;
    }


}
// https://leetcode.cn/problems/Closest-Binary-Search-Tree-Value