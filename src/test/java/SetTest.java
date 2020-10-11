import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        boolean first = set.add(1);
        boolean second = set.add(2);
        boolean third = set.add(1);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
