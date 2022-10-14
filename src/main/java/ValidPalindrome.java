public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
//        System.out.println(v.isPalindrome(s));
        s = "race a car";
        System.out.println(v.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!isDigit(c1) && !isLetter(c1)) {
                i++;
                continue;
            }
            if (!isDigit(c2) && !isLetter(c2)) {
                j--;
                continue;
            }
            if (!palindromeChar(c1, c2)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    boolean palindromeChar(char c1, char c2) {
        if (c1 == c2) {
            return true;
        }
        if (isLetter(c1) && isLetter(c2)) {
            return Math.abs((int) c1 - c2) == 32;
        }
        return false;
    }
}
// https://leetcode.cn/problems/Valid-Palindrome