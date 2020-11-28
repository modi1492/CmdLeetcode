
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings i = new IsomorphicStrings();
//        System.out.println(i.isIsomorphic("egg","add"));
//        System.out.println(i.isIsomorphic("foo","bar"));
        System.out.println(i.isIsomorphic("paper", "title"));
        System.out.println(i.isIsomorphic("aa","ba"));
        System.out.println(i.isIsomorphic("ab", "aa"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!map.containsKey(c2)) {
                map.put(c2,c1);
            }
            if(map.containsKey(c2) && c1 != map.get(c2)){
                return false;
            }
        }
        return true;
    }
}