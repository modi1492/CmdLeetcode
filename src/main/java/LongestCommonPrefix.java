public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//        String s = "abc";
//        System.out.println(s.substring(0,2));
        String[] strArray = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strArray));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = minLength(strs);
        int i = 0;
        for (; i < minLength; i++) {
            if (!isSame(strs, i)) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }

    boolean isSame(String[] strs, int i) {
        boolean ans = true;
        char c1 = strs[0].charAt(i);
        for (String s : strs) {
            if (s.charAt(i) != c1) {
                ans = false;
            }
        }
        return ans;
    }

    int minLength(String[] strs) {
        int ans = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < ans) {
                ans = s.length();
            }
        }
        return ans;
    }

}
