public class LeftRollString {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        LeftRollString l = new LeftRollString();
        System.out.println(l.reverseLeftWords(s1, 2));

        String s2 = "lrloseumgh";
        System.out.println(l.reverseLeftWords(s2, 6));
    }

    public String reverseLeftWords(String s, int n) {
        if (s == null) {
            return "";
        }
        String s1 = s.substring(0, n);
        String s2 = s.substring(n, s.length());
        return s2.concat(s1);
    }
}
