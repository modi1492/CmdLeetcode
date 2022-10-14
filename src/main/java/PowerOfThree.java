import java.util.HashSet;
import java.util.Set;

public class PowerOfThree{
    public static void main(String[] args) {
        long a = 1;
        for(long i = 0; i < 20;i++){
            a *= 3;
            System.out.println(a);
        }
    }

    public boolean isPowerOfThree(int n) {
        if(n < 1){
            return false;
        }
        while (n %3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
// https://leetcode.cn/problems/Power-Of-Three