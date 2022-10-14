public class RotateString {
    public static void main(String[] args) {
        RotateString r = new RotateString();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(r.rotateString(s,goal));
        s = "abcde";
        goal = "abced";
        System.out.println(r.rotateString(s,goal));
        s = "";
        goal = "";
        System.out.println(r.rotateString(s,goal));
    }

    public boolean rotateString(String s, String goal) {
        if(s.equals("") && goal.equals("")){
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal)) {
                return true;
            }
            s = rotate(s);
        }
        return false;
    }

    private String rotate(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb.append(s.charAt(0));
        return sb.toString();
    }
}

// https://leetcode.cn/problems/Rotate-String