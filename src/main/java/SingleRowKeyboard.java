import java.util.HashMap;

public class SingleRowKeyboard {
    public static void main(String[] args) {
        SingleRowKeyboard s = new SingleRowKeyboard();
        String k1 = "abcdefghijklmnopqrstuvwxyz";
        String w1 = "cba";
        System.out.println(s.calculateTime(k1, w1));
        k1 = "pqrstuvwxyzabcdefghijklmno";
        w1 = "leetcode";
        System.out.println(s.calculateTime(k1, w1));
    }

    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            map.put(keyboard.charAt(i), i);
        }
        int ans = 0;
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = map.get(word.charAt(i));
            ans += Math.abs(index - prev);
            prev = index;
        }
        return ans;
    }
}