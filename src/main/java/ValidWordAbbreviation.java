public class ValidWordAbbreviation {
    public static void main(String[] args) {
        ValidWordAbbreviation v = new ValidWordAbbreviation();
        String s1 = "internationalization";
        String s2 = "i12iz4n";
        System.out.println(v.validWordAbbreviation(s1, s2));
        s1 = "apple";
        s2 = "a2e";
//        System.out.println(v.validWordAbbreviation(s1,s2));
        s1 = "hi";
        s2 = "1";
        System.out.println(v.validWordAbbreviation(s1, s2));
    }

    /**
     * 给定 s = "internationalization", abbr = "i12iz4n"      true
     *
     * @param word
     * @param abbr
     * @return
     */
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0; //单词
        int j = 0;  // 缩写
        // 如果是字母则对比字符是否相等
        while (j < abbr.length() ) {
            if (abbr.charAt(j) >= 'a' && abbr.charAt(j) <= 'z') {
                if(i >= word.length()){
                    return false;
                }
                if (word.charAt(i) != abbr.charAt(j)) {
                    return false;
                } else {
                    i++;
                    j++;
                    continue;
                }
            }
            //如果是数字则求出数字
            if (abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
                if (abbr.charAt(j) == '0') {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
                    sb.append(abbr.charAt(j));
                    j++;
                }

                int num = Integer.parseInt(sb.toString());
                // 单词前进(num+1)位
                i += num;
            }
        }
        return i <= word.length();
    }
}
// https://leetcode.cn/problems/Valid-Word-Abbreviation