public class PowxN {
    public static void main(String[] args) {
        PowxN p = new PowxN();
        System.out.println(p.myPow(2.00000, 10));
        System.out.println(p.myPow(2.10000, 3));
        System.out.println(p.myPow(2.00000, -2));
        System.out.println(1 == 1.0);
    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if(x == 1){
            return 1;
        }
        if(x == -1){
            return -1;
        }
        int absN = Math.abs(n);
        double res = 1;
        for (int i = 0; i < absN; i++) {
            res *= x;
        }
        if (n > 0) {
            return res;
        } else {
            return 1 / res;
        }
    }
}

// https://leetcode.cn/problems/Powx-N