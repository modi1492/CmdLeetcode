/**
 * 371. 两整数之和
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 * <p>
 * 两个数按位加：各位异或
 * 两个数按求进位：各位与然后左移一位
 * 当进位位0的时候停止 结果为和
 * 7 + 5 => 2 10 => 12, 0
 * <p>
 * 111 + 101 =>
 * 010  1010 => 1000 10 => 1010 0
 */
public class TwoIntegerSum {
    public static void main(String[] args) {
        TwoIntegerSum t = new TwoIntegerSum();
        System.out.println(t.getSum(2, 3));
    }

    // a是和 b是进位
    public int getSum(int a, int b) {
        while (b != 0) {
            int tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }
        return a;
    }
}
