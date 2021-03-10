public class DetectCapital {
    public static void main(String[] args) {
        DetectCapital d = new DetectCapital();
        System.out.println(d.detectCapitalUse("USA"));
        System.out.println(d.detectCapitalUse("leetcode"));
        System.out.println(d.detectCapitalUse("Google"));
    }

    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isCapital(c)) {
                capitalCount++;
            }
        }
        if (capitalCount == 0 || capitalCount == word.length()) {
            return true;
        }
        return capitalCount == 1 && isCapital(word.charAt(0));
    }

    boolean isCapital(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
