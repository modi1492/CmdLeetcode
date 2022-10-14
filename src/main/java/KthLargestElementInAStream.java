import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/** https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/ */
public class KthLargestElementInAStream {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(4);
        List<Integer> lst = new ArrayList<>();
        while (pq.size() > 0) {
            lst.add(pq.remove());
        }
        System.out.println(lst);
    }

    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        Comparator<Integer> comparator =
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                };
        pq = new PriorityQueue<Integer>(comparator);
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.remove();
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.remove();
        }
        List<Integer> lst = new ArrayList<>();
        while (!pq.isEmpty()) {
            lst.add(pq.remove());
        }

        return lst.get(k - 1);
    }
}

// https://leetcode.cn/problems/Kth-Largest-Element-In-AStream