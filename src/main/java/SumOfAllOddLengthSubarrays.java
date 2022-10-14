public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 5, 3};
        SumOfAllOddLengthSubarrays s = new SumOfAllOddLengthSubarrays();
        System.out.println(s.sumOddLengthSubarrays(arr));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int maxOdd;
        if (arr.length % 2 == 0) {
            maxOdd = arr.length - 1;
        } else {
            maxOdd = arr.length;
        }
        int sum = 0;
        for (int odd = 1; odd <= maxOdd; odd += 2) {
            int left = 0, right = left + odd - 1;
            int sum1 = 0;
            for (int i = left; i <= right; i++) {
                sum1 += arr[i];
            }
            sum += sum1;
            while (right < arr.length - 1) {
                sum1 = sum1 - arr[left];
                left++;
                right++;
                sum1 = sum1 + arr[right];
                sum += sum1;
            }
        }
        return sum;
    }
}
// https://leetcode.cn/problems/Sum-Of-All-Odd-Length-Subarrays