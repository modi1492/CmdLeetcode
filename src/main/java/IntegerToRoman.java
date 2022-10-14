public class IntegerToRoman {
    /**
     * I        1
     * IV       4
     * V        5
     * IX       9
     * X        10
     * XL       40
     * L        50
     * LC       90
     * C        100
     * CD       400
     * D        500
     * CM       900
     * M        1000
     *
     * @return
     */

    public String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public int[] integerNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static void main(String[] args) {

        IntegerToRoman integerToRoman = new IntegerToRoman();
        int[] arr = new int[]{3, 4, 9, 58, 1994};
        for (int i : arr) {
            System.out.println(integerToRoman.intToRoman(i));
        }
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < integerNum.length; i++) {
            while (num >= integerNum[i]) {
                sb.append(roman[i]);
                num -= integerNum[i];
            }
        }
        return sb.toString();
    }
}
// https://leetcode.cn/problems/Integer-To-Roman