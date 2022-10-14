import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        FloodFill f = new FloodFill();
        int[][] image = new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        //        System.out.println(Arrays.deepToString(f.floodFill(image, 1, 1, 2)));

        image = new int[][] {{0, 0, 0}, {0, 1, 1}};
        System.out.println(Arrays.deepToString(f.floodFill(image, 1, 1, 1)));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0 || image[0] == null || image[0].length == 0) {
            return image;
        }
        int oldColor = image[sr][sc];
        boolean[][] isVisited = new boolean[image.length][image[0].length];
        image[sr][sc] = newColor;
        isVisited[sr][sc] = true;
        help(image, sr, sc, newColor, oldColor, isVisited);
        return image;
    }

    void help(int[][] image, int sr, int sc, int newColor, int oldColor, boolean[][] isVisited) {
        int rowLen = image.length;
        int colLen = image[0].length;
        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 上下 左右
        for (int[] dirction : directions) {
            int newSr = sr + dirction[0];
            int newSc = sc + dirction[1];
            if (newSr >= 0
                    && newSr < rowLen
                    && newSc >= 0
                    && newSc < colLen
                    && image[newSr][newSc] == oldColor
                    && !isVisited[newSr][newSc]) {
                image[newSr][newSc] = newColor;
                isVisited[newSr][newSc] = true;
                help(image, newSr, newSc, newColor, oldColor, isVisited);
            }
        }
    }
}

// https://leetcode.cn/problems/Flood-Fill