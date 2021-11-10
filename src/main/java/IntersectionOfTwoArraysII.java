import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        IntersectionOfTwoArraysII i = new IntersectionOfTwoArraysII();
        int[] nums1 = new int[] {1, 2, 2, 1};
        int[] nums2 = new int[] {2, 2};
        System.out.println(Arrays.toString(i.intersect(nums1, nums2)));
        nums1 = new int[]{4,9,5};
        nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(i.intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        // nums2的长度大于nums1的长度
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }
        if (nums2.length < nums1.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums2.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
