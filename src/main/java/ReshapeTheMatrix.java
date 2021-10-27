import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        ReshapeTheMatrix r = new ReshapeTheMatrix();
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(r.matrixReshape(mat, 2, 4)));
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int rowLen = mat.length;
        int colLen = mat[0].length;
        if (r * c != rowLen * colLen) {
            return mat;
        }
        int row = 0;
        int col = 0;
        int count = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                count++;
                ans[row][col] = mat[i][j];
                col++;
                if (count % c == 0) {
                    row += 1;
                    col = 0;
                }
            }
        }
        return ans;
    }
}
