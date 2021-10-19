import java.util.Stack;

/** https://leetcode-cn.com/problems/island-perimeter/ */
public class IslandPerimeter {
    public static void main(String[] args) {
        IslandPerimeter i = new IslandPerimeter();
        int[][] arr =
                new int[][] {
                    {0,1,0,0},
                    {1,1,1,0},
                    {0,1,0,0},
                    {1,1,0,0},
                };
        System.out.println(i.islandPerimeter(arr));
    }

    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int rowLen = grid.length;
        int colLen = grid[0].length;
        boolean[][] visited = new boolean[rowLen][colLen];
        // 右、下、左、上
        int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Stack<int[]> stack = new Stack<>();
        int perimeter = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (grid[i][j] != 0 && !visited[i][j] ) {
                    stack.push(new int[] {i, j});
                    visited[i][j] = true;
                    perimeter += squarePerimeter(grid, i, j);
                    while (!stack.isEmpty()) {
                        int[] pos = stack.pop();
                        for (int k = 0; k < 4; k++) {
                            int newI = pos[0] + directions[k][0];
                            int newJ = pos[1] + directions[k][1];
                            if (newI >= 0
                                    && newI < rowLen
                                    && newJ >= 0
                                    && newJ < colLen
                                    && grid[newI][newJ] == 1
                                    && !visited[newI][newJ]) {
                                stack.push(new int[] {newI, newJ});
                                visited[newI][newJ] = true;
                                perimeter += squarePerimeter(grid, newI, newJ);
                            }
                        }
                    }
                }
            }
        }
        return perimeter;
    }

    private int squarePerimeter(int[][] grid, int i, int j) {
        int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int perimeter = 4;
        for (int k = 0; k < 4; k++) {
            int newI = i + directions[k][0];
            int newJ = j + directions[k][1];
            if (newI >= 0
                    && newI < grid.length
                    && newJ >= 0
                    && newJ < grid[0].length
                    && grid[newI][newJ] == 1) {
                perimeter--;
            }
        }
        return perimeter;
    }
}
