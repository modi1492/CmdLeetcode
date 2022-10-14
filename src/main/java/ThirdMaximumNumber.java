import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        //        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //        pq.add(1);
        //        pq.add(1);
        //        System.out.println(pq.size());
        ThirdMaximumNumber t = new ThirdMaximumNumber();
        int[] nums = new int[] {3, 2, 1};
        //                System.out.println(t.thirdMax(nums));
        nums = new int[] {1, 2};
        //                System.out.println(t.thirdMax(nums));
        nums = new int[] {-2147483648, 1, 1};
        System.out.println(t.thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        Comparator<Integer> comparator =
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                };
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        for (int num : nums) {
            pq.add(num);
        }
        Stack<Integer> stack = new Stack<>();
        while (stack.size() < 3 && pq.size() > 0) {
            Integer ele = pq.remove();
            if (!stack.contains(ele)) {
                stack.push(ele);
            }
        }
        if (stack.size() == 3) {
            return stack.pop();
        } else {
            while (stack.size() > 1) {
                stack.pop();
            }
            return stack.pop();
        }
    }
}

// https://leetcode.cn/problems/Third-Maximum-Number