public class LargestOddNumberInString {
    public static void main(String[] args) {
        LargestOddNumberInString l = new LargestOddNumberInString();
        System.out.println(l.largestOddNumber("52"));
                System.out.println(l.largestOddNumber("4206"));
                System.out.println(l.largestOddNumber("35427"));
    }

    public String largestOddNumber(String num) {
        if (num == null || num.length() == 0) {
            return "";
        }
        char[] nums = num.toCharArray();
        int i = num.length() - 1;
        while (i >= 0 && nums[i] % 2 == 0) {
            i--;
        }
        if (i < 0) {
            return "";
        }
        return num.substring(0, i + 1);
    }
}
