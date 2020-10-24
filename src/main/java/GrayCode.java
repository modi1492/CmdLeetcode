import java.util.ArrayList;
import java.util.List;

/**
 * 3位
 * 0        000
 * 1        001
 * 3        011
 * 2        010
 * 6        110
 * 7        111
 * 5        101
 * 4        100
 */
class GrayCode {
    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();
        System.out.println(grayCode.grayCode(3));
    }

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>() {{
            add(0);
        }};
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--)
                res.add(head + res.get(j));
            head <<= 1;
        }
        return res;
    }
}

