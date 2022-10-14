public class SumOfSquareNumbers {
    public static void main(String[] args) {
        SumOfSquareNumbers s = new SumOfSquareNumbers();
        int[] arr = new int[] {1000000};
        for (int i : arr) {
            System.out.println(s.judgeSquareSum(i));
        }
    }

    public boolean judgeSquareSum(int c) {
        long i = 0, j = c;
        while (i <= j) {
            long squareSum = i * i + j * j;
            if (squareSum > c) {
                j--;
            } else if (squareSum < c) {
                i++;
            } else {
                break;
            }
        }
        return i <= j;
    }
}

// https://leetcode.cn/problems/Sum-Of-Square-Numbers