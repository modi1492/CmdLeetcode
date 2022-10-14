public class RemoveVowelsFromAString {
    public static void main(String[] args) {
        String s1 = "leetcodeisacommunityforcoders";
        String s2 = "aeiou";
        RemoveVowelsFromAString r = new RemoveVowelsFromAString();
        System.out.println(r.removeVowels(s1));
        System.out.println(r.removeVowels(s2));
    }

    public String removeVowels(String s) {
        if (s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
// https://leetcode.cn/problems/Remove-Vowels-From-AString