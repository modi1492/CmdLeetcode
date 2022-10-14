class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums1 = new int[]{3, 2, 2, 3};
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement.removeElement(nums1, 3));
        System.out.println(removeElement.removeElement(nums2, 2));
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != val) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        if (nums[0] == val) {
            for (int k = 1; k < nums.length; k++) {
                nums[k - 1] = nums[k];
            }
            i--;
        }
        return i + 1;
    }

}
// https://leetcode.cn/problems/Remove-Element