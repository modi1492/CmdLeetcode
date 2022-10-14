public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes c = new CountPrimes();
        System.out.println(c.isPrime(4));
        for (int i = 2; i < 10; i++) {
            System.out.println(" " + i + " " + c.isPrime(i));
        }
        System.out.println(c.countPrimes(10));
    }

    public int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                ans += 1;
            }
        }
        return ans;
    }

    /**
     * 7
     *
     * @param n
     * @return
     */
    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// https://leetcode.cn/problems/Count-Primes