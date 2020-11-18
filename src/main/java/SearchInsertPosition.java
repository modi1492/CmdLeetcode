public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(s.searchInsert(nums, 5));
        System.out.println(s.searchInsert(nums, 2));
        System.out.println(s.searchInsert(nums, 7));
        System.out.println(s.searchInsert(nums, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (target <= nums[i]) {
                return i;
            } else {
                i++;
            }
        }
        return i;
    }
}