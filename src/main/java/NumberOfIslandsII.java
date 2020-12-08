import java.util.ArrayList;
import java.util.List;

public class NumberOfIslandsII {
    public static void main(String[] args) {

    }

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        char[][] grids = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grids[i][j] = '0';
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            int[] item = positions[i];
            int row = item[0];
            int col = item[1];
            grids[row][col] = '1';
            ans.add(numIslands(grids));
        }
        return ans;
    }

    public int numIslands(char[][] grid) {
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
                    if (i - 1 >= 0 && grid[i - 1][j] == '1') {
                        unionFind1.union(index, (i - 1) * col + j);
                    }
                    if (i + 1 < row && grid[i + 1][j] == '1') {
                        unionFind1.union(index, (i + 1) * col + j);
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == '1') {
                        unionFind1.union(index, i * col + j - 1);
                    }
                    if (j + 1 < col && grid[i][j + 1] == '1') {
                        unionFind1.union(index, i * col + j + 1);
                    }
                }
            }
        }
        return unionFind1.n;

    }

    static class UnionFind1 {
        // 元素的父节点
        public int[] parent;
        // 元素所在联通分量大小 只在根节点设置
        public int[] size;
        //联通分量的数量
        public int n;

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
                parent[p] = parent[parent[p]];//todo
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
            if (connected(p, q)) {
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


}