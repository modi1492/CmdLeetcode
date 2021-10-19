public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        int[] nums = new int[] {1, 1, 0, 1, 1, 1};
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOneNumber = 0;
        int oneNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneNumber++;
                if (oneNumber > maxOneNumber) {
                    maxOneNumber = oneNumber;
                }
            } else {
                oneNumber = 0;
            }
        }
        return maxOneNumber;
    }
}
