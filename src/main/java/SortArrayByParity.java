import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity s = new SortArrayByParity();
        int[] A = new int[]{3, 1, 2, 4};
        System.out.println(Arrays.toString(s.sortArrayByParity(A)));
    }

    public int[] sortArrayByParity(int[] A) {
        if (A == null) {
            return new int[0];
        }
        int[] ans = new int[A.length];
        int front = 0, end = A.length - 1;
        for (int value : A) {
            if (value % 2 == 0) {
                ans[front++] = value;
            } else {
                ans[end--] = value;
            }
        }
        return ans;
    }
}