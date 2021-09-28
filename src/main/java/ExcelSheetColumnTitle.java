import java.util.Stack;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
                System.out.println(e.convertToTitle(28));
                System.out.println(e.convertToTitle(701));
                System.out.println(e.convertToTitle(2147483647));
    }

    public String convertToTitle(int columnNumber) {
        Stack<Character> stack = new Stack<>();
        while (columnNumber != 0) {
            columnNumber -= 1;
            int remain = columnNumber % 26;
            stack.push((char)('A' + remain));
            columnNumber /= 26;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
