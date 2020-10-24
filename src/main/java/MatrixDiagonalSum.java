public class MatrixDiagonalSum {
    public static void main(String[] args) {
        MatrixDiagonalSum m = new MatrixDiagonalSum();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        mat = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(m.diagonalSum(mat));
    }

    public int diagonalSum(int[][] mat) {
        if (mat == null) {
            return 0;
        }
        int length = mat.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i];
        }
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            sum += mat[i][j];
        }
        if (length % 2 == 1) {
            sum -= mat[length / 2][length / 2];
        }
        return sum;
    }
}