import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        RelativeSortArray r = new RelativeSortArray();
        System.out.println(Arrays.toString(r.relativeSortArray(arr1, arr2)));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr1) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        // 填充arr2中的元素
        for (int value : arr2) {
            int num = map.get(value);
            while (num > 0) {
                ans[index] = value;
                index++;
                num--;
            }
            //
            map.remove(value);
        }
        Set<Integer> set = map.keySet();
        int[] unExist = new int[set.size()];
        int i = 0;
        for (Integer item : set) {
            unExist[i] = item;
            i++;
        }
        Arrays.sort(unExist);
        for (Integer item : unExist) {
            int num = map.get(item);
            while (num > 0) {
                ans[index] = item;
                num--;
                index++;
            }
        }
        return ans;
    }
}