import java.util.Arrays;

public class KMinNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        System.arraycopy(arr, 0, ans, 0, k);
        return ans;
    }
}
