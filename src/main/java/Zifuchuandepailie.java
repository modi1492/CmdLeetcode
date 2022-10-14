import java.util.ArrayList;
import java.util.List;

public class Zifuchuandepailie {
    public static void main(String[] args) {}

    public String[] permutation(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(i));
            }
        }

        return (String[]) lst.toArray();
    }
}

// https://leetcode.cn/problems/Zifuchuandepailie