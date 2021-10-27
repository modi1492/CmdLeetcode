import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence c = new CanMakeArithmeticProgressionFromSequence();
        int[] nums = new int[] {3,5,1};
        System.out.println(c.canMakeArithmeticProgression(nums));
        nums = new int[]{1,2,4};
        System.out.println(c.canMakeArithmeticProgression(nums));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return false;
        }
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != difference) {
                return false;
            }
        }
        return true;
    }
}
