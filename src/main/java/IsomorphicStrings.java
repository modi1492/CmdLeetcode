
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings i = new IsomorphicStrings();
//        System.out.println(i.isIsomorphic("egg", "add"));
//        System.out.println(i.isIsomorphic("foo", "bar"));
//        System.out.println(i.isIsomorphic("paper", "title"));
        System.out.println(i.isIsomorphic("ab", "aa"));
    }

    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        Map<Character, Integer> characterLastIndexMap1 = new HashMap<>();
        Map<Character, Integer> characterLastIndexMap2 = new HashMap<>();
        int length1 = s.length();
        int length2 = t.length();
        if(length1 != length2){
            return false;
        }
        for(int i = 0; i < length1;i++){
            int index1 = characterLastIndexMap1.getOrDefault(s.charAt(i), 0);
            int index2 = characterLastIndexMap2.getOrDefault(t.charAt(i), 0);
            if(index1 != index2){
                return false;
            }
            characterLastIndexMap1.put(s.charAt(i), i+1);
            characterLastIndexMap2.put(t.charAt(i), i+1);
        }
        return true;
    }
}
// https://leetcode.cn/problems/Isomorphic-Strings