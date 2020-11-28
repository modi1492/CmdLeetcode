public class NonDecreasingArray {
    public static void main(String[] args) {
        NonDecreasingArray n = new NonDecreasingArray();
        int[] arr = new int[]{4, 2, 3};
        System.out.println(n.checkPossibility(arr));
        arr = new int[]{4, 2, 1};
        System.out.println(n.checkPossibility(arr));
    }

    /**
     * 1 3 5 2 4 6
     * <p>
     * 1 3 5 2 7 9
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {
        if (nums == null) {
            return false;
        }
        if (nums.length <= 2) {
            return true;
        }
        int first = 0;
        int second = 1;
        int count = 0;
        while (second <= nums.length - 1) {
            if (nums[first] > nums[second]) {
                second++;
                count++;
            } else {
                first = second;
                second++;
            }
            if (count == 2) {
                return false;
            }
        }
        return true;
    }
}