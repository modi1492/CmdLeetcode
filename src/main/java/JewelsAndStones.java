import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String J1 = "aA";
        String S1 = "aAAbbbb";
        String J2 = "z";
        String S2 = "ZZ";
        JewelsAndStones j = new JewelsAndStones();
        System.out.println(j.numJewelsInStones(J1, S1));
        System.out.println(j.numJewelsInStones(J2, S2));
    }

    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                ans += 1;
            }
        }
        return ans;
    }
}