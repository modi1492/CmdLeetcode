public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        NumberOfSegmentsInAString n = new NumberOfSegmentsInAString();
        String s = "Hello, my name is John";
        System.out.println(n.countSegments(s));
    }

    /**
     * "Hello, my name is John"     5
     *
     * @param s
     * @return
     */
    public int countSegments(String s) {
        // 索引是否在单词之中
        boolean inWord = false;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 如果不在单词之中 且不为空格
            if (!inWord && c != ' ') {
                inWord = true;
                ans++;
            }
            // 遇到空格则不在单词之中
            if (c == ' ') {
                inWord = false;
            }
        }
        return ans;
    }
}