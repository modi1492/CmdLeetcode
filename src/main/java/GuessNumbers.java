public class GuessNumbers {
    public static void main(String[] args) {

    }

    public int game(int[] guess, int[] answer) {
        int length = guess.length;
        int ans = 0;
        for (int i = 0; i < length; i++) {
            if (guess[i] == answer[i]) {
                ans += 1;
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Guess-Numbers