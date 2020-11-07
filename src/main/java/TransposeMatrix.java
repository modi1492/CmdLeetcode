import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix t = new TransposeMatrix();
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("\n\n");
        int[][] ans = t.transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[][] ans = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }
}