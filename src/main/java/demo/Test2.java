package demo;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(charAt("hello", 0));
    }

    private static int charAt(String s, int d) {
        if (d < s.length()) {
            return s.charAt(d);
        } else {
            return -1;
        }
    }


}
