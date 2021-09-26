import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {}

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(
                arr,
                (x, y) -> {
                    long size_x = 10;
                    long size_y = 10;
                    while (size_x <= x) {
                        size_x *= 10;
                    }
                    while (size_y <= y) {
                        size_y *= 10;
                    }
                    long res = x * size_y + y - y * size_x - x;

                    return (int) res;
                });
        StringBuilder sb = new StringBuilder();
        for (int item : arr) {
            sb.append(item);
        }

        return sb.toString();
    }
}
