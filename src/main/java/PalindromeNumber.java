public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(1));
        System.out.println(palindromeNumber.isPalindrome(0));
        System.out.println(palindromeNumber.isPalindrome(1221));
        System.out.println(palindromeNumber.isPalindrome(12321));
    }

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int halfReverse = 0;
        while (halfReverse < x) {
            halfReverse = halfReverse * 10 + x % 10;
            x /= 10;
        }
        return x == halfReverse || x == halfReverse / 10;
    }
}

// https://leetcode.cn/problems/Palindrome-Number