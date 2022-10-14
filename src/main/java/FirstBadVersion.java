/**
 * 278. 第一个错误的版本
 */
public class FirstBadVersion {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        while (i + 1 < j) {
            int mid = i + (j - i) / 2;
            if (isBadVersion(mid)) {
                j = mid;
            } else {
                i = mid;
            }
        }
        if (isBadVersion(i)) {
            return i;
        }
        if (isBadVersion(j)) {
            return j;
        }
        return -1;
    }

    boolean isBadVersion(int version) {
        return true;
    }
}
// https://leetcode.cn/problems/First-Bad-Version