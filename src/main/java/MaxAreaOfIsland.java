import java.util.Stack;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        MaxAreaOfIsland m = new MaxAreaOfIsland();
        int[][] arr =
                new int[][] {
                    {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                };
        //        System.out.println(m.maxAreaOfIsland(arr));
        arr = new int[][] {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        System.out.println(m.maxAreaOfIsland(arr));
    }

    public int maxAreaOfIsland(int[][] grid) {
        // 方向:上下左右
        int[][] direction = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        if (grid == null || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int area = 0;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                // 只要找到一个为1的岛屿 就把相连的岛屿全都找到并且计算面积和
                if (grid[i][j] == 1) {
                    Stack<int[]> stack = new Stack<>();
                    int singleArea = 1;
                    grid[i][j] = 0;
                    stack.push(new int[] {i, j});
                    while (!stack.isEmpty()) {
                        int[] arr = stack.pop();
                        for (int k = 0; k < 4; k++) {
                            int newI = arr[0] + direction[k][0];
                            int newJ = arr[1] + direction[k][1];
                            if (newI >= 0
                                    && newJ >= 0
                                    && newI < rowLength
                                    && newJ < colLength
                                    && grid[newI][newJ] == 1) {
                                singleArea++;
                                grid[newI][newJ] = 0;
                                stack.push(new int[] {newI, newJ});
                            }
                        }
                    }
                    area = Math.max(area, singleArea);
                }
            }
        }
        return area;
    }
}

// https://leetcode.cn/problems/Max-Area-Of-Island