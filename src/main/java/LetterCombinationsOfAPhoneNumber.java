import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    private List<String> res = new ArrayList<>();
    private Stack<Character> stack = new Stack<>();
    private String[] digitLetterMap =
            new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();
        String digits = "";
        List<String> res = l.letterCombinations(digits);
        System.out.println(res);
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return res;
        }
        backtracking(digits, 0);
        return res;

    }

    private void backtracking(String digits, int index) {
        if (stack.size() == digits.length()) {
            res.add(stack2String(stack));
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = digitLetterMap[digit];
        for (int i = 0; i < letters.length(); i++) {
            stack.push(letters.charAt(i));
            backtracking(digits, index + 1);
            stack.pop();
        }
    }

    String stack2String(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}

// https://leetcode.cn/problems/Letter-Combinations-Of-APhone-Number