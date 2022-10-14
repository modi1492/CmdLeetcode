public class ValidSudoku {
    public static void main(String[] args) {
        char[] a0 = new char[]{'.', '.', '.', '.', '5', '.', '.', '1', '.'};
        char[] a1 = new char[]{'.', '4', '.', '3', '.', '.', '.', '.', '.'};
        char[] a2 = new char[]{'.', '.', '.', '.', '.', '3', '.', '.', '1'};
        char[] a3 = new char[]{'8', '.', '.', '.', '.', '.', '.', '2', '.'};
        char[] a4 = new char[]{'.', '.', '2', '.', '7', '.', '.', '.', '.'};
        char[] a5 = new char[]{'.', '1', '5', '.', '.', '.', '.', '.', '.'};
        char[] a6 = new char[]{'.', '.', '.', '.', '.', '2', '.', '.', '.'};
        char[] a7 = new char[]{'.', '2', '.', '9', '.', '.', '.', '.', '.'};
        char[] a8 = new char[]{'.', '.', '4', '.', '.', '.', '.', '.', '.'};
        char[][] arr = new char[][]{a0, a1, a2, a3, a4, a5, a6, a7, a8};
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(arr));
    }

    public boolean isValidSudoku(char[][] board) {
        // 按行遍历
        for (int i = 0; i < 9; i++) {
            int[] arr = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                arr[board[i][j] - 49] += 1;
                if (arr[board[i][j] - 49] > 1) {
                    return false;
                }
            }
        }
        //按列遍历
        for (int j = 0; j < 9; j++) {
            int[] arr = new int[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                arr[board[i][j] - 49] += 1;
                if (arr[board[i][j] - 49] > 1) {
                    return false;
                }
            }
        }
        // 按正方形遍历
        for (int a = 0; a < 9; a += 3) {
            for (int b = 0; b < 9; b += 3) {
                int[] arr = new int[9];
                for (int i = a; i < a + 3; i++) {

                    for (int j = b; j < b + 3; j++) {
                        if (board[i][j] == '.') {
                            continue;
                        }
                        arr[board[i][j] - 49] += 1;
                        if (arr[board[i][j] - 49] > 1) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
// https://leetcode.cn/problems/Valid-Sudoku