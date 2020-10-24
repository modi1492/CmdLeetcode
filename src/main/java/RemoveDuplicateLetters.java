public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        RemoveDuplicateLetters rl = new RemoveDuplicateLetters();
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(rl.removeDuplicates2(nums1));
        System.out.println(rl.removeDuplicates2(nums2));

    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int arrlen = nums.length;
        for (int i = 1; i < arrlen; ) {
            if (nums[i] == nums[i - 1]) {
                arrlen--;
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
            } else {
                i++;
            }
        }
        return arrlen;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}