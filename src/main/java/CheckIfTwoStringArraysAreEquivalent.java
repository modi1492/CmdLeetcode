/**
 * 1662. 检查两个字符串数组是否相等
 */
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        CheckIfTwoStringArraysAreEquivalent c = new CheckIfTwoStringArraysAreEquivalent();
        String[] s1 = new String[]{"ab", "c"};
        String[] s2 = new String[]{"a", "bc"};
        System.out.println(c.arrayStringsAreEqual(s1,s2));
        s1 = new String[]{"a", "cb"};
        s2 = new String[]{"ab", "c"};
        System.out.println(c.arrayStringsAreEqual(s1,s2));
    }

    /**
     *
     * @param word1
     * @param word2
     * @return
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for(String s : word1){
            sb1.append(s);
        }
        StringBuilder sb2 = new StringBuilder();
        for(String s : word2){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());

    }
}

// https://leetcode.cn/problems/Check-If-Two-String-Arrays-Are-Equivalent