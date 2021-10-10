import java.util.Stack;

public class NumberOfProvinces {
    public static void main(String[] args) {
        NumberOfProvinces n = new NumberOfProvinces();
        int[][] arr = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(n.findCircleNum2(arr));
        arr = new int[][] {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        System.out.println(n.findCircleNum2(arr));
    }

    public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] isVisited = new boolean[provinces];
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (!isVisited[i]) {
                dfs(isConnected, i, isVisited);
                circles++;
            }
        }
        return circles;
    }

    void dfs(int[][] isConnected, int i, boolean[] isVisited) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !isVisited[j]) {
                isVisited[j] = true;
                dfs(isConnected, j, isVisited);
            }
        }
    }

    public int findCircleNum2(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] isVisited = new boolean[provinces];
        int circles = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < provinces; i++) {
            if (!isVisited[i]) {
                circles++;
                isVisited[i] = true;
                stack.push(i);
                while (!stack.isEmpty()) {
                    int pop = stack.pop();
                    for (int j = 0; j < provinces; j++) {
                        if (isConnected[pop][j] == 1 && !isVisited[j]) {
                            isVisited[j] = true;
                            stack.push(j);
                        }
                    }
                }
            }
        }
        return circles;
    }
}
