import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        KthLargestElementInAnArray k = new KthLargestElementInAnArray();
        int[] nums = new int[] {3, 2, 1, 5, 6, 4};
        System.out.println(k.findKthLargest(nums, 2));
        nums = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(k.findKthLargest(nums, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        Comparator<Integer> comparator =
                (o1, o2) -> (int) o2 - (int) o1;
        Integer[] integersNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integersNums));
        Arrays.sort(integersNums, comparator);
        return integersNums[k - 1];
    }
}

// https://leetcode.cn/problems/Kth-Largest-Element-In-An-Array