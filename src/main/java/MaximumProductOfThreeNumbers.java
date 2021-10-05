import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumProductOfThreeNumbers{
    public static void main(String[] args) {
        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        System.out.println(pq.poll());
    }

    public int maximumProduct(int[] nums) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        int nonZeroCount = 0;
        for(int item:nums){
            if(item != 0){
                nonZeroCount++;
            }
            pq.add(Math.abs(item));
        }
        if(nonZeroCount < 3){
            return 0;
        }

        return 0;
    }
}