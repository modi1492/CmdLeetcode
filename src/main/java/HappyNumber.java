import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(19));
    }

    /**
     * 如果为1 或者循环退出
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n) && n != 1) {
            set.add(n);
            n = next(n);
        }
        return n == 1;
    }

    /**
     * 下一个数字
     *
     * @param n
     * @return
     */
    int next(int n) {
        int ans = 0;
        while (n != 0) {
            int remainder = n % 10;
            n /= 10;
            ans += remainder * remainder;
        }
        return ans;
    }
}
