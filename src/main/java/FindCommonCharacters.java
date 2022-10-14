import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        FindCommonCharacters f = new FindCommonCharacters();
        String[] arr = new String[]{"bella", "label", "roller"};
        System.out.println(f.commonChars(arr));
        arr = new String[]{"cool", "lock", "cook"};
        System.out.println(f.commonChars(arr));
    }

    /**
     * 记录每个字符在每个字符串中出现的最小次数
     *
     * @param a
     * @return
     */
    public List<String> commonChars(String[] a) {
        if (a == null || a.length == 0) {
            return new ArrayList<>();
        }
        // 最小数量
        int[] minNum = new int[26];
        for (int i = 0; i < a[0].length(); i++) {
            minNum[a[0].charAt(i) - 'a']++;
        }
        // 临时数组
        for (String s : a) {
            int[] num = new int[26];
            for (int i = 0; i < s.length(); i++) {
                num[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (num[i] < minNum[i]) {
                    minNum[i] = num[i];
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < minNum.length; i++) {
            if (minNum[i] != 0) {
                for (int j = 0; j < minNum[i]; j++) {
                    ans.add("" + (char) (i + 'a'));
                }
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Find-Common-Characters