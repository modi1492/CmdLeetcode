public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber f = new FibonacciNumber();
        System.out.println(f.fib(30));
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long first = 0;
        long second = 1;
        long ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (first + second) % 1000000007;
            first = second;
            second = ans;
        }
        return (int) ans;
    }
}
// https://leetcode.cn/problems/Fibonacci-Number