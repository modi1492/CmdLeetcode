import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        NumberOfIslands n = new NumberOfIslands();
        char[][] grid = new char[][]{{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
//        System.out.println(n.numIslands(grid));
        grid = new char[][]{{'1', '1', '1', '1', '0'},
                            {'1', '1', '0', '1', '0'},
                            {'1', '1', '0', '0', '0'},
                            {'0', '0', '0', '0', '0'}};
        System.out.println(n.numIslands(grid));
    }

    /**
     * 广度优先搜索
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        // 从上到下 从左到右遍历 如果搜索到1 把1和1的邻居都置为0
        int rowNumber = grid.length;
        int colNumber = grid[0].length;
        int ans = 0;
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i * colNumber + j);
                    while (!queue.isEmpty()) {
                        Integer poll = queue.poll();
                        int r = poll / colNumber;
                        int c = poll % colNumber;
                        // 上下左右如果为1 都加入队列 并且设置为0
                        if (r - 1 >= 0 && grid[r - 1][c] == '1') {
                            queue.offer(colNumber * (r - 1) + c);
                            grid[r - 1][c] = '0';
                        }
                        if (r + 1 < rowNumber && grid[r + 1][c] == '1') {
                            queue.offer(colNumber * (r + 1) + c);
                            grid[r + 1][c] = '0';
                        }
                        if (c - 1 >= 0 && grid[r][c - 1] == '1') {
                            queue.offer(colNumber * r + c - 1);
                            grid[r][c - 1] = '0';
                        }
                        if (c + 1 < colNumber && grid[r][c + 1] == '1') {
                            queue.offer(colNumber * r + c + 1);
                            grid[r][c + 1] = '0';
                        }
                    }
                }
            }
        }
        return ans;
    }
}