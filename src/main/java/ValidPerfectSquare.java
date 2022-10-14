public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare v = new ValidPerfectSquare();
        System.out.println(v.isPerfectSquare(16));
    }

    public boolean isPerfectSquare(int num) {
        for (long i = 0; i * i <= Integer.MAX_VALUE; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
// https://leetcode.cn/problems/Valid-Perfect-Square