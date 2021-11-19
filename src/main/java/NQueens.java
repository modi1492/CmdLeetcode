import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NQueens {

    private List<List<String>> res = new ArrayList<>();
    private Stack<String> path = new Stack<>();

    public static void main(String[] args) {
        NQueens n = new NQueens();
        System.out.println(n.solveNQueens(4));
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n;j++){
                chessboard[i][j] = '.';
            }
        }
        backtracking(chessboard, 0);
        return res;
    }

    /**
     * 回溯棋盘
     *
     * @param chessboard
     * @param row
     */
    void backtracking(char[][] chessboard, int row) {
        if (path.size() == chessboard.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int col = 0; col < chessboard.length; col++) {
            if (isValid(row, col, chessboard)) {
                chessboard[row][col] = 'Q';
                path.push(String.valueOf(chessboard[row]));
                backtracking(chessboard, row + 1);
                chessboard[row][col] = '.';
                path.pop();
            }
        }
    }

    /**
     * 判断该位置能否放置皇后
     *
     * @param row
     * @param col
     * @param chessboard
     * @return
     */
    boolean isValid(int row, int col, char[][] chessboard) {
        int length = chessboard.length;
        // 如果该列有皇后
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        // 45度和135度populating
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row-1, j = col+1; i >= 0 && j < length; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
