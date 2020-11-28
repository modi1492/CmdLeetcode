public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.help("1211"));
        System.out.println(countAndSay.countAndSay(4));
    }

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = help(s);
        }
        return s;
    }

    /**
     * 1211
     *
     * @param s
     * @return
     */
    private String help(String s) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                n++;
            } else {
                n++;
                sb.append(n);
                sb.append(s.charAt(i));
                n = 0;
            }
        }
        return sb.toString();
    }
}