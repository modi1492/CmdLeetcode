import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public static void main(String[] args) {
        ShuffleString s = new ShuffleString();
        String str1 = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(s.restoreString(str1, indices));
    }

    public String restoreString(String s, int[] indices) {
        if (s == null || indices == null) {
            return "";
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            sb.append(s.charAt(map.get(i)));
        }
        return sb.toString();
    }
}
// https://leetcode.cn/problems/Shuffle-String