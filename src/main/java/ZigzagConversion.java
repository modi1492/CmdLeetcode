import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        ZigzagConversion z = new ZigzagConversion();
        System.out.println(z.convert(s, 3));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int rowCount = Math.min(numRows, s.length());
        List<StringBuilder> rowList = new ArrayList<StringBuilder>();
        for (int i = 0; i < rowCount; i++) {
            rowList.add(new StringBuilder());
        }
        boolean godown = false;
        int rowNum = 0;
        for (char ch : s.toCharArray()) {
            rowList.get(rowNum).append(ch);
            if (rowNum == 0 || rowNum == rowCount - 1) {
                godown = !godown;
            }
            rowNum += godown ? 1 : -1;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : rowList) {
            ans.append(sb);
        }
        return ans.toString();
    }
}

// https://leetcode.cn/problems/Zigzag-Conversion