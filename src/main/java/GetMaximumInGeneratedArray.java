public class GetMaximumInGeneratedArray {
    public static void main(String[] args) {
        GetMaximumInGeneratedArray g = new GetMaximumInGeneratedArray();
        System.out.println(g.getMaximumGenerated(7));
        System.out.println(g.getMaximumGenerated(2));
        System.out.println(g.getMaximumGenerated(3));
    }

    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 1; i * 2 < n; i++) {
            arr[i * 2] = arr[i];
            arr[i * 2 + 1] = arr[i] + arr[i + 1];
        }
        int max = Integer.MIN_VALUE;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
