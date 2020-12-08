import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConfusingNumber {
    public static void main(String[] args) {
        ConfusingNumber c = new ConfusingNumber();
        System.out.println(c.confusingNumber(11));
    }

    public boolean confusingNumber(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 10);
            n /= 10;
        }
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        if (list.contains(2) || list.contains(3) || list.contains(4) || list.contains(5)
                || list.contains(7)) {
            return false;
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(rotate(list.get(i)));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list1.get(i)) {
                return true;
            }
        }
        return false;
    }

    int rotate(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 6:
                return 9;
            case 8:
                return 8;
            case 9:
                return 6;
            default:
                return -1;
        }
    }

}