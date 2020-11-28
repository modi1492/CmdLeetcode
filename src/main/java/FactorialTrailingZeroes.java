import java.math.BigInteger;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        FactorialTrailingZeroes f = new FactorialTrailingZeroes();
        System.out.println(f.factorial(5));
        System.out.println(f.trailingZeroes(4184));
    }

    public int trailingZeroes(int n) {
        BigInteger fac = factorial(n);
        return tailzerocount(fac);
    }

    int tailzerocount(BigInteger n) {
        int ans = 0;
        while (!n.equals(BigInteger.valueOf(1))) {
            if (n.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0))) {
                ans++;
                n = n.divide(BigInteger.valueOf(10));
            } else {
                break;
            }
        }
        return ans;
    }

    BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        }
        BigInteger ans = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}