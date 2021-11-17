import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class RestoreIpAddresses {
    private List<String> res = new ArrayList<>();
    private Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        RestoreIpAddresses r = new RestoreIpAddresses();
        //        String[] arr = {"1111", "010010", "25525511135"};
        //        List<String> res;
        //        for (String item : arr) {
        //            res = r.restoreIpAddresses(item);
        //            System.out.println(res);
        //            res.clear();
        //        }
        System.out.println(r.isValidNumber("256", 0, 2));

    }

    public List<String> restoreIpAddresses(String s) {
        backtracking(s, 0, 0);
        return res;
    }

    void backtracking(String s, int startIndex, int lastIndex) {
        if (stack.size() == 4 && lastIndex == s.length()) {
            res.add(stack.stream().map(String::valueOf).collect(Collectors.joining(".")));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValidNumber(s, startIndex, i)) {
                stack.push(s.substring(startIndex, i + 1));
                backtracking(s, i + 1, i + 1);
                stack.pop();
            } else {
                break;
            }
        }
    }

    boolean isValidNumber(String s, int i, int j) {
        if (i > j) {
            return false;
        }
        if (s.charAt(i) == '0' && i != j) {
            return false;
        }
        int num = 0;
        int count = 0;
        for (int k = i; k <= j; k++) {
            if (s.charAt(k) < '0' || s.charAt(k) > '9') {
                return false;
            }
            count++;
            if (count > 3) {
                return false;
            }
            num = 10 * num + (s.charAt(k) - '0');
        }
        return num <= 255;
    }
}
