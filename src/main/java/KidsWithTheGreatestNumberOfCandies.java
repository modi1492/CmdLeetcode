import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        KidsWithTheGreatestNumberOfCandies k = new KidsWithTheGreatestNumberOfCandies();

        System.out.println(k.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null) {
            return new ArrayList<>();
        }
        int max = Integer.MIN_VALUE;
        for (int value : candies) {
            if (value > max) {
                max = value;
            }
        }
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
// https://leetcode.cn/problems/Kids-With-The-Greatest-Number-Of-Candies