public class ThousandSeparator{
    public static void main(String[] args) {
        ThousandSeparator t = new ThousandSeparator();
        int n = 987;
        System.out.println(t.thousandSeparator(n));
    }

    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0){
            int remainder = n % 10;
            sb.append(remainder);
            n /= 10;
        }
        sb.reverse();
        return sb.toString();
    }
}