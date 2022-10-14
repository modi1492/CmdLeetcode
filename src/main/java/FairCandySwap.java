import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] args) {
        FairCandySwap f = new FairCandySwap();
        int[] arr1 = new int[]{1, 2, 5};
        int[] arr2 = new int[]{2, 4};
        System.out.println(Arrays.toString(f.fairCandySwap(arr1, arr2)));
    }

    /**
     * sumA -x +  y = sumB + x - y ------>      sumA - sumB + 2y = 2x ---> y = (2x -sumA + sumB) / 2
     *
     * @param A
     * @param B
     * @return
     */
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = sum(A);
        int sumB = sum(B);
        Set<Integer> set = new HashSet<>();
        for (int i : B) {
            set.add(i);
        }
        for (int i : A) {
            if (set.contains((2 * i - sumA + sumB) / 2)) {
                return new int[]{i, (2 * i - sumA + sumB) / 2};
            }
        }
        return new int[0];
    }

    private int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
// https://leetcode.cn/problems/Fair-Candy-Swap