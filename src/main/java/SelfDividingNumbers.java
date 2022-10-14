import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers s = new SelfDividingNumbers();
        System.out.println(s.isSelfDividingNumber(128));
        System.out.println(s.selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    boolean isSelfDividingNumber(int num) {
        int tmp = num;
        while (tmp != 0) {
            int remainder = tmp % 10;
            if (remainder == 0 || num % remainder != 0) {
                return false;
            }
            tmp /= 10;
        }
        return true;
    }
}
// https://leetcode.cn/problems/Self-Dividing-Numbers