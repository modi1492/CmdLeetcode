public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();
        System.out.println(v.isAnagram("rat","car"));

    }

    public boolean isAnagram(String s, String t) {
        int[] num1 = new int[256];
        int[] num2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            num1[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            num2[t.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (num1[i] != num2[i]) {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.cn/problems/Valid-Anagram