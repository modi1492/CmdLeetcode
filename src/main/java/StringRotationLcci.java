public class StringRotationLcci {
    public static void main(String[] args) {
        StringRotationLcci s = new StringRotationLcci();
        System.out.println(s.isFlipedString("waterbottle", "erbottlewat"));
    }

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s = s2 + s2;
        return s.contains(s1);
    }
}
