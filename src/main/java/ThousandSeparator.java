public class ThousandSeparator {
    public static void main(String[] args) {
        ThousandSeparator t = new ThousandSeparator();
        System.out.println(t.thousandSeparator(987));
        System.out.println(t.thousandSeparator(1234));
        System.out.println(t.thousandSeparator(123456789));
        System.out.println(t.thousandSeparator(0));
    }

    public String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (n != 0) {
            i++;
            int remainder = n % 10;
            if ((i - 1) % 3 == 0 && i > 1) {
                sb.append('.');
            }
            sb.append(remainder);
            n /= 10;
        }
        sb.reverse();
        return sb.toString();
    }
}

// https://leetcode.cn/problems/Thousand-Separator