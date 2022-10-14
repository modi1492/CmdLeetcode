import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        NumberOfIslands n = new NumberOfIslands();
        char[][] grid = new char[][]{{'1', '1', '0', '0', '0'},
                                     {'1', '1', '0', '0', '0'},
                                     {'0', '0', '1', '0', '0'},
                                     {'0', '0', '0', '1', '1'}};
        System.out.println(n.numIslands2(grid));
        grid = new char[][]{{'1', '1', '1', '1', '0'},
                            {'1', '1', '0', '1', '0'},
                            {'1', '1', '0', '0', '0'},
                            {'0', '0', '0', '0', '0'}};
        System.out.println(n.numIslands2(grid));




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

    public int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int num = grid.length * grid[0].length;
        int row = grid.length;
        int col = grid[0].length;
        UnionFind1 unionFind1 = new UnionFind1(num);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    int index = i * col + j;
                    unionFind1.union(index, index);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    // 上下左右有节点则连通
                    int index = i * col + j;
                    if(i-1 >=0 && grid[i-1][j] == '1'){
                        unionFind1.union(index, (i-1) * col + j);
                    }
                    if(i +1 < row && grid[i+1][j] == '1'){
                        unionFind1.union(index, (i+1) * col + j);
                    }
                    if(j - 1 >=0 && grid[i][j-1] == '1'){
                        unionFind1.union(index, i * col + j -1);
                    }
                    if(j + 1 < col && grid[i][j+1] == '1'){
                        unionFind1.union(index, i * col + j + 1);
                    }
                }
            }
        }
        return unionFind1.n;

    }

    static class UnionFind1 {
        // 元素的父节点
        private int[] parent;
        // 元素所在联通分量大小 只在根节点设置
        private int[] size;
        //联通分量的数量
        private int n;

        public UnionFind1(int n) {
            parent = new int[n];
            size = new int[n];
            this.n = 0;
            for (int i = 0; i < n; i++) {
                parent[i] = -1;
                size[i] = 0;
            }
        }


        int find(int p) {
            while (p != -1 && p != parent[p]) {
                p = parent[p];
            }
            return p;
        }

        boolean connected(int p, int q) {
            int i = find(p);
            int j = find(q);
            if (i == -1 || j == -1) {
                return false;
            }
            return i == j;
        }

        void union(int p, int q) {
            int i = find(p);
            int j = find(q);

            if (p == q) {
                parent[p] = p;
                size[p] = 1;
                this.n++;
                return;
            }
            if(connected(p,q)){
                return;
            }
            // 不能与空节点相连
            if (parent[i] == -1 || parent[j] == -1) {
                return;
            }
            if (size[i] < size[j]) {
                parent[i] = j;
                size[j] += size[i];
            } else {
                parent[j] = i;
                size[i] += size[j];
            }
            this.n--;
        }
    }

    static class UnionFind {

        // 元素的父节点
        private int[] parent;
        // 元素所在联通分量大小 只在根节点设置
        private int[] size;
        //联通分量的数量
        private int n;

        /**
         * 构造函数
         *
         * @param n
         */
        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            this.n = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }


        /**
         * 寻找一个元素所在联通分量的顶点
         *
         * @param p
         * @return
         */
        int find(int p) {
            while (parent[p] != p) {
                p = parent[p];
            }
            return p;
        }

        /**
         * 判断两个元素是否在同一个联通分量
         *
         * @param p
         * @param q
         * @return
         */
        boolean connected(int p, int q) {
            return find(p) == find(q);
        }


        /**
         * 将两个联通分量合并
         *
         * @param p
         * @param q
         */
        void union(int p, int q) {
            if (connected(p, q)) {
                return;
            }
            int i = find(p);
            int j = find(q);
            if (size[i] < size[j]) {
                parent[i] = j;
                size[j] += size[i];
            } else {
                parent[j] = i;
                size[i] += size[j];
            }
            n--;
        }

    }


}
// https://leetcode.cn/problems/Number-Of-Islands