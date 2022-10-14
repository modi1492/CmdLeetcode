import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        TwoSumIIInputArrayIsSorted t = new TwoSumIIInputArrayIsSorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(t.twoSum(numbers, target)));

        numbers = new int[]{2,3,4};
        target = 6;
        System.out.println(Arrays.toString(t.twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                break;
            }
        }
        return new int[] {i + 1, j + 1};
    }
}

// https://leetcode.cn/problems/Two-Sum-IIInput-Array-Is-Sorted