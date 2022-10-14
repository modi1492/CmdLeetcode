public class HammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        HammingDistance h = new HammingDistance();
        System.out.println(h.hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        return oneNumber(x ^ y);
    }

    private int oneNumber(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n % 2;
            n /= 2;
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Hamming-Distance