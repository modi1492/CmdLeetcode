import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        // 1,2,3,4 => 2,4,4,4
        DecompressRunLengthEncodedList d = new DecompressRunLengthEncodedList();
        int[] nums = new int[]{42, 39};
        System.out.println(Arrays.toString(d.decompressRLElist(nums)));
    }

    public int[] decompressRLElist(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        int[] ans = new int[length];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int count = nums[i];
            for (int j = 0; j < count; j++) {
                ans[index++] = nums[i + 1];
            }
        }
        return ans;
    }
}