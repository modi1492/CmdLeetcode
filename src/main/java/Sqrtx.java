public class Sqrtx {

    public static void main(String[] args) {
        Sqrtx s = new Sqrtx();
        int[] arr = new int[]{0, 1, 2, 2147395600};
        System.out.println(s.mySqrt(2147395600));   //46340.0
        System.out.println(Math.sqrt(2147395600));
//        System.out.println(Integer.MAX_VALUE);
        long ans = 46341L * 46341L;
    }

    public int mySqrt(int x) {
        int i = 0;
        for (; i <= x; i++) {
            long square = (long) i * (long) i;
            if (square > x) {
                break;
            }
        }
        return i - 1;
    }
}

// https://leetcode.cn/problems/Sqrtx