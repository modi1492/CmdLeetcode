import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 767. 重构字符串
 */
public class ReorganizeString {
    public static void main(String[] args) {
        ReorganizeString r = new ReorganizeString();
        System.out.println(r.reorganizeString("aab"));

    }

    /**
     * 输入: S = "aab"
     * 输出: "aba"
     *
     * @param s
     * @return
     */
    public String reorganizeString(String s) {
        if (s.length() < 2) {
            return s;
        }
        // 如果数量最多的字符大于 (n+1)/2 则不能重构
        int[] counts = new int[26];
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            if(counts[s.charAt(i) - 'a'] > maxCount){
                maxCount = counts[s.charAt(i) - 'a'];
            }
        }
        if(maxCount > (s.length() + 1) / 2){
            return "";
        }
        Comparator<Character> comparator = new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return counts[c2 - 'a'] - counts[c1 - 'a'] ;
            }
        };
        // 构建一个堆将所有字符插入
        PriorityQueue<Character> pq = new PriorityQueue<>(comparator);
        // 不能遍历字符串，要遍历字母表否则会重复
        for(char c = 'a'; c <= 'z';c++){
            if(counts[c - 'a'] > 0){
                pq.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        //取出数量的两个
        while (pq.size() > 1){
            Character c1 = pq.poll();
            Character c2 = pq.poll();
            sb.append(c1);
            sb.append(c2);
            // 堆弹出来还要插进去
            counts[c1-'a']--;
            counts[c2-'a']--;
            if(counts[c1 - 'a'] > 0){
                pq.add(c1);
            }
            if(counts[c2 - 'a'] > 0){
                pq.add(c2);
            }
        }
        if(pq.size() > 0){
            sb.append(pq.poll());
        }
        return sb.toString();
    }
}
// https://leetcode.cn/problems/Reorganize-String