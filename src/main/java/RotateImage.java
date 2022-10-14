import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage r = new RotateImage();
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        r.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    /**
     * 将矩阵先水平翻转 再沿主对角线翻转 matrix[i_new][j_new] = matrix[length - 1 - i][j]
     *
     * <p>matrix[i_new][j_new] = matrix[j][i]
     *
     * <p>综合 matrix[i_new][j_new] = matrix[j][length - 1 -i]
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return;
        }
        int length = matrix.length;
        // 水平翻转
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length; j++) {
                swap(matrix, i, j, length - 1 - i, j);
            }
        }
        // 主对角线翻转
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    void swap(int[][] matrix, int i, int j, int other_i, int other_j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[other_i][other_j];
        matrix[other_i][other_j] = temp;
    }
}

// https://leetcode.cn/problems/Rotate-Image