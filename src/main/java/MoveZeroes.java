import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int[] arr = new int[]{0,1,0,3,0,12};
        m.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 0,1,0,3,12
     * 0,1,0,3,0,12,13 = > 1,3,12,0,0,0   1移动1 3移动2  12移动3
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int zerocount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerocount++;
            } else {
                nums[i - zerocount] = nums[i];
            }
        }
        for (int i = nums.length - 1; i > nums.length - 1 - zerocount; i--) {
            nums[i] = 0;
        }
    }
}