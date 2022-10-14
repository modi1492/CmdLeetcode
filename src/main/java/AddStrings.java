public class AddStrings {
    public static void main(String[] args) {
        AddStrings a = new AddStrings();
        System.out.println(a.addStrings("1","9"));
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i >= 0 && j >= 0){
            int sum0 = num1.charAt(i) - '0' + num2.charAt(j) - '0';
            int sum = (sum0 + carry) % 10;
            sb.append(sum);
            carry = (sum0 + carry) / 10;
            i--;
            j--;
        }
        while (i >= 0){
            int sum0 = num1.charAt(i) - '0';
            int sum = (sum0 + carry) % 10;
            sb.append(sum);
            carry = (sum0 + carry) / 10;
            i--;
        }
        while (j >= 0){
            int sum0 = num2.charAt(j) - '0';
            int sum = (sum0 + carry) % 10;
            sb.append(sum);
            carry = (sum0 + carry) / 10;
            j--;
        }
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
// https://leetcode.cn/problems/Add-Strings