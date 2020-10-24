public class FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits f = new FindNumbersWithEvenNumberOfDigits();
        int[]nums = new int[]{12,345,2,6,7896};
//        System.out.println(f.evenNumberOfDigits(22344));
        System.out.println(f.findNumbers(nums));
    }

    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (evenNumberOfDigits(num)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean evenNumberOfDigits(int num){
        int count = 0;
        while (num != 0){
            count += 1;
            num /= 10;
        }
        return count % 2 == 0;
    }
}