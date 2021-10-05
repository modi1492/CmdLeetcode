public class UglyNumber {
    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        System.out.println(u.isUgly(6));
        System.out.println(u.isUgly(8));
        System.out.println(u.isUgly(14));
    }

    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        int[] nums = {2, 3, 5};
        for (int num : nums) {
            while (n % num == 0) {
                n /= num;
            }
        }
        return n == 1;
    }
}
