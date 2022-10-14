import java.util.Stack;

public class AddBinary {
    public static void main(String[] args) {
        AddBinary a = new AddBinary();
        String s1 = "11";
        String s2 = "1001";
        System.out.println(a.addBinary(s1,s2));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        Stack<Character> stack = new Stack<>();
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int i1 = a.charAt(i) - '0' + b.charAt(j) - '0';
            int sum = (i1 + carry) % 2;
            carry = (i1 + carry) / 2;
            stack.push((char) ('0' + sum));
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = (a.charAt(i) - '0' + carry) % 2;
            carry = (a.charAt(i) - '0' + carry) / 2;
            stack.push((char) ('0' + sum));
            i--;
        }
        while (j >= 0) {
            int sum = (b.charAt(j) - '0' + carry) % 2;
            carry = (b.charAt(j) - '0' + carry) / 2;
            stack.push((char) ('0' + sum));
            j--;
        }
        if(carry != 0){
            stack.push('1');
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

// https://leetcode.cn/problems/Add-Binary