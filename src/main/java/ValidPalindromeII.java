public class ValidPalindromeII {
    public static void main(String[] args) {
        ValidPalindromeII v = new ValidPalindromeII();
        String[] arr = new String[] {"abc"};
        for (String s : arr) {
            System.out.println(v.validPalindrome(s));
        }
    }

    public boolean validPalindrome(String s) {
        if (s == null) {
            return false;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return validPalindrome(s, i + 1, j) || validPalindrome(s, i, j - 1);
        }
        return true;
    }

    public boolean validPalindrome(String s, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
