public class XorOperationInAnArray {
    public static void main(String[] args) {
        int a = 0, b = 2;
        System.out.println(a ^ b);
    }

    public int xorOperation(int n, int start) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Xor-Operation-In-An-Array