import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix s = new SpiralMatrix();
        int[][] nums = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(s.spiralOrder(nums));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix[0] == null || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右、下、左、上
        int count = rowLength * colLength;
        List<Integer> res = new ArrayList<>();
        int directionIndex = 0;
        int rowIndex = 0;
        int colIndex = 0;
        boolean[][] visited = new boolean[rowLength][colLength];
        for (int i = 0; i < count; i++) {
            res.add(matrix[rowIndex][colIndex]);
            visited[rowIndex][colIndex] = true;
            int nextRowIndex = rowIndex + directions[directionIndex][0];
            int nextColIndex = colIndex + directions[directionIndex][1];
            if (nextRowIndex < 0
                    || nextRowIndex >= rowLength
                    || nextColIndex < 0
                    || nextColIndex >= colLength
                    || visited[nextRowIndex][nextColIndex]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            rowIndex += directions[directionIndex][0];
            colIndex += directions[directionIndex][1];
            System.out.println(rowIndex);
            System.out.println(colIndex);
        }
        return res;
    }
}

// https://leetcode.cn/problems/Spiral-Matrix