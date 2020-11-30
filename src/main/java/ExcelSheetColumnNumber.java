public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        ExcelSheetColumnNumber e = new ExcelSheetColumnNumber();
        System.out.println(e.titleToNumber("AB"));
    }

    /**
     * "AB" 28   1 * 26^1 + 2 * 26^0
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int len = s.length();
        int step = 1;
        int ans = 0;
        for (int i = len - 1; i >= 0; i--) {
            ans += (s.charAt(i) - 64) * step;
            step *= 26;
        }
        return ans;
    }
}