public class FindTheTownJudge {
    public static void main(String[] args) {

    }

    /**
     * 法官的出度为0 入度为n-1
     *
     * @param n
     * @param trust
     * @return
     */
    public int findJudge(int n, int[][] trust) {
        if (trust == null) {
            return -1;
        }
        int[] outDegree = new int[n];
        int[] inDegree = new int[n];
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            outDegree[a - 1]++;
            inDegree[b - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0 && inDegree[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}