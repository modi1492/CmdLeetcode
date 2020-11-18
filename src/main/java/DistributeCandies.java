import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {

    }

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}