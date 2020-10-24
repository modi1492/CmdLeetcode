import java.util.Arrays;

class D3sumClosest {
    public static void main(String[] args) {
        D3sumClosest d3sumClosest = new D3sumClosest();
        int[] nums = new int[]{-1, 2, 1, -4};    // -4 -1 1 2
        System.out.println(d3sumClosest.threeSumClosest(nums, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int length = nums.length;
        for (int first = 0; first < length; first++) {
            if (first != 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1;
            int third = length - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == target) {
                    ans = sum;
                    break;
                } else if (sum > target) {
                    third--;
                } else {
                    second++;
                }
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
