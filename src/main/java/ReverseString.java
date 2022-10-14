import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        r.reverseString(arr);
        System.out.println(Arrays.toString(arr));
        arr = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        r.reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * hello           0 4  i, length - i -1
     * hannah          0 5  0  (6-1-0=5)
     *
     * @param s
     */
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
// https://leetcode.cn/problems/Reverse-String