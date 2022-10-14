public class FixedPoint {
    public static void main(String[] args) {

    }

    public int fixedPoint(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (i == A[i]) {
                return i;
            }
        }
        return -1;
    }
}
// https://leetcode.cn/problems/Fixed-Point