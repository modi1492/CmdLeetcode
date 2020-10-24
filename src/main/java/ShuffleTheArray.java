import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        ShuffleTheArray s = new ShuffleTheArray();
        int[] nums1 = new int[]{2, 5, 1, 3, 4, 7};
        int[] nums2 = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int[] nums3 = new int[]{1, 1, 2, 2};
        System.out.println(Arrays.toString(nums1));


        System.out.println(Arrays.toString(s.shuffle(nums1, 3)));
        ;
        System.out.println(Arrays.toString(s.shuffle(nums2, 4)));
        ;
        System.out.println(Arrays.toString(s.shuffle(nums3, 3)));
        ;
    }

    public int[] shuffle(int[] nums, int n) {
        if (nums == null) {
            return new int[0];
        }
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0, j = 0; i < length / 2; i++) {
            ans[j] = nums[i];
            ans[j + 1] = nums[i + length / 2];
            j += 2;
        }
        return ans;
    }
}