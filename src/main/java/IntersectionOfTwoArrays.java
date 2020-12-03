import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        int count = 0;
        for (Integer item : set1) {
            if (set2.contains(item)) {
                count++;
            }
        }
        int[] ans = new int[count];
        int index = 0;
        for (Integer item : set1) {
            if (set2.contains(item)) {
                ans[index++] = item;
            }
        }
        return ans;
    }
}