public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.isLetter('-'));
        System.out.println(l.lengthOfLastWord("Hello World"));
        System.out.println(l.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(l.lengthOfLastWord("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (isLetter(s.charAt(i))) {
                count++;
                i--;
                break;
            }

            i--;
        }
        while (i >= 0 && isLetter(s.charAt(i))) {
            count++;
            i--;
        }
        return count;
    }

    private boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}

// https://leetcode.cn/problems/Length-Of-Last-Word