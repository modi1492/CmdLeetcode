package basic;

public class OneToMax {
    public static void main(String[] args) {

    }

    public int[] printNumbers(int n) {
        int length = 0;
        for (int i = 0; i < n; i++) {
            length = length * 10 + 9;
        }
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
