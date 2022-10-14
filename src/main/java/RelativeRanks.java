import java.util.PriorityQueue;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 8, 8, 2};
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > 3) {
                queue.poll();
            }
        }
        System.out.println(queue);
    }
}
// https://leetcode.cn/problems/Relative-Ranks