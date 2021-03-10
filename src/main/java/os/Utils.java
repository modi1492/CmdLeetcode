package os;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
    /**
     * 将整数转换成有32个二进制数的列表
     *
     * @param x
     * @return
     */
    public static List<Integer> toBinary(int x, int y) {
        String s1 = Integer.toBinaryString(x);
        String[] split = s1.split("");
        List<Integer> ans = new ArrayList<>();
        for(String s : split){
            ans.add(Integer.parseInt(s));
        }
        if(ans.size() < y){
            int size = y - ans.size();
            for(int i = 0; i < size; i++){
                ans.add(0,0);
            }
        }
        return ans;
    }

    /**
     * 110 -> 6
     * @param list
     * @return
     */
    public static String binaryString2HexString(List<Integer> list) {
        int sum = 0;
        int pow = 1;
        Collections.reverse(list);
        for(Integer i : list){
            sum += i * pow;
            pow *= 2;
        }
        return Integer.toHexString(sum);
    }

    public static Integer binaryString2Decimal(List<Integer> list) {
        int sum = 0;
        int pow = 1;
        Collections.reverse(list);
        for(Integer i : list){
            sum += i * pow;
            pow *= 2;
        }
        Collections.reverse(list);
        return sum;
    }
}
