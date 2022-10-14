import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        FlippingAnImage f = new FlippingAnImage();
        System.out.println((0 + 1) % 2);
        System.out.println((1 + 1) % 2);
        int[][] arr = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(f.flipAndInvertImage(arr)));
    }

    public int[][] flipAndInvertImage(int[][] a) {
        if (a == null) {
            return new int[0][0];
        }
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            int k = a[0].length - 1;
            // 水平反转
            while (j < k) {
                int tmp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = tmp;
                j++;
                k--;
            }
            // 反转图片
            for (int l = 0; l < a[0].length; l++) {
                a[i][l] = (a[i][l] + 1) % 2;
            }
        }
        return a;
    }
}
// https://leetcode.cn/problems/Flipping-An-Image