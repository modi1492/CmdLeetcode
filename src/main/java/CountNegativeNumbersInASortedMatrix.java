public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix c = new CountNegativeNumbersInASortedMatrix();
        int[][] arr = new int[][]{{1, -1}, {-1, -1}};
//        System.out.println(c.countNegatives(arr));
        arr = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(c.countNegatives(arr));
    }

    public int countNegatives(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int length = grid[0].length;
        return help(grid, length - 1, length - 1);
    }

    int help(int[][] grid, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (grid[i][j] >= 0) {
            return 0;
        }
        int ans = 1;
        ans += help(grid, i - 1, j);
        ans += help(grid, i, j - 1);
        return ans;
    }
}