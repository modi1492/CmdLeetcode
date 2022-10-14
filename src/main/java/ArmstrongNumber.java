public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        System.out.println(a.isArmstrong(153));
        ;
        System.out.println(a.isArmstrong(123));
        ;
    }

    public boolean isArmstrong(int N) {
        int num = N;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        int ans = 0;
        num = N;
        while (num != 0) {
            ans += Math.pow(num % 10, count);
            num /= 10;
        }
        return ans == N;
    }
}
// https://leetcode.cn/problems/Armstrong-Number