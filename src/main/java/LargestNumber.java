import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {10, 2};
        LargestNumber l = new LargestNumber();
        System.out.println(l.largestNumber(nums));
    }

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "0";
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
                    long res = -x * size_y - y + y * size_x + x;

                    return (int) res;
                });
        if(arr[0] == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int item : arr) {
            sb.append(item);
        }

        return sb.toString();
    }
}
