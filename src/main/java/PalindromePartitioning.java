import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class PalindromePartitioning {
    List<List<String>> res = new ArrayList<>();
    Stack<String> path = new Stack<>();

    public static void main(String[] args) {
        PalindromePartitioning p = new PalindromePartitioning();
        String s = "aab";
        List<List<String>> res = p.partition(s);
        System.out.println(res);
        res.clear();
        res = p.partition("a");
        System.out.println(res);
    }

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return res;
    }

    void backtracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                path.push(s.substring(startIndex, i + 1));
                backtracking(s, i + 1);
                path.pop();
            }
        }
    }

    /**
     * 判断字符串是否是回文
     *
     * @param s
     * @param i 开始索引
     * @param j 结束索引
     * @return
     */
    private boolean isPalindrome(String s, int i, int j) {
        if (i > j) {
            return false;
        }
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// https://leetcode.cn/problems/Palindrome-Partitioning