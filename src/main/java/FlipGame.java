import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipGame {
    public static void main(String[] args) {
        FlipGame f = new FlipGame();
        String s = "++++";
        System.out.println(f.generatePossibleNextMoves(s));
    }

    public List<String> generatePossibleNextMoves(String s) {
        if (s == null || s.length() < 2) {
            return new ArrayList<>();
        }
        char[] chars = s.toCharArray();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '+' && chars[i + 1] == '+') {
                chars[i] = '-';
                chars[i + 1] = '-';
                StringBuilder sb = new StringBuilder();
                for(char ch:chars){
                    sb.append(ch);
                }
                ans.add(sb.toString());
                chars[i] = '+';
                chars[i + 1] = '+';
            }
        }
        return ans;
    }
}