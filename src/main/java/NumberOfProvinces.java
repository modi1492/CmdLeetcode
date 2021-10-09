public class NumberOfProvinces {
    public static void main(String[] args) {
        NumberOfProvinces n = new NumberOfProvinces();
        int[][] arr = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(n.findCircleNum(arr));
        arr = new int[][] {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        System.out.println(n.findCircleNum(arr));
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
}
