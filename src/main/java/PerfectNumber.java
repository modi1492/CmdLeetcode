public class PerfectNumber{
    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();
        System.out.println(p.checkPerfectNumber(28));
        System.out.println(p.checkPerfectNumber(6));
        System.out.println(p.checkPerfectNumber(496));
        System.out.println(p.checkPerfectNumber(2));
    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i < num;i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
// https://leetcode.cn/problems/Perfect-Number