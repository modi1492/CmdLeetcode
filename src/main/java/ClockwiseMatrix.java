import java.util.Arrays;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 */
public class ClockwiseMatrix {
    public static void main(String[] args) {
        ClockwiseMatrix c = new ClockwiseMatrix();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(c.spiralOrder(matrix)));
    }

    /**
     * 上下左右四个边界 遇到右边界向下 上边界+1 遇到下边界向左 右边界减1
     * 遇到左边界向上 下边界减1 遇到上边界向右 左边界+1
     *
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int column = matrix[0].length;
        int row = matrix.length;
        int leftBarrier = 0;
        int rightBarrier = matrix[0].length - 1;
        int topBarrier = 0;
        int downBarrier = matrix.length - 1;
        // 开始时方向向右
        char direct = 'r';
        // 遍历元素的数量
        int n = 0;
        int i = 0,j=0;
        int[] ans = new int[column * row];
        while (n < column * row) {
            switch (direct) {
                case 'r':
                    //向右
                    while (j <=rightBarrier){
                        ans[n] = matrix[i][j];
                        n++;
                        j++;
                    }
                    j--;
                    i++;
                    topBarrier++;
                    direct = 'd';
                    break;
                case 'd':
                    //向下
                    while (i <= downBarrier){
                        ans[n] = matrix[i][j];
                        n++;
                        i++;
                    }
                    i--;
                    j--;
                    direct = 'l';
                    rightBarrier--;
                    break;
                case 'l':
                    while (j >= leftBarrier){
                        ans[n] = matrix[i][j];
                        n++;
                        j--;
                    }
                    j++;
                    i--;
                    direct = 't';
                    downBarrier--;
                    break;
                case 't':
                    // 向上
                    while (i >= topBarrier){
                        ans[n] = matrix[i][j];
                        n++;
                        i--;
                    }
                    j++;
                    i++;
                    direct = 'r';
                    leftBarrier++;
                    break;
            }
        }
        return ans;
    }
}
