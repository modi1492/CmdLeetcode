public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(s.substring(0,2));
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        int length = s.length();
        String ans = "";
        boolean[][] dp = new boolean[length][length];
        for (int col = 0; col < length; col++) {
            for (int row = 0; row <= col; row++) {
                if (row == col) {
                    dp[row][col] = true;
                } else if (col - row < 3) {
                    dp[row][col] = s.charAt(row) == s.charAt(col);
                } else {
                    dp[row][col] = dp[row + 1][col - 1] && (s.charAt(row) == s.charAt(col));
                }
                if(dp[row][col] && (col - row + 1 > ans.length())){
                    ans = s.substring(row, col + 1);
                }
            }
        }
        return ans;
    }
}

