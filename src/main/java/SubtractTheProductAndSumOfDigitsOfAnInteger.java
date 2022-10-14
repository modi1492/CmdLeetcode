public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger s = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        System.out.println(s.subtractProductAndSum(234));
        System.out.println(s.subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}
// https://leetcode.cn/problems/Subtract-The-Product-And-Sum-Of-Digits-Of-An-Integer