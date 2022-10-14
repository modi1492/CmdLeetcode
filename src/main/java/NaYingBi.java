public class NaYingBi {
    public static void main(String[] args) {
        NaYingBi n = new NaYingBi();
        int[] arr = new int[]{4, 2, 1};
        System.out.println(n.minCount(arr));
        arr = new int[]{2, 3, 10};
        System.out.println(n.minCount(arr));
    }

    public int minCount(int[] coins) {
        int ans = 0;
        for (int coin : coins) {
            if (coin % 2 == 0) {
                ans += coin / 2;
            } else {
                ans += coin / 2 + 1;
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Na-Ying-Bi