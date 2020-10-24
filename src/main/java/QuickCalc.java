public class QuickCalc {
    public static void main(String[] args) {
        QuickCalc q = new QuickCalc();
        System.out.println(q.calculate("AB"));

    }

    public int calculate(String s) {
        int x = 1;
        int y = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                x = 2 * x + y;
            }
            if (c == 'B') {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
