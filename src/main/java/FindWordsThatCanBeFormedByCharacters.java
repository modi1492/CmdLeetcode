import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {
        FindWordsThatCanBeFormedByCharacters f = new FindWordsThatCanBeFormedByCharacters();
        String[] words = new String[]{"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(f.countCharacters(words, chars));
        words = new String[]{"hello", "world", "leetcode"};
        chars = "welldonehoneyr";
        System.out.println(f.countCharacters(words, chars));
    }

    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        Map<Character, Integer> charsMap = getMap(chars);
        //遍历单词
        for (String word : words) {
            //是否能组成单词
            boolean flag = true;
            Map<Character, Integer> wordmap = getMap(word);
            //遍历每个单词的字母
            for (Map.Entry<Character, Integer> letter : wordmap.entrySet()) {
                if (!charsMap.containsKey(letter.getKey())) {
                    flag = false;
                    break;
                }
                if (charsMap.get(letter.getKey()) < wordmap.get(letter.getKey())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans += word.length();
            }
        }
        return ans;
    }

    private Map<Character, Integer> getMap(String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}