import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {
    public static void main(String[] args) {
        FindAnagramMappings f = new FindAnagramMappings();
        int[] a1 = new int[]{12, 28, 46, 32, 50};
        int[] b1 = new int[]{50, 12, 32, 46, 28};
        System.out.println(Arrays.toString(f.anagramMappings(a1, b1)));

    }

    public int[] anagramMappings(int[] A, int[] B) {
        if (A == null || B == null) {
            return new int[0];
        }
        int length = B.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(B[i], i);
        }
        int[] ans = new int[length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = map.get(A[i]);
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Find-Anagram-Mappings