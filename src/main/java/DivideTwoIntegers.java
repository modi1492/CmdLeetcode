public class DivideTwoIntegers {
    public static void main(String[] args) {
        DivideTwoIntegers d = new DivideTwoIntegers();
        int dividend1 = 10, divisor1 = 3;
        int dividend2 = 7, divisor2 = -3;
        int dividend3 = 1, divisor3 = 1;
        int dividend4 = -2147483648, divisor4 = -1;
        System.out.println(d.divide(dividend1, divisor1));
        System.out.println(d.divide(dividend2, divisor2));
        System.out.println(d.divide(dividend3, divisor3));
        System.out.println(d.divide(dividend4, divisor4));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.abs(Integer.MIN_VALUE));

    }

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);
        int quotient = 0;
        int sum = 0;
        while (sum <= absDividend) {
            quotient++;
            sum += absDivisor;
        }
        quotient--;
        if (sameSymbol(dividend, divisor)) {
            return quotient;
        } else {
            return -quotient;
        }
    }

    boolean sameSymbol(int a, int b) {
        return (a > 0 && b > 0) || (a < 0 && b < 0);
    }
}
// https://leetcode.cn/problems/Divide-Two-Integers