public class ReverseOnlyLetters {
    public static void main(String[] args) {
        ReverseOnlyLetters r = new ReverseOnlyLetters();
//        System.out.println(r.reverseOnlyLetters("ab-cd"));
        System.out.println(r.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(r.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLetters(String S) {
        char[] charArr = new char[S.length()];
        int i = 0;
        int j = S.length() - 1;
        while (i <= j) {
            char first = S.charAt(i);
            char second = S.charAt(j);
            if (!(first >= 'A' && first <= 'Z' || first >= 'a' && first <= 'z')) {
                charArr[i] = first;
                i++;
                continue;
            }
            if (!(second >= 'A' && second <= 'Z' || second >= 'a' && second <= 'z')) {
                charArr[j] = second;
                j--;
                continue;
            }
            charArr[i] = second;
            charArr[j] = first;
            i++;
            j--;
        }
        return String.valueOf(charArr);
    }
}
// https://leetcode.cn/problems/Reverse-Only-Letters