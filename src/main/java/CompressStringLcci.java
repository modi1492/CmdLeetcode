public class CompressStringLcci {
    public static void main(String[] args) {
        CompressStringLcci c = new CompressStringLcci();
        String s = "aabcccccaaa";
        System.out.println(c.compressString(s));
    }

    public String compressString(String S) {
        if(S == null || S.length() == 0){
            return "";
        }
        int[] num = new int[256];
        StringBuilder sb = new StringBuilder();
        char current = S.charAt(0);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == current) {
                num[c - 'A']++;
            } else {
                sb.append(current);
                sb.append(num[current - 'A']);
                num[current - 'A'] = 0;
                current = c;
                num[current - 'A']++;
            }
        }
        sb.append(current);
        sb.append(num[current - 'A']);
        String res = sb.toString();
        if (res.length() < S.length()) {
            return res;
        } else {
            return S;
        }
    }
}

// https://leetcode.cn/problems/Compress-String-Lcci