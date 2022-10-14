import basic.TreeNode;

public class MinimumHeightTrees {
    public static void main(String[] args) {
        MinimumHeightTrees m = new MinimumHeightTrees() {
        };
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode t = m.sortedArrayToBST(nums);
        System.out.println(t.val);
        System.out.println("hello");
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length - 1);
    }

    private TreeNode help(int[] nums, int i, int j) {
        if (i == j) {
            return new TreeNode(nums[i]);
        }
        if (i > j) {
            return null;
        }
        int mid = i + (j - i) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums, i, mid - 1);
        root.right = help(nums, mid + 1, j);
        return root;
    }
}
// https://leetcode.cn/problems/Minimum-Height-Trees