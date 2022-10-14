public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
//        System.out.println(f.distance('j', 'c'));
//        System.out.println(f.distance('j', 'f'));
//        System.out.println(f.distance('j', 'j'));
        char[] letters = new char[]{'c','f','j'};
        char target = 'a';
        System.out.println(f.nextGreatestLetter(letters,target));
        target = 'c';
        System.out.println(f.nextGreatestLetter(letters,target));

        target = 'd';
        System.out.println(f.nextGreatestLetter(letters,target));

        target = 'g';
        System.out.println(f.nextGreatestLetter(letters,target));

        target = 'j';
        System.out.println(f.nextGreatestLetter(letters,target));

        target = 'k';
        System.out.println(f.nextGreatestLetter(letters,target));

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        char ans = letters[0];
        for (char c : letters) {
            if ( distance(c,target) < min) {
                min = distance(c,target);
                ans = c;
            }
        }
        return ans;
    }

    /**
     * 返回c2 在c1前面多少个字符
     *
     * @param c1
     * @param target
     * @return
     */
    int distance(char c1, char target) {
        int ans;
        if (c1 > target) {
            ans = c1 - target;
        } else {
            ans = ('z' - target) + (c1 - 'a') + 1;
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Find-Smallest-Letter-Greater-Than-Target